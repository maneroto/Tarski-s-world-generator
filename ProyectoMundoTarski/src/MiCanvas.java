import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class MiCanvas extends Canvas{

	private static final long serialVersionUID = -547223419501837399L;
	
	public static HandlerFigura hf;
	public static final int WIDTH = 700;
	public static final int HEIGHT = 700;
	Figura f;
	
	public MiCanvas()
	{
		super();
		setSize(new Dimension(WIDTH, HEIGHT));
		//f = new Cuadrado(0,0, Color.red);
		hf = new HandlerFigura();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		hf.paint(g);
	}
}
