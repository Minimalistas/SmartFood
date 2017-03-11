package packageDefault;
import java.io.File;
import java.io.FileNotFoundException;
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
			boolean[] intolerancias, boolean[] gustos) {
		listaUsuarios.add(new Usuario(nombre, genero, edad, altura, peso, enfermedades, intolerancias, gustos));
	}
	
	public void leerArchivo() {
		try {
			Scanner lectorArchivo = new Scanner(archivoUsuarios);
		} catch (FileNotFoundException e) {
			
		}
		
		/*for () {
			
			
			addUsuario(todos los datos del usuario)
		}*/
		
	}
	
	public ArrayList<Usuario> getUsuarios() {
		return listaUsuarios;
	}

}
