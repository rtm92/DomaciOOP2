package apps;

public class Webapps {
	private String naziv;
	private int velicinaMB;
	private double verzija;
	private boolean jePokrenut;
	
	public Webapps(String naziv, int velicinaMB, double verzija, boolean jePokrenut) {
		this.velicinaMB = velicinaMB;
		this.verzija = verzija;
		this.naziv = naziv;
		
		
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getVelicinaMB() {
		return velicinaMB;
	}

	public void setVelicinaMB(int velicinaMB) {
		this.velicinaMB = velicinaMB;
	}

	public double getVerzija() {
		return verzija;
	}

	public void setVerzija(double verzija) {
		this.verzija = verzija;
	}

	public boolean isJePokrenut() {
		return jePokrenut;
	}

	public void setJePokrenut(boolean jePokrenut) {
		this.jePokrenut = jePokrenut;
	}
}
	