package ToetsHulp.Praktijk.April7.StartSituatie;

import java.awt.*;

public class Main {


//============================= code om Docent te testen =============================

/*
	// code om opgave 1(b) te testen
	//
	public static void main(String[] args) {
		Docent x = new Docent("Jan");
		System.out.println( x );      //  Jan (Docent) 	100 	:-P
	}
*/


//============================= code om Student te testen =============================

/*
	// code om opgave 1(c) te testen
	//
	public static void main(String[] args) {
		Student st = new Student("Anna", "s1234");
		System.out.println( st );                  //  Anna (s1234) 	50 	:-|
		
		st = new Student("Adam", "s0012", 95);
		System.out.println( st );                  //  Adam (s0012) 	95 	:-D
	}
*/


//============================= code om Klas te testen =============================

/*
	// code om opgave 2(a) te testen
	//
	public static void main(String[] args) {
		Klas klas = new Klas( "2W" );
		System.out.println( klas.getNaam() );    //  klas???
		
		klas.setNaam( "Goede naam voor klas!" );
		System.out.println( klas.getNaam() );    //  Goede naam voor klas!
		
		klas  = new Klas( "ICTm2W" );
		System.out.println( klas.getNaam() );    //  ICTm2W
		
		klas.setNaam( "###" );
		System.out.println( klas.getNaam() );    //  ICTm2W
		
		klas.setNaam( "topklas" );
		System.out.println( klas.getNaam() );    //  topklas
	}
*/


/*
	// code om opgave 2(b) te testen
	//
	public static void main(String[] args) {
		Klas klas = new Klas( "ICTm2W" );
		klas.voegToe( "Eva", "s1234", 70 );
		Docent jan =  new Docent("Jan");
		System.out.println( klas.getDocent() ); //  null
		klas.voegToe( jan );
		System.out.println( klas.getDocent() ); //  Jan (Docent) 	100 	:-P
		
		 // deze toevoeging mag niet, er is al een Docent aanwezig:
		klas.voegToe( new Docent("Josien") );
		System.out.println( klas.getDocent() ); //  Jan (Docent) 	100 	:-P
		klas.print();
		                                        // === Klas: ICTm2W ===
		                                        // * Eva (s1234) 	70 	:-)
		                                        // * Jan (Docent) 	100 	:-P
		//
	}
*/


/*
	// code om opgave 2(c) te testen
	//
	public static void main(String[] args) {
		Klas klas = new Klas( "ICTm2W" );
		klas.voegToe( "Rik", "s1657", 80 );
		Docent jan = new Docent("Jan");  // begint met blij = 100.
		klas.voegToe( jan );
		klas.voegToe( "Ada", "s1131", 59 );
		klas.maakBlij( -50 );
		klas.print();
		                                          // === Klas: ICTm2W ===
		                                          // * Rik (s1657) 	30 	:-|
		                                          // * Jan (Docent) 	50 	:-P
		                                          // * Ada (s1131) 	9 	:-(
		// 
		boolean res = klas.maakBlij( "Ada", 90 );
		System.out.println( res );                //  true
		res = klas.maakBlij( "Anoniempje", -55 );
		System.out.println( res );                //  false
		klas.print();
		                                          // === Klas: ICTm2W ===
		                                          // * Rik (s1657) 	30 	:-|
		                                          // * Jan (Docent) 	50 	:-P
		                                          // * Ada (s1131) 	99 	:-D
		//
	}
*/


//=====================================================================

    // code voor opgave 5
    //
    // Plaats deze code in de klasse waar je 'm wilt gebruiken.
    //
    // aanroep: drawStringRotated(g2d, "hoi", 100, 200, 45);
    // resultaat: tekent "hoi" op plek x=100, y=200 met een hoek van 45 graden.
    //
    // Inhoud van deze methode direct weer vergeten, alleen gebruiken :-)
    //
    // Gebaseerd op: stackoverflow.com/a/26705815
    //
    public void drawStringRotated(Graphics g, String txt, double x, double y, int angle) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate((float) x, (float) y);
        g2d.rotate(Math.toRadians(angle));
        g2d.drawString(txt, 0, 0);
        g2d.rotate(-Math.toRadians(angle));
        g2d.translate(-(float) x, -(float) y);
    }
}