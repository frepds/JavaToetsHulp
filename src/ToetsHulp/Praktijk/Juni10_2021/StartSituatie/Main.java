package ToetsHulp.Praktijk.Juni10_2021.StartSituatie;

public class Main {


//======================== code om Data (opgave 1) te testen ========================

/*
	//---------------------- code om opgave 1(a) te testen --------------------
	//
	public static void main(String[] args) {
		Data d = new Data( "Wilco", "0800-JAVA" );
		System.out.println( d );                   //  Wilco (0800-JAVA)
		Data d2 = new Data( "??", "ergens" );
		System.out.println( d2 );                  //  onbekend (ergens)
	}
*/


//======================== code om Groep (opgave 1) te testen ========================

/*
	//---------------------- code om opgave 1(b) te testen --------------------
	//
	public static void main(String[] args) {
		Groep g = new Groep( "Jan", "Javaweg 1", 5 );
		System.out.println( g );                      //  Jan (Javaweg 1): 5
		System.out.println( g.getContactgegevens() ); //  Jan (Javaweg 1)
	}
*/


//======================== code om Kroeg (opgave 2) te testen ========================

/*
	//---------------------- code om opgave 2(b) te testen --------------------
	//
	public static void main(String[] args) {
		Kroeg k = new Kroeg();
		k.bekijk();
		                                             // bar: leeg
		                                             // wachtrij: leeg
		k.toevoegen( "Haantje", "de Voorste", 2 );
		k.toevoegen( "Jan", "ergens", 3 );
		k.toevoegen( "Anna", "thuis", 2 );
		k.toevoegen( "P. Party", "0800-FEEST", 17 ); //  sorry, kan niet
		k.bekijk();
		                                             // bar: Haantje (de Voorste): 2
		                                             // wachtrij:
		                                             // * plek 0: Jan (ergens): 3
		                                             // * plek 1: Anna (thuis): 2
	}
*/


/*
	//---------------------- code om opgave 2(c) te testen --------------------
	//
	public static void main(String[] args) {
		Kroeg k = new Kroeg();
		k.toevoegen( "Haantje", "de Voorste", 2 );
		k.bekijk();
		                                           // bar: Haantje (de Voorste): 2
		                                           // wachtrij: leeg
		k.doorstroom();
		k.bekijk();
		                                           // bar: leeg
		                                           // wachtrij: leeg
		k.toevoegen( "Jan", "ergens", 3 );
		k.toevoegen( "Anna", "thuis", 4 );
		k.toevoegen( "Rik", "r@ik.nl", 1 );
		k.bekijk();
		                                           // bar: Jan (ergens): 3
		                                           // wachtrij:
		                                           // * plek 0: Anna (thuis): 4
		                                           // * plek 1: Rik (r@ik.nl): 1
		k.doorstroom();
		k.bekijk();
		                                           // bar: Anna (thuis): 4
		                                           // wachtrij:
		                                           // * plek 0: Rik (r@ik.nl): 1
	}
*/


/*
	//---------------------- code om opgave 2(d) te testen --------------------
	//
	public static void main(String[] args) {
		Kroeg k = new Kroeg();
		k.toevoegen( "Haantje", "de Voorste", 2 );
		k.toevoegen( "Anna", "thuis", 4 );
		k.toevoegen( "Jan", "ergens", 3 );
		k.toevoegen( "Rik", "r@ik.nl", 3 );
		k.toevoegen( "L. Aatste", "achteraf", 1 );
		k.bekijk();
		                                           // bar: Haantje (de Voorste): 2
		                                           // wachtrij:
		                                           // * plek 0: Anna (thuis): 4
		                                           // * plek 1: Jan (ergens): 3
		                                           // * plek 2: Rik (r@ik.nl): 3
		                                           // * plek 3: L. Aatste (achteraf): 1
		
		System.out.println( k.zoek( "Anna" ) );    //  0
		k.weggaan( "Anna", 1 );
		k.weggaan( "Jan", 100 );
		k.weggaan( "Rik", -20 );
		k.bekijk();
		                                           // bar: Haantje (de Voorste): 2
		                                           // wachtrij:
		                                           // * plek 0: Anna (thuis): 3
		                                           // * plek 1: Rik (r@ik.nl): 3
		                                           // * plek 2: L. Aatste (achteraf): 1
	}
*/


}