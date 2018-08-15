import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado extends Figura{
	
	private static final long serialVersionUID = 494046315734224976L;

	public Cuadrado(double x, double y, Color color) {
		super(x, y, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		
		int x1, y1;
		x1 = (int)x + 10;
		y1 = (int)y + 10;
		g.setColor(Color.BLACK);
		g.drawRect((int)x, (int)y, width + 20, height + 20);
		g.setColor(color);
		g.fillRect(x1, y1, width, height);
		
	}

}
