package packageDefault;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorUsuario {

	ArrayList<Usuario> listaUsuarios;
	File archivoUsuarios;

	public GestorUsuario() {
		listaUsuarios = new ArrayList<Usuario>();
		archivoUsuarios = new File(new File("").getAbsolutePath() + "\\archivoUsuarios");
	}

	public void addUsuario(Usuario nuevoUsuario) {
		listaUsuarios.add(nuevoUsuario);
	}

	public void addUsuario(String nombre, Boolean genero, int edad, double altura, double peso, boolean[] enfermedades,
			boolean[] intolerancias, boolean[] gustos, String rutaImagen) {
		listaUsuarios.add(new Usuario(nombre, genero, edad, altura, peso, enfermedades, intolerancias, gustos, rutaImagen));
	}

	public void leerArchivo() {
		try {
			Scanner lectorArchivo = new Scanner(archivoUsuarios);
			lectorArchivo.useDelimiter(" , ");
			while (lectorArchivo.hasNext()) {
				String nombre = lectorArchivo.next();
				boolean genero = Boolean.parseBoolean(lectorArchivo.next());
				int edad = Integer.parseInt(lectorArchivo.next());
				double altura = Double.parseDouble(lectorArchivo.next());
				
				double peso = Double.parseDouble(lectorArchivo.next());
				boolean[] enfermedades = new boolean[2];
				for (int i = 0; i < enfermedades.length; i++) {
					enfermedades[i] = Boolean.parseBoolean(lectorArchivo.next());

				}
				boolean[] intolerancias= new boolean[3];
				for (int i = 0; i <= intolerancias.length; i++) {
					intolerancias[i] = Boolean.parseBoolean(lectorArchivo.next());

				}
				boolean[]gustos= new boolean[3];
				for (int i = 0; i <= gustos.length; i++) {
					gustos[i] = Boolean.parseBoolean(lectorArchivo.next());

				}
				String ruta = lectorArchivo.nextLine();
				addUsuario(nombre,genero,edad,altura, peso,enfermedades,intolerancias,gustos, ruta);
			}
				lectorArchivo.close();
			
		} catch (FileNotFoundException e) {

		}

	}

	public void actualizarArchivo() {
		
		try {
			PrintWriter pw = new PrintWriter(archivoUsuarios);
			for (int i=0; i<listaUsuarios.size(); i++) {
				pw.print(listaUsuarios.get(i).getNombre() + " , ");
				pw.print(listaUsuarios.get(i).getGenero() + " , ");
				pw.print(listaUsuarios.get(i).getAltura() + " , ");
				pw.print(listaUsuarios.get(i).getPeso() + " , ");
				for (int j=0; j<2; j++) {
					pw.print(listaUsuarios.get(i).getEnfermedades()[j] + " , ");
				}
				for (int j=0; j<3; j++) {
					pw.print(listaUsuarios.get(i).getIntolerancias()[j] + " , ");
				}
				for (int j=0; j<3; j++) {
					pw.print(listaUsuarios.get(i).getGustos()[j] + " , ");
				}
				pw.println(listaUsuarios.get(i).getImagen().toString());
			}
			
		} catch (FileNotFoundException e) {
			
		}
		
	}
	
	public ArrayList<Usuario> getUsuarios() {
		return listaUsuarios;
	}

}
