package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Bebidas extends JFrame {
	public Bebidas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alvaro\\Desktop\\HackForGood\\Icono principaldpm.png"));
			getContentPane().setBackground(new Color(188, 255, 193));
			getContentPane().setLayout(null);
			setVisible(true);
			setEnabled(true);
			setBounds(12, 48, 450, 400);
			
			JLabel lblBebidas = new JLabel("Bebidas");
			lblBebidas.setFont(new Font("Dialog", Font.BOLD, 14));
			lblBebidas.setBounds(167, 13, 173, 16);
			getContentPane().add(lblBebidas);
	}

}
