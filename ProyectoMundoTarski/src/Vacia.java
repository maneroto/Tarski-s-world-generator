import java.awt.Color;
import java.awt.Graphics;

public class Vacia extends Figura{
	
	private static final long serialVersionUID = 7969347404145888843L;

	public Vacia(double x, double y, Color color) {
		super(x, y, color);
		// TODO Auto-generated constructor stub
		width = 100;
		height = 100;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.drawRect(getX(), getY(), width, height);
	}


	
}
