package ToetsHulp.Theorie.Oktober31_2022;

public class Main {


//======================== code om Vlag (opgave 1) te testen ========================

/*
	//---------------------- code om opgave 1(a) te testen --------------------
	//
	public static void main(String[] args) {
		Vlag v = new Vlag(77, "blauw", "geel");
		v.printVlag();         //>>   77 + blauw + geel
		System.out.println(v); //>>   77 + blauw + geel
		
		 // v.grootte = -98765;  // niet meer mogelijk!
		v = new Vlag(-98765, "blauw", "geel");  // te klein: wordt 50
		v.printVlag();         //>>   50 + blauw + geel
		
		v = new Vlag(1234567, "blauw", "geel");  // te groot: wordt 500
		v.printVlag();         //>>   500 + blauw + geel
		
		v = new Vlag(444, "blauw", "geel");  // binnen bereik. grootte wordt 444.
		v.printVlag();         //>>   444 + blauw + geel
		System.out.println(v); //>>   444 + blauw + geel
	}
*/


/*
	//---------------------- code om opgave 1(b) te testen --------------------
	//
	public static void main(String[] args) {
		 // vb #1: 2x zelfde kleur opgegeven
		Vlag v_kleuren = new Vlag(300, "blauw", "blauw");
		v_kleuren.printVlag();    //>>   300 + blauw + blauw
		v_kleuren.printKleuren(); //>>   blauw
		
		 // vb #2: ook 2x zelfde kleur.
		 // Maar de tweede kleur krijgen we via gebruikers-input (bv. een dialoog)
		 // Dat simuleren we hier door een nieuwe String te maken met new(...)
		String input = new String("donkerwit");
		Vlag v_input = new Vlag(77, "donkerwit", input);
		
		v_input.printVlag();      //>>   77 + donkerwit + donkerwit
		v_input.printKleuren();   //>>   donkerwit
		
		 // vb #3: tweede kleur is null.
		Vlag v_1kleur = new Vlag(450, "zwart", null);
		v_1kleur.printVlag();     //>>   450 + zwart + null
		v_1kleur.printKleuren();  //>>   zwart
	}
*/


//======================== code om VlaggenWinkel (opgave 1) te testen ========================

/*
	//---------------------- code om opgave 1(c) te testen --------------------
	//
	public static void main(String[] args) {
		VlaggenWinkel s = new VlaggenWinkel();
		Vlag mijn_vlag = s.maakVlag(60, "blauw", "geel");
		System.out.println(mijn_vlag);        //>>   60 + blauw + geel
		
		 // een vriend wil net zo'n vlag als ik heb, maar wat groter!
		Vlag vlag_voor_vriend = s.zelfdeAls(mijn_vlag, 444);
		System.out.println(vlag_voor_vriend); //>>   444 + blauw + geel
		
		 // ik verwacht dat mijn_vlag niet veranderd is:
		System.out.println(mijn_vlag);        //>>   60 + blauw + geel
	}
*/


//======================== code om Oplader (opgave 2) te testen ========================

/*
	//---------------------- code om opgave 2 te testen --------------------
	//
	public static void main(String[] args) {
		Land nl = new Land("NL", 31);
		Land nl_zelfde = new Land("Nederland", 31);
		Land usa = new Land("U.S.A.", 1);
		System.out.println(nl.equals(nl_zelfde));                     //>>   true
		System.out.println(nl.equals(usa));                           //>>   false
		
		 // alle andere worden met deze vergeleken: 5 kilowatt, Nederlands (code 31)
		Oplader _5kwNL = new Oplader(5, true, nl);
		
		 // ander object, zelfde gegevens:
		System.out.println(_5kwNL.equals(new Oplader(5, true, nl)));  //>>   true
		
		 // zelfde vermogen (5000 watt en 4992 watt) en zelfde land
		Oplader _5kw_ook_nl = new Oplader(4992, false, nl_zelfde);
		System.out.println(_5kwNL.equals(_5kw_ook_nl));               //>>   true
		
		 // 5 kiloWatt is niet gelijk aan 4111 watt (te groot verschil):
		Oplader _4111watt_nl = new Oplader(4111, false, nl);
		System.out.println(_5kwNL.equals(_4111watt_nl));              //>>   false
		
		 // 5 kiloWatt is niet gelijk aan 5 watt:
		Oplader _5watt_nl = new Oplader(5, false, nl);
		System.out.println(_5kwNL.equals(_5watt_nl));                 //>>   false
		
		 // ander land
		System.out.println(_5kwNL.equals(new Oplader(5, true, usa))); //>>   false
	}
*/


//======================== code om Speler (opgave 3) te testen ========================

/*
	//---------------------- code om opgave 3 te testen --------------------
	//
	public static void main(String[] args) {
		Speler.getAantalSpelers(); //>>   0 spelers
		Speler a = new Speler("a");
		a.printTeam();             //>>   team 1
		Speler.getAantalSpelers(); //>>   1 speler
		
		Speler bb = new Speler("bb");
		bb.printTeam();            //>>   team twee
		
		Speler ccc = new Speler("ccc");
		Speler dddd = new Speler("dddd");
		Speler eeeee = new Speler("eeeee");
		
		a.printTeam();             //>>   team 1
		bb.printTeam();            //>>   team twee
		ccc.printTeam();           //>>   team 1
		dddd.printTeam();          //>>   team twee
		eeeee.printTeam();         //>>   team 1
		
		Speler.getAantalSpelers(); //>>   5 spelers
	}
*/


//======================== code om Spel (opgave 5) te testen ========================

/*
	//---------------------- code om opgave 5(b) te testen --------------------
	//
	public static void main(String[] args) {
		Spel game = new Spel(5);
		game.print();                       //>>   [0]:  ---
		                                    //>>   [1]:  ---
		                                    //>>   [2]:  ---
		                                    //>>   [3]:  ---
		                                    //>>   [4]:  ---
		game.toevoegen(1, "Yvonne");
		game.toevoegen(1, 99);
		game.print();                       //>>   [0]:  ---
		                                    //>>   [1]: Speler Yvonne: 99 punten
		                                    //>>   [2]:  ---
		                                    //>>   [3]:  ---
		                                    //>>   [4]:  ---
		game.toevoegen(3, "Kevin");
		game.toevoegen(3, 3);
		game.toevoegen(0, "Jairo");
		game.toevoegen(0, 7);
		game.print();                       //>>   [0]: Speler Jairo: 7 punten
		                                    //>>   [1]: Speler Yvonne: 99 punten
		                                    //>>   [2]:  ---
		                                    //>>   [3]: Speler Kevin: 3 punten
		                                    //>>   [4]:  ---
		 // foutmeldingen:
		game.toevoegen(1, "Spuit Elf");     //>>   Fout: bezet!
		game.toevoegen(12345, "Spuit Elf"); //>>   Fout: ongeldige index!
		
		game.toevoegen(12345, 1);           //>>   Fout: ongeldige index!
		game.toevoegen(2, 44);              //>>   Fout: geen Speler!
		
		 // bestaande waarde ophogen:
		game.toevoegen(1, 5);
		game.print();                       //>>   [0]: Speler Jairo: 7 punten
		                                    //>>   [1]: Speler Yvonne: 104 punten
		                                    //>>   [2]:  ---
		                                    //>>   [3]: Speler Kevin: 3 punten
		                                    //>>   [4]:  ---
	}
*/


/*
	//---------------------- code om opgave 5(c) te testen --------------------
	//
	public static void main(String[] args) {
		Spel game = new Spel(4);
		System.out.println(game.winnaar()); //>>   null
		game.toevoegen(0, "Jairo");
		game.toevoegen(2, "Yvonne");
		game.toevoegen(3, "Kevin");
		game.toevoegen(0, 3);
		game.toevoegen(2, 3);
		game.toevoegen(3, 1);
		game.print();                       //>>   [0]: Speler Jairo: 3 punten
		                                    //>>   [1]:  ---
		                                    //>>   [2]: Speler Yvonne: 3 punten
		                                    //>>   [3]: Speler Kevin: 1 punten
		
		System.out.println(game.winnaar()); //>>   Yvonne
		game.toevoegen(0, 987);
		game.print();                       //>>   [0]: Speler Jairo: 990 punten
		                                    //>>   [1]:  ---
		                                    //>>   [2]: Speler Yvonne: 3 punten
		                                    //>>   [3]: Speler Kevin: 1 punten
		
		System.out.println(game.winnaar()); //>>   Jairo
	}
*/


}