package packageDefault;

import javax.swing.ImageIcon;

public class Usuario {
	String nombre;
	Boolean genero; // True= Hombre, False=Mujer
	int edad;
	double altura;
	double peso;
	boolean[] enfermedades;
	boolean[] intolerancias;
	boolean[] gustos;
	ImageIcon fotoPerfil;
	
	public Usuario(String nombre, Boolean genero, int edad, double altura, double peso, boolean[] enfermedades,
			boolean[] intolerancias, boolean[] gustos, String foto) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.enfermedades = enfermedades;
		this.intolerancias = intolerancias;
		this.gustos = gustos;
		fotoPerfil = new ImageIcon(foto);
	}

	public String getNombre() {
		return nombre;
	}

	public Boolean getGenero() {
		return genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean[] getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(boolean[] enfermedades) {
		this.enfermedades = enfermedades;
	}

	public boolean[] getIntolerancias() {
		return intolerancias;
	}

	public void setIntolerancias(boolean[] intolerancias) {
		this.intolerancias = intolerancias;
	}
	
	public ImageIcon getImagen() {
		return fotoPerfil;
	}

	public boolean[] getGustos() {
		return gustos;
	}

}
