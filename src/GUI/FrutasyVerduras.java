package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class FrutasyVerduras extends JFrame {
	public FrutasyVerduras() {
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		
		JLabel lblFrutasYVerduras = new JLabel("Frutas y verduras");
		lblFrutasYVerduras.setFont(new Font("Dialog", Font.BOLD, 14));
		lblFrutasYVerduras.setBounds(149, 13, 173, 16);
		getContentPane().add(lblFrutasYVerduras);
	}
	

}
