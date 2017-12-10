package FormasRetangulares;

import javax.swing.JFrame;
import FormasRetangulares.MeuPainel;

public class FormasRetangulares {
	public static void main(String args[])
	{
		MeuPainel mp = new MeuPainel();
		JFrame janela = new JFrame("Título");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 400);
		janela.setVisible(true);
		janela.getContentPane();
		janela.add(mp);
	}
}
