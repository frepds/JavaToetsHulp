package ToetsHulp.NieuwePoging.Juni14_2022;

import ToetsHulp.NieuwePoging.Juni14_2022.Opgave1.Koffer;
import ToetsHulp.NieuwePoging.Juni14_2022.Opgave2.Spoorlijn;
import ToetsHulp.NieuwePoging.Juni14_2022.Opgave3.Geheimschrift;
import ToetsHulp.NieuwePoging.Juni14_2022.Opgave4.Getal;

import java.util.ArrayList;

public class Main {



//======================== code om Koffer (opgave 1) te testen ========================


	//---------------------- code om opgave 1(a) te testen --------------------
//	public static void main(String[] args) {
//		Koffer k1 = new Koffer(555, "JAVA-boek");  //>>   nieuw: JAVA-boek (555)
//		Koffer k2 = new Koffer(3);                 //>>   nieuw: leeg (10)
//	}


	//---------------------- code om opgave 1(b) te testen --------------------
	//
//	public static void main(String[] args) {
//		Koffer k1 = new Koffer(77, "mobieltje");  //>>   nieuw: mobieltje (77)
//		 // te klein of te groot
//		k1.setCode(1);                            //>>   mag niet
//		k1.setCode(1000000);                      //>>   mag niet
//
//		 // goed
//		k1.setCode(5678);
//
//		 // mag maar 1x ingesteld worden
//		k1.setCode(1234);                         //>>   mag niet
//	}


	//---------------------- code om opgave 1(c) te testen --------------------
	//
//	public static void main(String[] args) {
//		String input = null;
//		Koffer k1 = new Koffer(33, "laptop");  //>>   nieuw: laptop (33)
//
//		ArrayList<Koffer> lijstje;
//		lijstje = k1.verdeel(2, "DEEL");       //>>   nieuw: laptop_deel#1 (17)
//		                                       //>>   nieuw: laptop_deel#2 (17)
//
//		 // gevulde Arraylist (inhoud niet belangrijk voor deze vraag).
//		System.out.println(lijstje.size());    //>>   2
//
//		lijstje = k1.verdeel(0, "oeps!");      //>>   dat is wiskundig onmogelijk!
//		System.out.println(lijstje);           //>>   null
//
//		lijstje = k1.verdeel(1, input);        //>>   er is een fout opgetreden
//		System.out.println(lijstje);           //>>   null
//	}


	//---------------------- code om opgave 1(d) te testen --------------------
	//
//	public static void main(String[] args) {
//		Koffer k1 = new Koffer(50, "telefoon");  //>>   nieuw: telefoon (50)
//		k1.setCode(7777);
//
//		System.out.println(k1.getInhoud(3400));  //>>   ---lockdown---
//		System.out.println(k1.getInhoud(5600));  //>>   ---lockdown---
//
//		 // goede code werkt ook niet meer
//		System.out.println(k1.getInhoud(7777));  //>>   ---lockdown---
//		k1.setCode(7777);                        //>>   mag niet
//
//		Koffer k2 = new Koffer(33, "boek");      //>>   nieuw: boek (33)
//		k2.setCode(1234);
//		System.out.println(k2.getInhoud(1234));  //>>   33: boek
//	}


//======================== code om Spoorlijn (opgave 2) te testen ========================


	//---------------------- code om opgave 2(a) te testen --------------------
	//
//	public static void main(String[] args) {
//		Spoorlijn een = new Spoorlijn("IC");
//		een.voegStationToe("Zwolle");
//		een.voegStationToe("Deventer");
//
//		Spoorlijn twee = new Spoorlijn("Sprinter");
//		twee.voegStationToe("Zwolle");
//		twee.voegStationToe("Heino");
//		twee.voegStationToe("Raalte");
//		twee.voegStationToe("Wierden");
//		twee.voegStationToe("Deventer");
//
//		 // begin- en eindpunt hetzelfde
//		System.out.println(een.equals(twee));  //>>   true
//
//		Spoorlijn drie = new Spoorlijn("IC");
//		drie.voegStationToe("Deventer");
//		drie.voegStationToe("Zwolle");
//
//		 // eindpunt van ene is beginpunt van de ander, en andersom.
//		System.out.println(een.equals(drie));  //>>   true
//
//		Spoorlijn vier = new Spoorlijn("stoomtrein");
//		vier.voegStationToe("Zwolle");
//		vier.voegStationToe("Middle-of-Nowhere");
//
//		 // ander begin- of eindpunt
//		System.out.println(een.equals(vier));  //>>   false
//	}


	//---------------------- code om opgave 2(b) te testen --------------------
	//
//	public static void main(String[] args) {
//		Spoorlijn.printLangste();  //>>   null
//
//		Spoorlijn een = new Spoorlijn("IC");
//		een.voegStationToe("Zwolle");
//		een.voegStationToe("Deventer");
//
//		Spoorlijn.printLangste();  //>>   IC: Zwolle --> Deventer (2)
//
//		 // Spoorlijn twee is langer dan Spoorlijn een, dus twee wordt onthouden
//		Spoorlijn twee = new Spoorlijn("Sprinter");
//		twee.voegStationToe("Zwolle");
//		twee.voegStationToe("Wezep");
//		twee.voegStationToe("Nunspeet");
//		twee.voegStationToe("Harderwijk");
//		twee.voegStationToe("Utrecht");
//
//		Spoorlijn.printLangste();  //>>   Sprinter: Zwolle --> Utrecht (5)
//
//		 // Spoorlijn drie is korter dan de langste
//		Spoorlijn drie = new Spoorlijn("Sprinter");
//		drie.voegStationToe("Groningen");
//		drie.voegStationToe("Assen");
//		drie.voegStationToe("Zwolle");
//
//		Spoorlijn.printLangste();  //>>   Sprinter: Zwolle --> Utrecht (5)
//	}


//======================== code om Geheimschrift (opgave 3) te testen ========================

	//---------------------- code om opgave 3(b) te testen --------------------
	//
//	public static void main(String[] args) {
//		Geheimschrift g = new Geheimschrift(6);
//		g.print();  //>>   *-,-..
//	}



	//---------------------- code om opgave 3(c) te testen --------------------
	//
//	public static void main(String[] args) {
//		Geheimschrift g = new Geheimschrift(12);
//		g.print();                        //>>   *-,-...+--.-
//
//		String[] java = {"J", "A", "V", "A"};
//		g.verberg(3, 2, java);
//		g.print();                        //>>   *-,J.A.V-A.-
//
//		 // ------------- decoderen met de juiste start en stap ---------------
//
//		String decoded = g.ontcijfer(3, 2, java.length);
//		System.out.println(decoded);      //>>   JAVA
//
//		 // ------- decoderen met verkeerde start of stap werkt niet --------
//
//		String decodedFout = g.ontcijfer(4, 2, java.length);
//		System.out.println(decodedFout);  //>>   ..-.
//
//		decodedFout = g.ontcijfer(3, 4, java.length);
//		System.out.println(decodedFout);  //>>   JV-
//
//		 // ---------------------------- past nog net! ----------------------------
//
//		Geheimschrift g2 = new Geheimschrift(16);
//		g2.verberg(1, 4, java);
//		g2.print();                       //>>   ,J,.,A+.+V*..A--
//		decoded = g2.ontcijfer(1, 4, java.length);
//		System.out.println(decoded);      //>>   JAVA
//
//		 // ----------------------------- past niet! ------------------------------
//
//		Geheimschrift teKlein = new Geheimschrift(7);
//		String[] pastNiet = {"P", "A", "S", "T", " ", "N", "I", "E", "T"};
//		teKlein.verberg(1, 2, pastNiet);  //>>   fout: Array te klein
//
//		 // de array is niet veranderd:
//		teKlein.print();                  //>>   ,,*.*+-
//	}


//======================== code om Getal (opgave 4) te testen ========================


	//---------------------- code om opgave 4 te testen --------------------
	//
	public static void main(String[] args) {
		Getal vier = new Getal(4);
		Getal twaalf = vier.plus(8);
		
		System.out.println(vier);             //>>   Getal: 4
		System.out.println(twaalf);           //>>   Getal: 12
		
		Getal negenEnNegentig = new Getal(99);
		Getal drie = new Getal(3);
		
		Getal honderdTwee = negenEnNegentig.plus(drie);
		
		System.out.println(drie);             //>>   Getal: 3
		System.out.println(negenEnNegentig);  //>>   Getal: 99
		System.out.println(honderdTwee);      //>>   Getal: 102
	}

}