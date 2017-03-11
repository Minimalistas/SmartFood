package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Usuarios extends JFrame  {
	public Usuarios() {
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuarios");
		lblUsuario.setFont(new Font("Dialog", Font.BOLD, 14));
		lblUsuario.setBounds(173, 13, 76, 16);
		getContentPane().add(lblUsuario);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Alvaro\\Desktop\\HackForGood\\sanddib128.png"));
		label.setBounds(265, 69, 177, 200);
		getContentPane().add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(227, 218, -176, -151);
		getContentPane().add(scrollPane);
		
	}
}
