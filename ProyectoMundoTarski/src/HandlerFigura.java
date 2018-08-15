import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class HandlerFigura {
	
	int noFig;
	ArrayList <Figura> figura;
	Color[] color = {Color.red, Color.green, Color.blue};
	
	public HandlerFigura()
	{
		 figura = new ArrayList<Figura>();
		 noFig = 0;
		 iniciaTarski();
		 generaTarski();
	}
	
	public void iniciaTarski()
	{
		for (int fila = 1; fila < 8; fila ++)
		{
			for(int columna = 1; columna < 8; columna ++)
			{
				Figura f = new Vacia((fila -1) * 100, (columna -1 ) * 100, Color.BLACK);
				figura.add(f);
			}
		}
	}
	
	public void generaTarski()
	{
		Random r = new Random();
		int posibleRandom;
		int lugarRandom;
		
		while (noFig < 20)
		{
			lugarRandom = r.nextInt(figura.size());
			Figura temp = figura.get(lugarRandom);
			if (temp instanceof Vacia)
			{
				posibleRandom = r.nextInt(2);
				
				if (posibleRandom == 0)
				{
					figura.set(lugarRandom,
							new Cuadrado(
									figura.get(lugarRandom).getX(),
									figura.get(lugarRandom).getY(),
									color[r.nextInt(color.length)]));
				}
				
				else if (posibleRandom == 1)
				{
					figura.set(lugarRandom,
							new Circulo(
									figura.get(lugarRandom).getX(),
									figura.get(lugarRandom).getY(),
									color[r.nextInt(color.length)]));
				}
				noFig++;
			}
		}
	}
	
	public void paint(Graphics g)
	{
		for (Figura f: figura)
		{
			f.paint(g);
		}
	}
	
	public void removerTodo()
	{
		this.figura.clear();
	}
	
	public void addFigura(Figura figura)
	{
		this.figura.add(figura);
	}
	
	public void removeFigura(Figura figura)
	{
		this.figura.remove(figura);
	}
	
	public int getVerdes()
	{
		int verdes = 0;
		for (Figura f: figura)
		{
			if (f.getColor().equals(Color.green)) verdes++;
		}
		return verdes;
	}
	
	public int getAzules()
	{
		int azules = 0;
		for (Figura f: figura)
		{
			if (f.getColor().equals(Color.blue)) azules++;
		}
		return azules;
	}
	
	public int getRojos()
	{
		int rojos = 0;
		for (Figura f: figura)
		{
			if (f.getColor().equals(Color.red)) rojos++;
		}
		return rojos;
	}
	
	public int getCuadrados()
	{
		int cuadrados = 0;
		
		for (Figura f: figura)
		{
			if (f instanceof Cuadrado) cuadrados++;
		}
		
		return cuadrados;
	}
	
	public int getCirculos()
	{
		int circulos = 0;
		
		for (Figura f: figura)
		{
			if (f instanceof Circulo) circulos++;
		}
		
		return circulos;
	}
	
	public int getCuadradosVerdes()
	{
		int cuadrados = 0;
		
		for (Figura f: figura)
		{
			if (f instanceof Cuadrado)
			{
				if (f.getColor().equals(Color.green)) cuadrados++;
			}
		}
		
		return cuadrados;
	}
	
	public int getCuadradosAzules()
	{
		int cuadrados = 0;
		
		for (Figura f: figura)
		{
			if (f instanceof Cuadrado)
			{
				if (f.getColor().equals(Color.blue)) cuadrados++;
			}
		}
		
		return cuadrados;
	}
	
	public int getCuadradosRojos()
	{
		int cuadrados = 0;
		
		for (Figura f: figura)
		{
			if (f instanceof Cuadrado)
			{
				if (f.getColor().equals(Color.red)) cuadrados++;
			}
		}
		
		return cuadrados;
	}
	
	public int getCirculosVerdes()
	{
		int circulos = 0;
		
		for (Figura f: figura)
		{
			if (f instanceof Circulo)
			{
				if (f.getColor().equals(Color.green)) circulos++;
			}
		}
		
		return circulos;
	}
	
	public int getCirculosAzules()
	{
		int circulos = 0;
		
		for (Figura f: figura)
		{
			if (f instanceof Circulo)
			{
				if (f.getColor().equals(Color.blue)) circulos++;
			}
		}
		
		return circulos;
	}
	
	public int getCirculosRojos()
	{
		int circulos = 0;
		
		for (Figura f: figura)
		{
			if (f instanceof Circulo)
			{
				if (f.getColor().equals(Color.red)) circulos++;
			}
		}
		
		return circulos;
	}
	
	public boolean cuadradoDerechaDeCirculo()
	{
		double circleX = 0;
		for(Figura f: figura)
		{
			if (f instanceof Circulo)
			{
				if (f.getX() < circleX)
				{
					circleX = f.getX();
				}
			}
		}
		
		for (Figura f: figura)
		{
			if (f instanceof Cuadrado)
			{
				if (f.getX() > circleX)
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean circuloBajoCuadrado()
	{
		
		double cuadradoY = 0;
		
		for (Figura f: figura)
		{
			if (f instanceof Cuadrado)
			{
				cuadradoY= f.getY();
				break;
			}
		}
		
		for (Figura f: figura)
		{
			if (f instanceof Circulo)
			{
				if (f.getY() > cuadradoY)
				{
					return true;
				}
			}
		}
		
		return false;
	}
}
