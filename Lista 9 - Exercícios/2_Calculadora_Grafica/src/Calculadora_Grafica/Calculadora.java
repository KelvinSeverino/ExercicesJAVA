package Calculadora_Grafica;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Calculadora extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton j1, j2, j3, j4;
	public JLabel label1;
	
	public Calculadora()
	{
		super("Calculadora");
		Container c = getContentPane();
		c.setLayout(new GridLayout(0,4));
		j1 = new JButton("Somar");
		j2 = new JButton("Subtrair");
		j3 = new JButton("Multiplicar");
		j4 = new JButton("Dividir");
		label1 = new JLabel("");
		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);
		j4.addActionListener(this);
		c.add(j1);
		c.add(j2);
		c.add(j3);
		c.add(j4);
		c.add(label1);	
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try
		{
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("N1: "));
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("N2: "));
			if(e.getSource() == j1)
			{
				JOptionPane.showMessageDialog(null, "Resultado: " + (n1 + n2));
			}
			if(e.getSource() == j2)
			{
				JOptionPane.showMessageDialog(null, "Resultado: " + (n1 - n2));
			}
			if(e.getSource() == j3)
			{
				JOptionPane.showMessageDialog(null, "Resultado: " + (n1 * n2));
			}
			if(e.getSource() == j4)
			{
				JOptionPane.showMessageDialog(null, "Resultado: " + (n1 / n2));
			}
		}
		catch (ArithmeticException e2)
		{
			JOptionPane.showMessageDialog(null, "ERROR! Impossível Dividir por ZERO!\n" + e2);
		}
		catch (NumberFormatException e3)
		{
			JOptionPane.showMessageDialog(null, "ERROR! Insira somente Números!\n" + e3);
		}		
	}
}
