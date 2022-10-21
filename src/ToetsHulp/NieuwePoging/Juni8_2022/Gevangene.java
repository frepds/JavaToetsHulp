package ToetsHulp.NieuwePoging.Juni8_2022;

// code voor opgave 4
//
public class Gevangene {

	public String naam = "?";
	public int straf = 0; //  duur van de gevangenisstraf in jaren

	public Gevangene(String n) { naam = n; }

	public void geefStraf(int wachtwoord, int straf) {
		if (this.straf < 0) { // straf moet altijd >= 0 zijn.
			straf = 0;
		} else {
			this.straf = straf;
		}
	}

	public void verminder(int wachtwoord) {
		straf--;
	}

	// deze methode mag niet veranderd worden
	public boolean isVrij() {
		return straf <= 0;
	}
}
