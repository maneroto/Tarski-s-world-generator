import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Figura {

	private static final long serialVersionUID = -1456745490652594628L;

	public Circulo(double x, double y, Color color) {
		super(x, y, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		
		int x1, y1;
		x1 = (int)x + 7;
		y1 = (int)y + 7;
		
		g.setColor(Color.BLACK);
		g.drawRect((int)x, (int)y, width + 20, height + 20);
		g.setColor(color);
		g.fillOval(x1, y1, width, height);
		
	}

}
