package ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2;

public abstract class Figuur implements Rotatie
{

	protected int kleur;

	public Figuur( int kleur ) { this.kleur = kleur; }

	public void setKleur( int kleur ) { this.kleur = kleur; }


	public abstract double oppervlakte();
}


/*
	// code uit de toets:
	public static void demo_figuren() {
		Figuur figuur = new ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Rechthoek( 5, 10, 1 );
		System.out.println( figuur );
		System.out.println( figuur.oppervlakte() );
		figuur.roteer();
		System.out.println( figuur );

		ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Vierkant vierkant = new ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.Vierkant( 4, 13 );

		ToetsHulp.Theorie.Juni8.Antwoorden.Opgave2.HeeftZijkanten zijkanter = vierkant;
		int n = zijkanter.getAantalZijkanten();
		System.out.println( n );

		figuur = vierkant;
		System.out.println( figuur );
		System.out.println( figuur.oppervlakte() );
		figuur.roteer();
		System.out.println( figuur );

		figuur = new Cirkel( 2, 77 );
		System.out.println( figuur );
		System.out.println( figuur.oppervlakte() );
		figuur.roteer();
		figuur.setKleur( 808 );
		System.out.println( figuur );
	}

*/