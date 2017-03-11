package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class FrutasyVerduras extends JFrame {
	public FrutasyVerduras() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alvaro\\Desktop\\HackForGood\\Icono principaldpm.png"));
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		setVisible(true);
		setEnabled(true);
		setBounds(12, 48, 450, 400);
		
		JLabel lblFrutasYVerduras = new JLabel("Frutas y verduras");
		lblFrutasYVerduras.setFont(new Font("Dialog", Font.BOLD, 14));
		lblFrutasYVerduras.setBounds(149, 13, 173, 16);
		getContentPane().add(lblFrutasYVerduras);
	}
	

}
