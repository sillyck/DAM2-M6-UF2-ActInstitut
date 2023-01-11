
public class Alumno {
	
	private String nombre;
	private String dni;
	

	public Alumno(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
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

	public char[] verAsignaturas() {
		return null;
	}

	public String verNotaAsignatura(String modul) {
		return null;
	}

	public char[] verInforme() {
		return null;
	}

}
