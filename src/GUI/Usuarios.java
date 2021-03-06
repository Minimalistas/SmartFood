package GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.*;

import packageDefault.ClaseMainSF;
import packageDefault.Usuario;


public class Usuarios extends JFrame  {
	
	JLabel lblUsuario;
	JLabel lblImg;
	JScrollPane scrllPaneUsuarios;
	
	public Usuarios() {
		
		getContentPane().setBackground(new Color(188, 255, 193));
		getContentPane().setLayout(null);
		setEnabled(true);
		setVisible(true);
		setBounds(200, 150, 470, 350);
		
		lblUsuario = new JLabel("Usuarios");
		lblUsuario.setFont(new Font("Dialog", Font.BOLD, 14));
		lblUsuario.setBounds(173, 13, 76, 16);
		getContentPane().add(lblUsuario);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(new File("").getAbsolutePath() + "\\sanddib128.png"));
		lblImg.setBounds(265, 69, 177, 200);
		getContentPane().add(lblImg);
		
		scrllPaneUsuarios = new JScrollPane();
		scrllPaneUsuarios.setBounds(25, 52, 211, 187);
		getContentPane().add(scrllPaneUsuarios);
		
		ArrayList<Usuario> listaUsuarios = ClaseMainSF.gestorUsuarios.getUsuarios();
		for (int i=0; i<listaUsuarios.size(); i++) {
			scrllPaneUsuarios.add(new JLabel(""));
			((JLabel) scrllPaneUsuarios.getComponent(scrllPaneUsuarios.getComponentCount()-1)).setIcon(listaUsuarios.get(i).getImagen());
			((JLabel) scrllPaneUsuarios.getComponent(scrllPaneUsuarios.getComponentCount()-1)).setBounds(10, 10+87*i, 69, 62);
			((JLabel) scrllPaneUsuarios.getComponent(scrllPaneUsuarios.getComponentCount()-1)).setVisible(true);
			((JLabel) scrllPaneUsuarios.getComponent(scrllPaneUsuarios.getComponentCount()-1)).setEnabled(true);
			((JLabel) scrllPaneUsuarios.getComponent(scrllPaneUsuarios.getComponentCount()-1)).addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					VentanaNuevoUsuario ventMostrarUsuario = new VentanaNuevoUsuario(false);
					ventMostrarUsuario.recibirDatos(listaUsuarios.get((obtenerIndiceControl(((JLabel)e.getSource())))/2));
				}
				public void mouseEntered(MouseEvent e) {
					
				}
				public void mouseExited(MouseEvent e) {
					
				}
				public void mousePressed(MouseEvent e) {
					
				}
				public void mouseReleased(MouseEvent e) {
					
				}
				
			});
			scrllPaneUsuarios.add(new JButton(listaUsuarios.get(i).getNombre()));
			((JButton) scrllPaneUsuarios.getComponent(scrllPaneUsuarios.getComponentCount()-1)).setBounds(118, 32+87*i, 86, 24);
			((JButton) scrllPaneUsuarios.getComponent(scrllPaneUsuarios.getComponentCount()-1)).setVisible(true);
			((JButton) scrllPaneUsuarios.getComponent(scrllPaneUsuarios.getComponentCount()-1)).setEnabled(true);
			((JButton) scrllPaneUsuarios.getComponent(scrllPaneUsuarios.getComponentCount()-1)).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VentanaNuevoUsuario ventMostrarUsuario = new VentanaNuevoUsuario(false);
					ventMostrarUsuario.recibirDatos(listaUsuarios.get((obtenerIndiceControl(((JButton)e.getSource()))-1)/2));
				}
				
			});
		}
	}
	
	@SuppressWarnings("null")
	private int obtenerIndiceControl(JComponent comp) {
		
		int indice;
		
		for (int i=0; i<scrllPaneUsuarios.getComponentCount(); i++) {
			if (scrllPaneUsuarios.getComponent(i).equals(comp)) {
				return i;
			}
		}
		
		return (Integer) null;
		
	}
	
}
