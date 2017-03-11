package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class miDespensa extends JFrame{
	public miDespensa() {
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		setVisible(true);
		setEnabled(true);
		setBounds(12, 48, 450, 400);
		
		JLabel lblMiDespensa = new JLabel("Mi Despensa");
		lblMiDespensa.setFont(new Font("Dialog", Font.BOLD, 14));
		lblMiDespensa.setBounds(162, 13, 118, 16);
		getContentPane().add(lblMiDespensa);
		
		JButton botonGrasasAzucares = new JButton("Grasas y az\u00FAcares");
		botonGrasasAzucares.setBounds(80, 55, 272, 25);
		getContentPane().add(botonGrasasAzucares);
		botonGrasasAzucares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				grasasYAzucares ventanaGrasasAzucares= new grasasYAzucares();
			}
		});
		
		
		JButton botonLegumbresAnimal = new JButton("Legumbres y productos de origen animal");
		botonLegumbresAnimal.setBounds(80, 103, 272, 25);
		getContentPane().add(botonLegumbresAnimal);
		botonGrasasAzucares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LegumbresYProductosAnimales ventanaLegumbres= new LegumbresYProductosAnimales();
			}
		});
		
		JButton botonFrutasVerduras = new JButton("Frutas y verduras");
		botonFrutasVerduras.setBounds(80, 154, 272, 25);
		getContentPane().add(botonFrutasVerduras);
		botonGrasasAzucares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrutasyVerduras ventanaFrutasVerduras= new FrutasyVerduras();
			}
		});
		
		JButton botonCerealesTuberculos = new JButton("Cereales y tub\u00E9rculos");
		botonCerealesTuberculos.setBounds(80, 200, 272, 25);
		getContentPane().add(botonCerealesTuberculos);
		botonGrasasAzucares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				grasasYAzucares ventanaGrasasAzucares= new grasasYAzucares();
			}
		});
	}
}
