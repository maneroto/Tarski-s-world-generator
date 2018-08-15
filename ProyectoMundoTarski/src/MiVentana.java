import java.awt.Dimension;

import javax.swing.JFrame;

public class MiVentana extends JFrame{
	
	private static final long serialVersionUID = -544819107964443146L;

	public static int width, height;
	
	public static void main(String[]args)
	{
		int width = 705;
		int height = 730;
		int scale = 1;
		new MiVentana("Mundo de Tarski", width * scale, height * scale);
		new VentanaTexto("Mundo de Tarski", width * scale, height * scale);
	}
	
	public MiVentana(String title, int width, int height)
	{
		MiVentana.width = width;
		MiVentana.height = height;
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(new MiCanvas());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
