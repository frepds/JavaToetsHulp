package ToetsHulp.Theorie.April8_2022.Antwoorden.Antwoorden;

public class Cel
{
	private Gevangene gevangene;

	public String toString() {
		return "Cel: # " + gevangene + " #";
	}

	public void setGevangene(String naam, int straf) {
		gevangene = new Gevangene(naam);
		gevangene.geefStraf(1234567, straf);
	}

	public Gevangene getGevangene___FOUT___() {
		return gevangene;
	}


	public Gevangene getGevangene() {
		Gevangene temp = new Gevangene(gevangene.getNaam());
		temp.setStraf(gevangene.getStraf());
		return temp;
		// alternatief: een 'copy' constructor aannmaken in Gevangene
		// Gevangene temp = new Gevangene(gevangene);
	}


	// vb uit toets
	public static void demoVrijlating() {
		Cel alcatraz = new Cel();
		alcatraz.setGevangene("Harry Houdini", 100);
		System.out.println(alcatraz);

		// iemand vraagt gegevens op
		Gevangene g = alcatraz.getGevangene();
		System.out.println(g);

		// en heeft juiste wachtwoord
		for(int i = 0; i < 1000; i++) { g.verminder(1234567); }
		// dus g is veranderd
		System.out.println(g);

		// maar attribuut gevangene is niet veranderd
		System.out.println(alcatraz);

		// dus vrijlaten gebeurt niet
		alcatraz.laatVrij();
		System.out.println(alcatraz);
	}


	/////////////////////////////////////////////////////////////////////


	public void jaarwisseling() {
		try {
			gevangene.verminder(1234567);
		}
		catch(NullPointerException npe) {
			System.out.println("Cel is leeg!");
		}
	}

	public void laatVrij() {
		try {
			if (gevangene.isVrij()) {
				gevangene = null;
			}
		}
		catch(NullPointerException npe) {
			System.out.println("Cel is leeg!");
		}
	}



	//vb uit toets
	public static void demo_nullPointer() {
		Cel alcatraz = new Cel();
		alcatraz.setGevangene("Murdoc", 1);
		System.out.println(alcatraz);

		alcatraz.jaarwisseling();
		System.out.println(alcatraz);

		alcatraz.laatVrij();
		System.out.println(alcatraz);

		// hier kan een crash ontstaan als de methodes er niet tegen beschermd zijn
		alcatraz.jaarwisseling();
		alcatraz.laatVrij();
	}
	



	/////////////////////////////////////////////////////////////////////


	public void omwisselen___FOUT___(Cel andere) {
		andere.gevangene = gevangene;
		gevangene = andere.gevangene;
	}

    // correcte methode:
	public void omwisselen(Cel andere) {
		Gevangene tijdelijk = andere.gevangene;
		andere.gevangene = gevangene;
		gevangene = tijdelijk;
	}


	//vb uit toets
	public static void demo_uitwisseling() {
		Cel alcatraz = new Cel();
		alcatraz.setGevangene("Murdoc", 1);
		Cel bajes = new Cel();
		bajes.setGevangene("Harry Houdini", 88);

		System.out.println(alcatraz);
		System.out.println(bajes);

		alcatraz.omwisselen___FOUT___(bajes);

		// de ene Gevangene is nu verdwenen,
		// en de andere zit nu in allebei!
		System.out.println(alcatraz);
		System.out.println(bajes);
	}



}
