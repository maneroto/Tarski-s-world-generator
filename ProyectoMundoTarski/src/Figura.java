import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura extends Canvas {
	
	private static final long serialVersionUID = -2147833086855893922L;
	
	protected int width;
	protected int height;
	protected double x;
	protected double y;
	protected Color color;
	
	public Figura(double x, double y, Color color)
	{
		width = 80;
		height = 80;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public abstract void paint(Graphics g);
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getX()
	{
		return (int)x;
	}
	
	public int getY()
	{
		return (int)y;
	}
	
	public Color getColor()
	{
		return color;
	}
}
