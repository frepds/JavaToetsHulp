package ToetsHulp.Theorie.Juni8.Antwoorden.Opgave4;

import ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.Vliegtuig;

public class Vliegveld
{
    /////////////////////////////////////// (a) //////////////////////////////////////////////////////
	
	private Vliegtuig[] hangar;  //public/private etc. niet belangrijk in deze opgave

	public Vliegveld( int grootte ) { hangar = new Vliegtuig[grootte]; }
	
    /////////////////////////////////////// (b) //////////////////////////////////////////////////////

	public void zetBinnen( Vliegtuig v, int plek ) {
		if( plek < 0 || plek >= hangar.length )
		{
			System.out.println( "hangar " + plek + " bestaat niet!" );
			return;
		}
		if( hangar[plek] == null ) {
			hangar[plek] = v;
		}
		else {
			System.out.println( "hangar " + plek + " is al bezet" );
		}
	}

	public void print() {
		System.out.println( "hangar:" );
		for ( int i = 0; i < hangar.length; i++ ) {
			String staatTxt;
			if( hangar[i] == null ) {
				staatTxt = "---";
			}
			else {
				staatTxt = hangar[i].toString();
			}
			System.out.println( "* plek " + i + ": " + staatTxt );
		}
	}

	public static void demo_set_en_print() {
		Vliegveld veld = new Vliegveld( 3 );

		Vliegtuig f16 = new Vliegtuig( "F-16" );
		veld.zetBinnen( f16, 2 );

		Vliegtuig boeing = new Vliegtuig( "Boeing 747" );
		veld.zetBinnen( boeing, 2 );
		veld.zetBinnen( boeing, 3210 );
		veld.zetBinnen( boeing, 1 );

		veld.print();
	}

	
    /////////////////////////////////////// (c) //////////////////////////////////////////////////////

	public Vliegtuig haalEruit( int plek ) {
		if ( plek < 0 || plek >= hangar.length ) {
			System.out.println( "hangar " + plek + " bestaat niet!" );
			return null;
		} else {
			Vliegtuig v = hangar[plek];
			hangar[plek] = null; //want: ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.ToetsHulp.Theorie.Juni8.StartSituatie.Opgave4.Vliegtuig wordt eruit gehaald
			return v;
		}
	}

	public static void demo_get() {
		Vliegveld veld = new Vliegveld( 3 );

		Vliegtuig boeing = new Vliegtuig( "Boeing 747" );
		veld.zetBinnen( boeing, 2 );

		Vliegtuig f16 = new Vliegtuig( "F-16" );
		veld.zetBinnen( f16, 1 );

		veld.print();

		Vliegtuig x = veld.haalEruit( 2 );
		System.out.println( x );

		veld.print();

		Vliegtuig y = veld.haalEruit( 0 );
		System.out.println( y );
	}

    /////////////////////////////////////// (d) //////////////////////////////////////////////////////

	public int zetOpEersteVrijePlek( Vliegtuig v ) {
		for ( int i = 0; i < hangar.length; i++ ) {
			if ( hangar[i] == null ) {
				hangar[i] = v;
				return i;
			}
		}
		//System.out.println( "Alle hangar-plekken zijn bezet" );
		return -1;
	}

	public static void demo_zoek_vrije_plek() {
		Vliegveld veld = new Vliegveld( 5 );

		Vliegtuig dc10 = new Vliegtuig( "DC-10" );
		veld.zetBinnen( dc10, 4 );

		Vliegtuig f16 = new Vliegtuig( "F-16" );
		veld.zetBinnen( f16, 0 );

		Vliegtuig boeing = new Vliegtuig( "Boeing 747" );
		veld.zetBinnen( boeing, 1 );

		veld.print();

		Vliegtuig concorde = new Vliegtuig( "Concorde" );
		int vrij = veld.zetOpEersteVrijePlek( concorde );
		System.out.println( vrij );

		veld.print();
	}

  
}
