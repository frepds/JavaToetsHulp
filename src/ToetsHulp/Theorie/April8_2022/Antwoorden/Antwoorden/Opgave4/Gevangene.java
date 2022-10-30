package ToetsHulp.Theorie.April8_2022.Antwoorden.Antwoorden.Opgave4;

public class Gevangene
{
	private String naam = "?";
	private int straf; // duur van de gevangenisstraf in jaren


	public Gevangene(String naam) { this.naam = naam; }

    // b vraag: kan ook opgelost worden door getters voor naam en straf toe te voegen.
	public Gevangene(Gevangene x) {
		this.naam = x.naam;
		this.straf = x.straf;
	}

	public String toString() { return naam + " (straf: " + straf+ ")"; }


	private boolean eersteKeer = true; //atr. nodig om te detecteren of straf voor het eerst veranderd wordt, of niet.

	public void geefStraf(int wachtwoord, int straf) {
		// superbeveiligd! Alleen te wijzigen met juiste code:
		if (wachtwoord == 1234567 && eersteKeer) {
			if(straf < 0) {			// hier checken op de input, niet op attribuut this.straf, want dat is het attribuut dat op dit moment nog op 0 staat.
				this.straf = 0;
			}
			else {
				this.straf = straf;
				eersteKeer = false;
			}
		}
		else {
			System.out.println("mag niet!");
		}
	}
	

	public void verminder(int wachtwoord) {
		// superbeveiligd! Alleen te wijzigen met juiste code:
		if(wachtwoord == 1234567) {
			straf--;
			if(straf < 0) { straf = 0; }
		}
		else {
			System.out.println("mag niet!");
		}
	}


    // mag niet veranderd worden
	public boolean isVrij() { return straf <= 0; }


	//vb uit toets
	public static void demo_this() {
		Gevangene a = new Gevangene("Murdoc");
		// legale wijziging:
		a.geefStraf(1234567, -10);
		System.out.println(a);
	}

	//vb uit toets
	public static void demo_encapsulatie() {
		int wachtwoord = 1234567;
		Gevangene g = new Gevangene("Murdoc");
		// g.straf = 1; // uiteraard moet dit ook onmogelijk zijn
		System.out.println(g);

		 // kan niet, verkeerd wachtwoord
		g.geefStraf(111111, 99);
		System.out.println(g);

		// geldig wachtwoord:
		g.geefStraf(wachtwoord, 10);
		System.out.println(g);

		// mag niet, geefStraf(...) is al een keer succesvol uitgevoerd
		g.geefStraf(wachtwoord, 5);
		System.out.println(g);

		// Aanroepen van verminder(...) kan ook alleen met het juiste wachtwoord.
		g.verminder(90000);
		g.verminder(wachtwoord);
		g.verminder(wachtwoord);
		System.out.println(g);
	}
	
	
	
    // getters + setter toegevoegd voor opgave over 'new'
	public String getNaam() { return this.naam; }
	public int getStraf() { return this.straf; }
	public void setStraf(int t) { this.straf = t; }

}
