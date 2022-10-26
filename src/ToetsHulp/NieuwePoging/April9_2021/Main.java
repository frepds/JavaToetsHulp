package ToetsHulp.NieuwePoging.April9_2021;

import ToetsHulp.NieuwePoging.April9_2021.Opgave1.Beschermd;
import ToetsHulp.NieuwePoging.April9_2021.Opgave2.PicPoc;
import ToetsHulp.NieuwePoging.April9_2021.Opgave2.Plaatje;
import ToetsHulp.NieuwePoging.April9_2021.Opgave3.Verkiezingen;
import ToetsHulp.NieuwePoging.April9_2021.Opgave4.Bankbiljet;
import ToetsHulp.NieuwePoging.April9_2021.Opgave4.Munteenheid;

public class Main {


//========================== code om Beschermd te testen ===========================


    // vraag 1a
//    public static void main(String[] args) {
//        Beschermd a = new Beschermd(88888);             //  ok
//        System.out.println(a);                               //  Beschermd: getal = 88888
//    }


	// vraag 1b
//	public static void main(String[] args) {
//		Beschermd a = new Beschermd( 777777 );      //  ok
//		a.setGetal( 2 );                                 //  mag niet
//		System.out.println( a );                         //  Beschermd: getal = 777777
//		a.setGetal( 333 );                               //  ok
//		System.out.println( a );                         //  Beschermd: getal = 333
//
//		Beschermd b = new Beschermd( -1 );          //  mag niet
//		System.out.println( b );                         //  Beschermd: getal = 12345
//	}


	// vraag 1c
//	public static void main(String[] args) {
//		Beschermd.printLogging();                   //  # ok = 0, # mag niet = 0
//
//		Beschermd a = new Beschermd( 777 );   //  ok
//		Beschermd b = new Beschermd( -1 );    //  mag niet
//		b.setGetal( 123 );                         //  ok
//		Beschermd c = new Beschermd( 98765 ); //  ok
//
//		Beschermd.printLogging();                  //  # ok = 3, # mag niet = 1
//
//		Beschermd d = new Beschermd( 100 );   //  ok
//		d.setGetal( -1 );                          //  mag niet
//		Beschermd.printLogging();                  //  # ok = 4, # mag niet = 2
//	}


//============================= code om ToetsHulp.NieuwePoging.April9_2021.Opgave2.PicPoc te testen =============================


//	public static void main(String[] args) {
//		PicPoc account1 = new PicPoc();
//		Plaatje img = new Plaatje( 1, 2 );               //  Plaatje: 1, 2
//		account1.uploadPlaatje( img );
//
//		 // klopt het plaatje nog wel?
//		account1.toon();                                 //  Plaatje: 1, 2
//
//		 // deel het met de wereld!
//		Plaatje gedownload = account1.downloadPlaatje();
//
//		 // iemand verandert het gedownloade plaatje
//		gedownload.pixel1 = 777;
//		gedownload.toon();                               //  Plaatje: 777, 2
//
//		 // Bekijk het plaatje in de account nog eens.
//		 // Dat zou natuurlijk hetzelfde moeten zijn als aan het begin
//		account1.toon();                                 //  Plaatje: 1, 2
//	}



//============================= code om ToetsHulp.NieuwePoging.April9_2021.Opgave3.Verkiezingen te testen =============================


	// vraag 3b
//	public static void main(String[] args) {
//		Verkiezingen v = new Verkiezingen( 3 );
//		v.stemOp( 2 );
//		v.stemOp( 1 );
//		v.stemOp( 1 );
//		v.stemOp( 1 );
//		v.stemOp( 777 );                        //  kandidaat 777 bestaat niet
//		v.print();
//		                                        		  // kandidaat nr 1 heeft 3 stemmen
//		                                                  // kandidaat nr 2 heeft 1 stem
//		                                                  // kandidaat nr 3 heeft 0 stemmen
//	}



	// vraag 3c
//	public static void main(String[] args) {
//		Verkiezingen v = new Verkiezingen( 4 );
//		v.stemOp( 1 );
//		v.stemOp( 2 );
//		v.stemOp( 1 );
//		v.stemOp( 1 );
//		v.print();
//		                                        // kandidaat nr 1 heeft 3 stemmen
//		                                        // kandidaat nr 2 heeft 1 stem
//		                                        // kandidaat nr 3 heeft 0 stemmen
//		                                        // kandidaat nr 4 heeft 0 stemmen
//		//
//		System.out.println( v.getWinnaar() );   //  1
//	}



//============================= code om ToetsHulp.NieuwePoging.April9_2021.Opgave4.Bankbiljet te testen =============================


	// vraag 4
	public static void main(String[] args) {
		// twee keer dezelfde Munteenheid
		Munteenheid euro = new Munteenheid( "euro" );
		Munteenheid euro2 = new Munteenheid( "euro" );

		// twee keer hetzelfde Bankbiljet
		Bankbiljet tientje = new Bankbiljet( 10, euro );
		Bankbiljet tientje2 = new Bankbiljet( 10, euro2 );
		System.out.println( tientje.equals( tientje2 ) ); 			// verwacht: true

		// verschillende Munteenheid, zelfde getal
		Munteenheid dollar = new Munteenheid( "dollar" );
		Bankbiljet tienDollar = new Bankbiljet( 10, dollar );
		System.out.println( tientje.equals( tienDollar ) ); 		// verwacht: false

		// vergelijken met iets dat geen Bankbiljet is
		System.out.println( tientje.equals( "10 euro" ) ); 			// verwacht: false
	}



/*======================= alle namen uit het klassendiagram (vraag 5) =======================
// zodat je ze kunt copy-pasten

	Electron
	Kryptoniet
	Tachyon
	Quark
	FlexMeson
	Photon
	Neutronium
	
	frequentie
	massa
	rotatie
	straling
	
*/


}