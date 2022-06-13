package ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2;

public class Rechthoek extends Figuur implements HeeftZijkanten
{

	private int lengte;
	private int breedte;
	//private int kleur; //nodig bij de equals-opgave, maar verboden (vanaf dat moment gebruiken de kleur van Figuur)

	public Rechthoek( int lengte, int breedte, int kleur ) {
		super( kleur ); // toegevoegd
		this.lengte = lengte;
		this.breedte = breedte;
		//kleurnummer = kleur; //verwijderd t.o.v. opgave over equals

	}

	public double oppervlakte() {
		return lengte * breedte; 
		}

	public void roteer() {
		int hulp = lengte;
		lengte = breedte;
		breedte = hulp;
	}

	public String toString() {
		String rhOfVkTxt = "ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek";
		if( this instanceof Vierkant) { //ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Vierkant-klasse mocht geen eigen toString hebben. Maar ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Vierkant is een ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek (maar dan een speciale)
										//dus we kunnen instanceof gebruiken om te checken wat voor soort ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek dit is.
										//Wat niet de bedoeling was (maar wel goed gerekend is) is, dat je hier checkt of lengte==breedte.
										//Dat is eigenlijk niet goed, omdat een new ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek(10,10) wel lengte==breedte heeft, maar beslist
										//GEEN ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Vierkant-OBJECT is.
			rhOfVkTxt = "ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Vierkant";
		}
		return rhOfVkTxt + ": " + lengte + " x " + breedte + " en kleur " + kleur;
	}

	

	// equals die zich houdt aan de eisen in de toets:
	public boolean equals( Object obj ) {
		if ( !( obj instanceof Rechthoek ) ) {
			return false;
		}
		Rechthoek r = ( Rechthoek ) obj;
		if ( this.kleur != r.kleur ) {
			return false; // hopeloos
		}
		boolean variant1 = (this.lengte == r.lengte && this.breedte == r.breedte);
		boolean variant2 = (this.lengte == r.breedte && this.breedte == r.lengte); //gedraaid
		return variant1 || variant2;  //ok als normaal of gedraaid gelijke afmetingen.
		// n.b. wat niet werkt, is kijken of de oppervlakte hetzelfde is (10x2 is zelfde oppervlakte als 5x4 maar de rechthoeken zijn van verschillende vorm)
	}
	

	public int getAantalZijkanten() { return 4; }
}


/*

	// vb code uit de toets
	public static void demo_equals() {
		ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek re1 = new ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek( 3, 4, 123 );
		  ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek re2 = new ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek( 5, 7, 123 );
		  ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek re3 = new ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek( 4, 3, 123 );
		  ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek re4 = new ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek( 3, 4, 7 );
		  ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek re5 = new ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek( 3, 4, 123 );

		  // vorm verschillend en kleur gelijk
		  System.out.println( re1.equals( re2 ) );

		  // vorm gelijk maar gedraaid; kleur gelijk
		  System.out.println( re1.equals( re3 ) );

		  // vorm gelijk; kleur verschillend
		  System.out.println( re1.equals( re4 ) );

		  // vorm en kleur gelijk
		  System.out.println( re1.equals( re5 ) );
	}


*/