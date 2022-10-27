package ToetsHulp.NieuwePoging.April8_2022;

import ToetsHulp.NieuwePoging.April8_2022.Opgave2.ZomaarEenKlasse;
import ToetsHulp.NieuwePoging.April8_2022.Opgave3.Meting;
import ToetsHulp.NieuwePoging.April8_2022.Opgave4.Gevangene;
import ToetsHulp.NieuwePoging.April8_2022.Opgave5.Cel;

public class Main {



//======================== code om Verhuiswagen (opgave 1) te testen ========================


	//---------------------- code om opgave 1(b) te testen --------------------
	//
//	public static void main(String[] args) {
//		Verhuiswagen v = new Verhuiswagen(4);
//		v.print();                                              //>   Verhuiswagen:
//		                                                        //>   plek 0: null
//		                                                        //>   plek 1: null
//		                                                        //>   plek 2: null
//                                                                //>   plek 3: null
//		v.zetNeer(new Doos("Doos 1"), 2);
//
//        // vb. van de return van zetNeer(...)
//		boolean b = v.zetNeer(new Doos("Doos 22"), 2);  //>   fout: plek is al bezet
//		System.out.println(b);                                  //>   false
//
//		v.zetNeer(new Doos("Doos 333"), -1);            //>   fout: buiten bereik
//
//		v.print();                                              //>   Verhuiswagen:
//		                                                        //>   plek 0: null
//                                                                //>   plek 1: null
//		                                                        //>   plek 2: Doos 1
//		                                                        //>   plek 3: null
//	}



	//---------------------- code om opgave 1(c) te testen --------------------
	//
//	public static void main(String[] args) {
//		Verhuiswagen v = new Verhuiswagen(5);
//		// zomaar wat vulling:
//		v.zetNeer(new Doos("doos #1"), 2);
//		v.zetNeer(new Doos("doos #22"), 3);
//		v.print();                      //>   Verhuiswagen:
//		                                //>   plek 0: null
//		                                //>   plek 1: null
//		                                //>   plek 2: doos #1
//		                                //>   plek 3: doos #22
//		                                //>   plek 4: null
//
//		// achterste plek zoeken:
//		int vrijePlek = v.zetOpLaatsteVrijePlek(new Doos("doos #333"));
//		System.out.println(vrijePlek);  //>   4
//
//		vrijePlek = v.zetOpLaatsteVrijePlek(new Doos("doos #4444"));
//		System.out.println(vrijePlek);  //>   1
//
//		v.print();                      //>   Verhuiswagen:
//		                                //>   plek 0: null
//		                                //>   plek 1: doos #4444
//		                                //>   plek 2: doos #1
//		                                //>   plek 3: doos #22
//		                                //>   plek 4: doos #333
//	}





//======================== code om ZomaarEenKlasse (opgave 2) te testen ========================


	//---------------------- code om opgave 2(a) te testen --------------------
	//
//	public static void main(String[] args) {
//		 // debuggen staat aan. Vanaf nu wordt er geprint en geteld:
//		ZomaarEenKlasse.printDebugging();             //>   debug: true
//		                                              //>   0 keer geprint
//
//		ZomaarEenKlasse s = new ZomaarEenKlasse(40);  //>   ZomaarEenKlasse(40)
//		s.berekening(2);                              //>   waarde --> 42
//		ZomaarEenKlasse s2 = new ZomaarEenKlasse(2);  //>   ZomaarEenKlasse(2)
//
//		ZomaarEenKlasse.printDebugging();             //>   debug: true
//		                                              //>   3 keer geprint
//
//		 // debuggen uitzetten: er wordt vanaf hier niks geprint of geteld.
//		ZomaarEenKlasse.debug = false;
//
//		 // een heleboel constructors en methodes (allemaal niet geprint of geteld)
//		s.berekening(1);
//		s.berekening(1111);
//		s2 = new ZomaarEenKlasse(777);
//		s2.berekening(22);
//		ZomaarEenKlasse s3 = new ZomaarEenKlasse(987);
//		 // etc... etc ...
//
//		 // teller is onveranderd:
//		ZomaarEenKlasse.printDebugging();             //>   debug: false
//		                                              //>   3 keer geprint
//
//		 // debuggen weer aanzetten. Er wordt weer geprint/geteld:
//		ZomaarEenKlasse.debug = true;
//
//		ZomaarEenKlasse s4 = new ZomaarEenKlasse(1);  //>   ZomaarEenKlasse(1)
//		s.berekening(-1);                             //>   waarde --> 1153
//
//		ZomaarEenKlasse.printDebugging();             //>   debug: true
//		                                              //>   5 keer geprint
//	}


//======================== code om Meting (opgave 3) te testen ========================


	//---------------------- code om opgave 3(a) te testen --------------------
	//
//	public static void main(String[] args) {
//		 // 10 graden Celsius in Zwolle (= 10 + 273 = 283 Kelvin)
//		 // Hiermee worden alle andere Meting-objecten vergeleken
//		Meting c10 = new Meting(10, true, "Zwolle");
//		System.out.println( c10.waardeInKelvin() );             //>   283
//
//		 // locatie en temperatuur gelijk:
//		Meting c10_nogEenKeer = new Meting(10, true, "Zwolle");
//		System.out.println( c10.equals(c10_nogEenKeer) );       //>   true
//
//		 // locatie en temperatuur gelijk (want 10 Celsius is 283 Kelvin)
//		Meting k283 = new Meting(283, false, "Zwolle");
//		System.out.println( c10.equals(k283) );                 //>   true
//
//		 // locatie ongelijk:
//		Meting c10_elders = new Meting(10, true, "Rotterdam");
//		System.out.println( c10.equals(c10_elders) );           //>   false
//
//		 // temperatuur ongelijk, want 10 graden Celsius is 283 Kelvin
//		Meting k10 = new Meting(10, false, "Zwolle");
//		System.out.println( c10.equals(k10) );                  //>   false
//
//		 // ongelijke temperatuur
//		Meting c273 = new Meting(273, true, "Zwolle");
//		System.out.println( c10.equals(c273) );                 //>   false
//
//		 // geen Meting als input
//		System.out.println( c10.equals("10 graden Celsius") );  //>   false
//	}


//======================== code om Gevangene (opgave 4) te testen ========================


	//---------------------- code om opgave 4(a) te testen --------------------
	//
//	public static void main(String[] args) {
//		int wachtwoord = 1234567;
//		Gevangene g = new Gevangene("Murdoc");
//		 // g.straf = 1;  // uiteraard moet dit ook onmogelijk zijn
//		System.out.println(g);       //>   Murdoc (straf: 0)
//
//		 // kan niet, verkeerd wachtwoord
//		g.geefStraf(111111, 99);     //>   mag niet!
//		System.out.println(g);       //>   Murdoc (straf: 0)
//
//		 // geldig wachtwoord:
//		g.geefStraf(wachtwoord, 10);
//		System.out.println(g);       //>   Murdoc (straf: 10)
//
//		 // mag niet, geefStraf(...) is al een keer succesvol uitgevoerd
//		g.geefStraf(wachtwoord, 5);  //>   mag niet!
//		System.out.println(g);       //>   Murdoc (straf: 10)
//
//		 // Aanroepen van verminder(...) kan ook alleen met het juiste wachtwoord.
//		g.verminder(90000);          //>   mag niet!
//		g.verminder(wachtwoord);
//		g.verminder(wachtwoord);
//		System.out.println(g);       //>   Murdoc (straf: 8)
//	}



	//---------------------- code om opgave 4(b) te testen --------------------
	//
//	public static void main(String[] args) {
//		int wachtwoord = 1234567;
//		Gevangene g = new Gevangene("Murdoc");
//		g.geefStraf(wachtwoord, -7);
//		System.out.println(g);   //>   Murdoc (straf: -7)
//
//		Gevangene g2 = new Gevangene("Harry Houdini");
//		g2.geefStraf(wachtwoord, 1);
//		g2.verminder(wachtwoord);
//		g2.verminder(wachtwoord);
//		System.out.println(g2);  //>   Harry Houdini (straf: -1)
//	}


//======================== code om Cel (opgave 5) te testen ========================


	//---------------------- code om opgave 5(a) te testen --------------------
	//
//	public static void main(String[] args) {
//		Cel alcatraz = new Cel();
//		alcatraz.setGevangene("Murdoc", 1);
//		System.out.println(alcatraz);  //>   Cel: # Murdoc (straf: 1) #
//
//		alcatraz.jaarwisseling();
//		System.out.println(alcatraz);  //>   Cel: # Murdoc (straf: 0) #
//
//		alcatraz.laatVrij();
//		System.out.println(alcatraz);  //>   Cel: # null #
//
//		 // hier kan een crash ontstaan als de methodes er niet tegen beschermd zijn
//		alcatraz.jaarwisseling();      //>   Cel is leeg!
//		alcatraz.laatVrij();           //>   Cel is leeg!
//	}



	//---------------------- code om opgave 5(c) te testen --------------------
	//
	public static void main(String[] args) {
		Cel alcatraz = new Cel();
		alcatraz.setGevangene("Harry Houdini", 100);
		System.out.println(alcatraz);  //>   Cel: # Harry Houdini (straf: 100) #

		 // iemand vraagt gegevens op
		Gevangene g = alcatraz.getGevangene();
		System.out.println(g);         //>   Harry Houdini (straf: 100)

		 // en heeft juiste wachtwoord
		for(int i = 0; i < 1000; i++) { g.verminder(1234567); }
		 // dus g is veranderd
		System.out.println(g);         //>   Harry Houdini (straf: 0)

		 // maar attribuut gevangene is niet veranderd
		System.out.println(alcatraz);  //>   Cel: # Harry Houdini (straf: 100) #

		 // dus vrijlaten gebeurt niet
		alcatraz.laatVrij();
		System.out.println(alcatraz);  //>   Cel: # Harry Houdini (straf: 100) #
	}


}