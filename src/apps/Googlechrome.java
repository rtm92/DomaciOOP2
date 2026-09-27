package apps;

public class Googlechrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Webapps Google_Chrome = new Webapps("Google Chrome", 500, 123.0, true);
		System.out.println("Naziv - " + Google_Chrome.getNaziv());
		
		Google_Chrome.setVerzija(123.1);
		
		System.out.println("Verzija - " + Google_Chrome.getVerzija());

	}

}
