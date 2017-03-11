package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class VentanaNuevoUsuario extends JFrame implements datosDesplegables{
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public VentanaNuevoUsuario(boolean creando) {
		getContentPane().setLayout(null);
	    getContentPane().setBackground(new Color(188,255,193));
	    
	    JLabel lblNuevoUsuario = new JLabel("Nuevo Usuario");
	    lblNuevoUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNuevoUsuario.setBounds(161, 13, 101, 29);
	    getContentPane().add(lblNuevoUsuario);
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setBounds(12, 48, 56, 16);
	    getContentPane().add(lblNombre);
	    
	    textField = new JTextField();
	    textField.setBounds(80, 45, 116, 22);
	    getContentPane().add(textField);
	    textField.setColumns(10);
	    
	    JLabel lblGnero = new JLabel("G\u00E9nero:");
	    lblGnero.setBounds(12, 77, 56, 16);
	    getContentPane().add(lblGnero);
	    
	    JLabel lblEdad = new JLabel("Edad:");
	    lblEdad.setBounds(12, 106, 56, 16);
	    getContentPane().add(lblEdad);
	    
	    textField_1 = new JTextField();
	    textField_1.setBounds(80, 103, 64, 22);
	    getContentPane().add(textField_1);
	    textField_1.setColumns(10);
	    
	    JLabel lblPeso = new JLabel("Peso(kg):");
	    lblPeso.setBounds(156, 107, 56, 16);
	    getContentPane().add(lblPeso);
	    
	    textField_2 = new JTextField();
	    textField_2.setColumns(10);
	    textField_2.setBounds(213, 103, 64, 22);
	    getContentPane().add(textField_2);
	    
	    JLabel lblAltura = new JLabel("Altura(cm):");
	    lblAltura.setBounds(289, 107, 67, 16);
	    getContentPane().add(lblAltura);
	    
	    textField_3 = new JTextField();
	    textField_3.setColumns(10);
	    textField_3.setBounds(356, 103, 64, 22);
	    getContentPane().add(textField_3);
	    
	    JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
	    rdbtnNewRadioButton.setBounds(80, 73, 127, 25);
	    getContentPane().add(rdbtnNewRadioButton);
	    
	    JRadioButton rdbtnMujer = new JRadioButton("Mujer");
	    rdbtnMujer.setBounds(240, 73, 127, 25);
	    getContentPane().add(rdbtnMujer);
	    
	    JComboBox cbintolerancias= new JComboBox();
	    cbintolerancias.setBounds(90, 132, 31, 22);
	    getContentPane().add(cbintolerancias);
	    
	    JLabel lblNewLabel = new JLabel("Intolerancias");
	    lblNewLabel.setBounds(12, 135, 78, 16);
	    getContentPane().add(lblNewLabel);
	    
	    JLabel lblEnfermedades = new JLabel("Enfermedades:");
	    lblEnfermedades.setBounds(261, 135, 95, 16);
	    getContentPane().add(lblEnfermedades);
	    
	    JCheckBox chckbxNewCheckBox = new JCheckBox("Diabetes");
	    chckbxNewCheckBox.setBounds(261, 160, 113, 25);
	    getContentPane().add(chckbxNewCheckBox);
	    
	    JCheckBox chckbxCelaco = new JCheckBox("Cel\u00EDaco");
	    chckbxCelaco.setBounds(261, 202, 113, 25);
	    getContentPane().add(chckbxCelaco);
	    
	    JComboBox cbgustos = new JComboBox();
	    cbgustos.setBounds(90, 167, 31, 22);
	    getContentPane().add(cbgustos);
	    
	    JLabel lblNewLabel_1 = new JLabel("Gustos");
	    lblNewLabel_1.setBounds(12, 169, 56, 16);
	    getContentPane().add(lblNewLabel_1);
	    for (int i=0; i<intolerancias.length; i++){
	    
	    	cbintolerancias.addItem(intolerancias[i]);
	    }
	    
	    if (creando) {
	    	//JButton abajo a la izquierda que pida imagen para el usuario
	    }
	    else {
	    	//JLabel arriba a la derecha sin texto y con icono de usuario
	    }
	    
	    
	}
}
