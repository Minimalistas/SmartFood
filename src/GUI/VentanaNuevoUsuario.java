package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import packageDefault.Usuario;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class VentanaNuevoUsuario extends JFrame implements datosDesplegables {

	private JTextField textFNombre;
	private JTextField textFEdad;
	private JTextField textFPeso;
	private JTextField textFAltura;
	private JLabel lblNuevoUsuario;
	private ButtonGroup grupo;
	private JLabel lblNombre;
	private JLabel lblGnero;
	private JLabel lblEdad;
	private JLabel lblPeso;
	private JLabel lblAltura;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JComboBox cbintolerancias;
	private JLabel lblNewLabel;
	private JLabel lblEnfermedades;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxCelaco;
	private JComboBox cbgustos;
	private JLabel lblNewLabel_1;
	private JButton bot_Img;
	private JLabel img_Prelim;

	public VentanaNuevoUsuario(boolean creando) {
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(188, 255, 193));

		lblNuevoUsuario = new JLabel("Nuevo Usuario");
		lblNuevoUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNuevoUsuario.setBounds(161, 13, 101, 29);
		getContentPane().add(lblNuevoUsuario);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(12, 48, 56, 16);
		getContentPane().add(lblNombre);

		textFNombre = new JTextField();
		textFNombre.setBounds(80, 45, 116, 22);
		getContentPane().add(textFNombre);
		textFNombre.setColumns(10);

		lblGnero = new JLabel("G\u00E9nero:");
		lblGnero.setBounds(12, 77, 56, 16);
		getContentPane().add(lblGnero);

		lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(12, 106, 56, 16);
		getContentPane().add(lblEdad);

		textFEdad = new JTextField();
		textFEdad.setBounds(80, 103, 64, 22); ///////////
		getContentPane().add(textFEdad);
		textFEdad.setColumns(10);

		lblPeso = new JLabel("Peso(kg):");
		lblPeso.setBounds(156, 107, 56, 16);
		getContentPane().add(lblPeso);

		textFPeso = new JTextField();
		textFPeso.setColumns(10);
		textFPeso.setBounds(213, 103, 64, 22);
		getContentPane().add(textFPeso);

		lblAltura = new JLabel("Altura(cm):");
		lblAltura.setBounds(289, 107, 67, 16);
		getContentPane().add(lblAltura);

		textFAltura = new JTextField();
		textFAltura.setColumns(10);
		textFAltura.setBounds(356, 103, 64, 22);
		getContentPane().add(textFAltura);

		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setBounds(80, 73, 127, 25);
		getContentPane().add(rdbtnHombre);

		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(240, 73, 127, 25);
		getContentPane().add(rdbtnMujer);
		grupo = new ButtonGroup();
		grupo.add(rdbtnHombre);
		grupo.add(rdbtnMujer);

		cbintolerancias = new JComboBox();
		cbintolerancias.setBounds(90, 132, 31, 22);
		getContentPane().add(cbintolerancias);

		lblNewLabel = new JLabel("Intolerancias");
		lblNewLabel.setBounds(12, 135, 78, 16);
		getContentPane().add(lblNewLabel);

		lblEnfermedades = new JLabel("Enfermedades:");
		lblEnfermedades.setBounds(261, 135, 95, 16);
		getContentPane().add(lblEnfermedades);

		chckbxNewCheckBox = new JCheckBox("Diabetes");
		chckbxNewCheckBox.setBounds(261, 160, 113, 25);
		getContentPane().add(chckbxNewCheckBox);

		chckbxCelaco = new JCheckBox("Cel\u00EDaco");
		chckbxCelaco.setBounds(261, 202, 113, 25);
		getContentPane().add(chckbxCelaco);

		cbgustos = new JComboBox();
		cbgustos.setBounds(90, 167, 31, 22);
		getContentPane().add(cbgustos);

		lblNewLabel_1 = new JLabel("Gustos");
		lblNewLabel_1.setBounds(12, 169, 56, 16);
		getContentPane().add(lblNewLabel_1);
		for (int i = 0; i < intolerancias.length; i++) {

			cbintolerancias.addItem(intolerancias[i]);
		}

		if (creando) {
			bot_Img = new JButton("Cargar imagen");
			bot_Img.setBounds(12, 250, 50, 20);
			getContentPane().add(bot_Img);
		} else {
			// JLabel arriba a la derecha sin texto y con icono de usuario
			img_Prelim = new JLabel();
			img_Prelim.setBounds(250, 30, 30, 40);
			getContentPane().add(img_Prelim);
		}

	}

	public void recibirDatos(Usuario usuario) {

		textFNombre.setText(usuario.getNombre());
		textFEdad.setText(Integer.toString(usuario.getEdad()));
		textFPeso.setText(Double.toString(usuario.getPeso()));
		textFAltura.setText(Double.toString(usuario.getAltura()));
		if (usuario.getGenero()) {
			rdbtnHombre.setSelected(true);
		}
		else {
			rdbtnMujer.setSelected(true);
		}
		img_Prelim.setIcon(usuario.getImagen());
		
	}

}
