import java.util.ArrayList;

public class Instituto {

	private String nombre;
	private ArrayList<Profesor> profesores = new ArrayList();
	private ArrayList<Alumno> alumnos = new ArrayList();
	private ArrayList<Curso> curso = new ArrayList();
	private ArrayList<Assignatura> assignatura = new ArrayList();
	
	
	public Instituto(String nombre) {
		this.nombre = nombre;
	}

	public void crearProfesor(String nombre, String dni) {
		profesores.add(new Profesor(nombre, dni));
	}

	public void crearAlumno(String nombre, String dni) {
		alumnos.add(new Alumno(nombre, dni));
	}
	
	public void crearCurso(String curs, String nombre) {
		curso.add(new Curso(curs, nombre));
	}
	
	public void crearAsignatura(String modul, String nom, int hores, String ubicacion) {
		assignatura.add(new Assignatura(modul, nom, hores, ubicacion));
	}
	
	
	//Getters i Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public ArrayList<Curso> getCurso() {
		return curso;
	}

	public void setCurso(ArrayList<Curso> curso) {
		this.curso = curso;
	}

}
