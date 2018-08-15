import java.awt.Dimension;

import javax.swing.JFrame;

public class VentanaTexto extends JFrame{
	private static final long serialVersionUID = 2329358042490318701L;
	public static int width, height;
	
	public VentanaTexto(String title, int width, int height)
	{
		VentanaTexto.width = width;
		VentanaTexto.height = height;
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(new Texto());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
