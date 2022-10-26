package ToetsHulp.NieuwePoging.Juni8_2021;

import ToetsHulp.NieuwePoging.Juni8_2021.Opgave1.Route;
import ToetsHulp.NieuwePoging.Juni8_2021.Opgave2.Rechthoek;
import ToetsHulp.NieuwePoging.Juni8_2021.Opgave4.Vliegtuig;
import ToetsHulp.NieuwePoging.Juni8_2021.Opgave4.Vliegveld;

public class Main {

//======================== code om ToetsHulp.NieuwePoging.Juni8_2021.Opgave1.Route (opgave 1) te testen ========================


    //---------------------- code om opgave 1(a) te testen --------------------
    //
//	public static void main(String[] args) {
//		Route w1 = new Route( 11 );
//		System.out.println( w1 );            //  Route van 11 km, start: ???
//
//		Route w2 = new Route( 7, "Zwolle" );
//		System.out.println( w2 );            //  Route van 7 km, start: Zwolle
//	}


    //---------------------- code om opgave 1(b) te testen --------------------
    //
//	public static void main(String[] args) {
//		Route w = new Route( 12 );
//		System.out.println( w ); 			// Route van 12 km, start: ???
//		w.setStart( "Assen" );
//		System.out.println( w ); 			// Route van 12 km, start: Assen
//		w.setStart( "Wapenveld" );		    // mag niet
//		System.out.println( w );            // Route van 12 km, start: Assen
//		Route w2 = new Route( 8, "Zwolle" );
//		System.out.println( w2 );           // Route van 8 km, start: Zwolle
//		w2.setStart( "Eindhoven" );         // mag niet
//		Route w3 = new Route( 1 );   // te kort
//
//	}


    //---------------------- code om opgave 1(d) te testen --------------------
    //
//	public static void main(String[] args) {
//		Route w1 = new Route( 9 );
//		Route w2 = new Route( 5 );
//		Route w3 = new Route( 7 );
//		Route.printMinMax();
//
//		// kortste afstand is 5 km
//		// langste afstand is 9 km
//		Route w4 = new Route( 12 );
//		Route w5 = new Route( 4 );
//		Route.printMinMax();
//
//		// kortste afstand is 4 km
//		// langste afstand is 12 km
//	}


//======================== code om Rechthoek (opgave 2) te testen ========================


    //---------------------- code om opgave 2(a) te testen --------------------
    //
//	public static void main(String[] args) {
//		Rechthoek re1 = new Rechthoek( 3, 4, 123 );
//		Rechthoek re2 = new Rechthoek( 5, 7, 123 );
//		Rechthoek re3 = new Rechthoek( 4, 3, 123 );
//		Rechthoek re4 = new Rechthoek( 3, 4, 7 );
//		Rechthoek re5 = new Rechthoek( 3, 4, 123 );
//
//		 // vorm verschillend en kleur gelijk
//		System.out.println( re1.equals( re2 ) );    //  false
//
//		 // vorm gelijk maar gedraaid; kleur gelijk
//		System.out.println( re1.equals( re3 ) );    //  true
//
//		 // vorm gelijk; kleur verschillend
//		System.out.println( re1.equals( re4 ) );    //  false
//
//		 // vorm en kleur gelijk
//		System.out.println( re1.equals( re5 ) );    //  true
//	}


//======================== code om Figuur (opgave 2) te testen ========================

/*
	//---------------------- code om opgave 2(b) te testen --------------------
	//
	public static void main(String[] args) {
		Figuur figuur = new Rechthoek( 5, 10, 1 );
		System.out.println( figuur );               //  Rechthoek: 5 x 10 en kleur 1
		System.out.println( figuur.oppervlakte() ); //  50.0
		figuur.roteer();
		System.out.println( figuur );               //  Rechthoek: 10 x 5 en kleur 1
		
		Vierkant vierkant = new Vierkant( 4, 13 );
		
		HeeftZijkanten zijkanter = vierkant;
		int n = zijkanter.getAantalZijkanten();
		System.out.println( n );                    //  4
		
		figuur = vierkant;
		System.out.println( figuur );               //  Vierkant: 4 x 4 en kleur 13
		System.out.println( figuur.oppervlakte() ); //  16.0
		figuur.roteer();
		System.out.println( figuur );               //  Vierkant: 4 x 4 en kleur 13
		
		figuur = new Cirkel( 2, 77 );
		System.out.println( figuur );               //  Cirkel: straal = 2.0, kleur = 77
		System.out.println( figuur.oppervlakte() ); //  12.566370614359172
		figuur.roteer();
		figuur.setKleur( 808 );
		System.out.println( figuur );               //  Cirkel: straal = 2.0, kleur = 808
	}
*/


//======================== code om Garage (opgave 3) te testen ========================

/*
	//---------------------- code om opgave 3 te testen --------------------
	//
	public static void main(String[] args) {
		Garage garage = new Garage();
		ToetsHulp.NieuwePoging.Juni8_2021.Opgave4.Vliegtuig f16 = new ToetsHulp.NieuwePoging.Juni8_2021.Opgave4.Vliegtuig( "F-16" );
		garage.zetInGarage( f16 );
		garage.upgrade( ".upgrade" );
		
		 // Waarom is de naam van f16 niet veranderd in "F-16.upgrade" na upgrade(...) ?
		System.out.println( f16 );               //  F-16
	}
*/


//======================== code om Vliegveld (opgave 4) te testen ========================


    //---------------------- code om opgave 4(b) te testen --------------------
    //
//	public static void main(String[] args) {
//		Vliegveld veld = new Vliegveld( 3 );
//		Vliegtuig f16 = new Vliegtuig( "F-16" );
//		veld.zetBinnen( f16, 2 );
//		Vliegtuig boeing = new Vliegtuig( "Boeing 747" );
//		veld.zetBinnen( boeing, 2 ); 			// hangar 2 is al bezet
//		veld.zetBinnen( boeing, 3210 ); 		// hangar 3210 bestaat niet!
//		veld.zetBinnen( boeing, 1 );
//		veld.print();
//													// hangar:
//													// * plek 0: ---
//													// * plek 1: Boeing 747
//													// * plek 2: F-16
//
//	}


    //---------------------- code om opgave 4(c) te testen --------------------
    //
//	public static void main(String[] args) {
//		Vliegveld veld = new Vliegveld( 3 );
//		Vliegtuig boeing = new Vliegtuig( "Boeing 747" );
//		veld.zetBinnen( boeing, 2 );
//		Vliegtuig f16 = new Vliegtuig( "F-16" );
//		veld.zetBinnen( f16, 1 );
//		veld.print();
//		                                                  // hangar:
//		                                                  // * plek 0: ---
//		                                                  // * plek 1: F-16
//		                                                  // * plek 2: Boeing 747
//
//		Vliegtuig x = veld.haalEruit( 2 );
//		System.out.println( x );                          //  Boeing 747
//
//		veld.print();
//		                                                  // hangar:
//		                                                  // * plek 0: ---
//		                                                  // * plek 1: F-16
//		                                                  // * plek 2: ---
//
//		Vliegtuig y = veld.haalEruit( 0 );
//		System.out.println( y );                          //  null
//	}


    //---------------------- code om opgave 4(d) te testen --------------------
    //
    public static void main(String[] args) {
        Vliegveld veld = new Vliegveld(5);
        Vliegtuig dc10 = new Vliegtuig("DC-10");
        veld.zetBinnen(dc10, 4);
        Vliegtuig f16 = new Vliegtuig("F-16");
        veld.zetBinnen(f16, 0);
        Vliegtuig boeing = new Vliegtuig("Boeing 747");
        veld.zetBinnen(boeing, 1);
        veld.print();
                                                                    // hangar:
                                                                    // * plek 0: F-16
                                                                    // * plek 1: Boeing 747
                                                                    // * plek 2: ---
                                                                    // * plek 3: ---
                                                                    // * plek 4: DC-10
        Vliegtuig concorde = new Vliegtuig("Concorde");
        int vrij = veld.zetOpEersteVrijePlek(concorde);
        System.out.println(vrij);                                   // 2
        veld.print();
                                                                    // hangar:
                                                                    // * plek 0: F-16
                                                                    // * plek 1: Boeing 747
                                                                    // * plek 2: Concorde
                                                                    // * plek 3: ---
                                                                    // * plek 4: DC-10

        for (int i = 10; i <= 16; i++) {
            System.out.println("/* " + i + " */");
        }

    }


}