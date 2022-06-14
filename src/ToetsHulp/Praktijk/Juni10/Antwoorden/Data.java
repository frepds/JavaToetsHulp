package ToetsHulp.Praktijk.Juni10.Antwoorden;

public class Data
{
	private String naam;
	private String adres;

	public Data(String naam, String adres) {
		if (naam != null && naam.length() > 1 && !naam.equals("??")) {
			this.naam = naam;
		} else {
			this.naam = "onbekend";
		}
		this.adres = adres;
	}
	
	public String getNaam() { return this.naam; }

	public String getAdres() { return this.adres; }

	public String toString() { return naam + " (" + adres + ")"; }


	// vb code uit de toets
	public static void demo_tostring() {
		Data d = new Data("Wilco", "0800-JAVA");
		System.out.println(d);
		Data d2 = new Data("??", "ergens");
		System.out.println(d2);
	}
}