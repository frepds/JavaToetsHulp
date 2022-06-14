package ToetsHulp.Praktijk.April7.Antwoorden;
// // 
//mnc07: opgave 2(a) [ATTR_CONSTR: 2 PUNTEN]:
// 
//mnc07: opgave 2(a) [GETTERS: 2 PUNTEN]: getNaam()
// 
//mnc07: opgave 2(a) [GETTERS: 2 PUNTEN]: getDocent()
//

import java.awt.*;
import java.util.ArrayList;

public class Klas
{
	private String naam = "klas???";  // default waarde. Op deze manier hoeven we niet 2x de logica voor de naam te doen. Kunnen nu in constructor gewoon setNaam(..) aanroepen.
	private ArrayList<Persoon> personenLijst; //niet vergeten de list ergens te initialiseren. Kan hier, maar mag ook in constructor natuurlijk.
	private Persoon docent;

 // //mnc07: opgave 2(a) [NAAM: 6 PUNTEN]: Alles mbt. naam en constructor

	public Klas(String naam) {
		setNaam(naam); // omdat  we al een default (klas???) hebben gegeven bij declaratie van het attribuut, kunnen we hier setNaam(..) gebruiken en is geen extra logica nodig. (mag wel natuurlijk, maar beter lui dan moe).
		this.personenLijst = new ArrayList<>(); //als je dit vergeet, krijg je nullPointerExceptions als je iets met de lijst doet (print, voegtoe, etc)... hier of bij delcareren van attribuut initialiseren.

	}

	public Persoon getDocent() { return docent; }

///////////////////////////////////////////////////////////////////////////////////////////////

    // voor de titel, vanuit de GUI
	public String getNaam() { return naam; }

 // 
//mnc07: vraag 2(a): Alles mbt naam en setNaam(String): 3 punten te behalen
	
	// zinvolle naam, niet te kort, en geen "scheldwoord" ###.
	public void setNaam(String naam) {
		// String --> equals gebruiken, altijd! Altijd? Ja, altijd. Je weet met Java nooit of de compiler op jouw systeem wel of niet stiekem optimaliseert.
		// en toevallig 2 verschillende string variabelen op dzelfde plek in het geheugen opslaat (waardoor == toevallig soms werkt).
		//
		// en... als je ook moet checken of iets niet null is (omdat null een mogelijke input is), doe dat dan EERST. Want anders krijg je NullPointerExceptions
		// want als de input naam hier null is, dan zou naam.length() falen (en naam.equals(..)) ook. 
		// Maar java (en C#, C++, etc) zijn 'lui'. Ze doen lazy evaluation. Dus als de eerste conditie in een && al false is, dan wordt de tweede niet gedaan.
		// Dus als de naam != null de eerste is (en faalt als ie null is) dan komt java nooit bij de tweede, en is er niks aan de hand.
		// Maar staan ze andersom, dan crash je dus met een nullPointerException.
		//
		// Uiteraard kun je de logica ook op allerlei andere manieren doen, met meer if's en else's. De uitwerking hier heeft gewoon 1 van de compactere varianten.
		if (naam != null && naam.length() >= 3 && !naam.equals("###")) { 
			this.naam = naam;
		}
	}

    // testje dat in de toets stond.
	// hierin werd bewust niet een test getoond met als input null: setNaam(null). 
	// we gaan er vanuit, dat je zelf kijkt of alles werkt zoals in de tekst v/d vraag beschreven. Dit was alleen een stukje voorbeeld.
	public static void test_hernoem() {
		Klas klas = new Klas("2W");
		System.out.println(klas.getNaam());

		klas.setNaam("Goede naam voor klas!");
		System.out.println(klas.getNaam());

		klas = new Klas("ICTm2W");
		System.out.println(klas.getNaam());

		klas.setNaam("###");
		System.out.println(klas.getNaam());

		klas.setNaam("topklas");
		System.out.println(klas.getNaam());
	}

 // 
	
    ///////////////////////////////////////////////////////////////////////////////////////////////


//mnc07: opgave 2(b) [PRINT: 4 PUNTEN]: personenLijst en print()


	public void print() {
		System.out.println("=== Klas: " + naam + " ==="); // vergeet niet om te kijken of er nog meer gedaan moet worden dan een lijst printen, bv. een soort header...
		for (Persoon deelnemer : personenLijst) {   // of met for(int i...)
			System.out.println("   * " + deelnemer);
		}
	}

 // 
//mnc07: opgave 2(b) [VOEGTOE: 4 PUNTEN]: personenLijst en voegToe(String, String, int)
	
	public void voegToe(String naam, String studentnummer, int blij) {
		Student student = new Student(naam, studentnummer, blij);
		personenLijst.add(student);
	}

 // 
//mnc07: opgave 2(b) [VOEGTOE_ABSOBJ: 7 PUNTEN]: personenLijst en voegToe(Persoon)
	
	public void voegToe(Persoon persoon) {
		//check of al een Docent aanwezig is. Kan met instanceof, maar ook door de beschrijving op te vragen en te checken (met equals) of die "docent" is.
		if (docent != null && persoon instanceof Docent) {
			return; // docent bestaat al en de nieuwe is ook een Docent: dan zijn we klaar, niet toevoegen.
		}
		if (persoon instanceof Docent) {
			docent = persoon; // eerste keer, dan opslaan. 
			// N.b. omdat casting niet behandeld wordt in het vak Java, was docent v/h type persoon. Stel dat je 'm van type Docent zou maken, dan heb je hier de volgende code kunnen gebruiken:
			docent = (Docent) persoon;  // een "cast" zodat java weet dat we met een docentvormig object te maken hebben (ook al is persoon van type Persoon). Dit soort casts heb je ook bij het zelf equals maken.
		}
		personenLijst.add(persoon);  //als we hier aankomen, is het ofwel de eerste docent, of een ander soort Persoon.

	}

	public static void test_voegtoe() {
		//testje uit de toets.
		Klas klas = new Klas("ICTm2W");
		klas.voegToe("Eva", "s1234", 70);
		Docent jan = new Docent("Jan");
		System.out.println(klas.getDocent());
		klas.voegToe(jan);
		System.out.println(klas.getDocent());

		// deze toevoeging mag niet, er is al een Docent aanwezig:
		klas.voegToe(new Docent("Josien"));
		System.out.println(klas.getDocent());
		klas.print();
	}

///////////////////////////////////////////////////////////////////////////////////////////////
 // 
//mnc07: opgave 2(c) [VERZ_MAAKBLIJ1: 3 PUNTEN]: maakBlij(int) en personenLijst
	
	public void maakBlij(int hoeveelheid) {
		for (Persoon deelnemer : personenLijst) {
			deelnemer.maakBlij(hoeveelheid);
		}
	}

 // 
//mnc07: opgave 2(c) [VERZ_MAAKBLIJ_STRING: 7 PUNTEN]: personenLijst EN maakBlij(String, int)

	public boolean maakBlij(String naam, int hoeveelheid) {
		for (Persoon deelnemer : personenLijst) {
			// hier niet == gebruiken! De String zou bv uit de gui kunnen komen en bestaat dan op moment van compileren nog niet eens. Java kan twee strings dan niet op zelfde plek opslaan als ze dezelfde inhoud hebben
			// en dus zal == falen. Dit kun je ook testen door String s = new String("blabla") te maken. Die is ook gegarandeerd op een nieuwe geheugenplek, en s == "blabla" zal dan falen.
			if (deelnemer.getNaam().equals(naam)) {  // ook geen contains gebruiken. Want dan matcht een langere naam ook met een korte ("Jantien".contains("Jan") is true.
				deelnemer.maakBlij(hoeveelheid);
				return true;
			}
		}
		// niemand gevonden!
		return false;
	}

	public static void test_maakblij12() {
		// vb uit de toets.
		Klas klas = new Klas("ICTm2W");
		klas.voegToe("Rik", "s1657", 80);
		Docent jan = new Docent("Jan"); // begint met blij = 100.
		klas.voegToe(jan);
		klas.voegToe("Ada", "s1131", 59);
		klas.maakBlij(-50);
		klas.print();
		boolean res = klas.maakBlij("Ada", 90);
		System.out.println(res);
		res = klas.maakBlij("Anoniempje", -55);
		System.out.println(res);
		klas.print();
	}




    // we laten de gui de opdracht aan de klas geven om zichzelf te tekenen in deze voorbeelduitwerking.
	public void tekenMij(Graphics g, int maxbreedte) {
		int iconBreedte = 130;
		int iconHoogte = 145;
		int xstart = 10;
		int x = xstart;
		int y = 10;

		for (Persoon abs : personenLijst) {
			abs.tekenMij(g, x, y);
			x += iconBreedte;
			if (x + iconHoogte >= maxbreedte) { // zorgen dat we op een nieuwe lijn beginnen. (Dan moet de aanroeper wel de juiste breedte v/h panel meegeven uiteraard).
				x = xstart;
				y += iconHoogte;
			}
		}
	}
}

