import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.lang.System;
public class Texto extends Canvas{

	private static final long serialVersionUID = 3927719430552287109L;
	
	String a = "\u2200";
	String e = "\u2203";
	HandlerFigura hf;
	public static final String title = "Bienvenido al Mundo de Tarski de";
	public static final String autor1 = "Emmanuel Antonio Ramírez Herrera";
	public static final String autor2 = "Alonso Oropeza Arévalos";
	
	public String[] sentencias = 
		{
				"1. Para toda figura f, cuadrado (f)",
				"2.	Para toda figura f, circulo (f)",
				"3.	Para todo cuadrado x perteneciente a figuras y Para todo circulo y perteneciente a figuras, cantidad(x)>cantidad(y)",
				"4.	Para todo cuadrado x perteneciente a figuras y Para todo circulo y perteneciente a figuras, cantidad(y)>cantidad(x)",
				"5.	Para algun circulo y, y debajo de cuadrado x",
				"6.	Para algun cuadrado x, x a la derecha de circulo y",
				"7.	Para toda figura f, mismoColor (f)",
				"8.	Para todo cuadrado x perteneciente a figuras, mismoColor(x)",
				"9.	Para algun cuadrado x perteneciente a figuras, verde(x)",
				"10. Para algun cuadrado x perteneciente a figuras, rojo(x)",
				"11. Para algun cuadrado x perteneciente a figuras, azul(x)",
				"12. Para algun circulo y perteneciente a figuras, verde(y)",
				"13. Para algun circulo y perteneciente a figuras, rojo(y)",
				"14. Para algun circulo y perteneciente a figuras, azul(y)", 
				"15. Para algun figura f, triangulo (f)"
		}
	;
	public String espaciado = "                   ";
	public boolean[] respuestas = new boolean[sentencias.length];
	Font titleF = new Font("Cursive", Font.ITALIC, 20);
	Font sentencia = new Font("Arial", Font.PLAIN, 15);
	
	public Texto()
	{
		super();
		setSize(new Dimension(700,700));
		hf = MiCanvas.hf;
		evaluar();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.setFont(titleF);
		g.drawString(title, 200, 25);
		g.drawString(autor1, 190, 55);
		g.drawString("y", 330, 85);
		g.drawString(autor2, 230, 115);
		g.setFont(sentencia);
		for (int i = 0; i < sentencias.length; i ++)
		{
			g.drawString(sentencias[i] + espaciado + respuestas[i], 100, (160 + i * 35));
		}
	}
	
	public void evaluar()
	{
		if (hf.getCuadrados() == 20) respuestas[0] = true;
		if (hf.getCirculos() == 20) respuestas[1] = true;
		if (hf.getCuadrados() > hf.getCirculos()) respuestas[2] = true;
		if (hf.getCirculos() > hf.getCuadrados()) respuestas[3] = true;
		if (hf.circuloBajoCuadrado()) respuestas[4] = true;
		if (hf.cuadradoDerechaDeCirculo()) respuestas[5] = true;
		if (hf.getAzules() == 20 || hf.getRojos() == 20 || hf.getVerdes() == 20) respuestas[6] = true;
		if (hf.getCuadradosAzules() == hf.getCuadrados() ||hf.getCuadradosVerdes() == hf.getCuadrados() || hf.getCuadradosRojos() == hf.getCuadrados()) respuestas[7] = true;
		if (hf.getCuadradosVerdes() > 0) respuestas[8] = true;
		if (hf.getCuadradosRojos() > 0) respuestas[9] = true;
		if (hf.getCuadradosAzules() > 0) respuestas[10] = true;
		if (hf.getCirculosVerdes() > 0) respuestas[11] = true;
		if (hf.getCirculosRojos() > 0) respuestas[12] = true;
		if (hf.getCirculosAzules() > 0) respuestas[13] = true;
		respuestas[14] = false;
	}
	
}
