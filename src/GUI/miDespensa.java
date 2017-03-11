package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class miDespensa extends JFrame{
	public miDespensa() {
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		
		JLabel lblMiDespensa = new JLabel("Mi Despensa");
		lblMiDespensa.setFont(new Font("Dialog", Font.BOLD, 14));
		lblMiDespensa.setBounds(162, 13, 118, 16);
		getContentPane().add(lblMiDespensa);
		
		JButton btnNewButton = new JButton("Grasas y az\u00FAcares");
		btnNewButton.setBounds(80, 55, 272, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnLegumbresYProductos = new JButton("Legumbres y productos de origen animal");
		btnLegumbresYProductos.setBounds(80, 103, 272, 25);
		getContentPane().add(btnLegumbresYProductos);
		
		JButton btnFrutasYVerduras = new JButton("Frutas y verduras");
		btnFrutasYVerduras.setBounds(80, 154, 272, 25);
		getContentPane().add(btnFrutasYVerduras);
		
		JButton btnNewButton_1 = new JButton("Cereales y tub\u00E9rculos");
		btnNewButton_1.setBounds(80, 200, 272, 25);
		getContentPane().add(btnNewButton_1);
	}
}
