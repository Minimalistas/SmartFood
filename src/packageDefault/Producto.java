package packageDefault;
import java.util.Date;

public class Producto {

	private String nombre;
	private int codBarr;
	private Date fechaCad;
	private int Calorias;
	
	public Producto(String nombre) {
		
		this.nombre = nombre;
		//aqui se tiene que conectar con la base de datos y pedir los datos que le faltan
		
	}
	
	public Producto(int codBarr) {
		
		this.codBarr = codBarr;
		//aqui se tiene que conectar con la base de datos y pedir los datos que le faltan
		
	}
	
	public double calcDiasHastaCad() {
		return Math.floor((fechaCad.getTime() - System.currentTimeMillis())/ (1000 * 60 * 60 * 24));
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
