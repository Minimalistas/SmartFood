package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bebidas extends JFrame {
	public Bebidas() {
			getContentPane().setBackground(new Color(188, 255, 193));
			getContentPane().setLayout(null);
			
			JLabel lblBebidas = new JLabel("Bebidas");
			lblBebidas.setFont(new Font("Dialog", Font.BOLD, 14));
			lblBebidas.setBounds(167, 13, 173, 16);
			getContentPane().add(lblBebidas);
	}

}
