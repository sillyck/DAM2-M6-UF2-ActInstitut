import java.util.ArrayList;

public class Profesor {
	
	private String dni;
	private String nombre;

	public Profesor(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void ponerNota(String modulo, String dni, double nota) {
		
	}

	public char[] verHoras() {
		return null;
	}

	public char[] verAsignaturas() {
		return null;
	}
	
	

}
