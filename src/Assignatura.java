
public class Assignatura {
	private String modul;
	private String nom;
	private int hores;
	private String ubicacion;

	public Assignatura(String modul, String nom, int hores, String ubicacion) {
		this.modul = modul;
		this.nom = nom;
		this.hores = hores;
		this.ubicacion = ubicacion;
	}

	public String getModul() {
		return modul;
	}

	public void setModul(String modul) {
		this.modul = modul;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHores() {
		return hores;
	}

	public void setHores(int hores) {
		this.hores = hores;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

}
