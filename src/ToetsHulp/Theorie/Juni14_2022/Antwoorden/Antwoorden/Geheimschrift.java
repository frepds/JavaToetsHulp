package ToetsHulp.Theorie.Juni14_2022.Antwoorden.Antwoorden;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Geheimschrift
{
	public String[] code;
	

	public Geheimschrift(int lengte) {
		code = new String[lengte];
		maakGereed();
	}

	public void maakGereed() {
		for (int index = 0; index < code.length; index++) {
			code[index] = randomSymbool();
		}
	}

	public void print() {
		for (String letter : code) {
			System.out.print(letter);
		}
		System.out.println("");
	}



    //--------------------------------- c -----------------------------------------------------
	public void verberg(int positie, int stap, String[] tekst) {
		// voorste plek < 0
		if(positie < 0) {
			System.out.println("fout: Array te klein");
			return;
		}
		
		// laatste plek buiten de array
		if(positie + (tekst.length-1) * stap + 1 > code.length) {
			// gaat niet passen!
			System.out.println("fout: Array te klein");
			return;
		}
		
		/*		
		// Alternatieve methode om te bepalen of het past: 
		// In plaats van bovenstaande if(...)
		// Gewoon uitproberen in een for loop waarbij je 
		// steeds checkt met if of je buiten de array zit.
		// Zodra je een probleem tegenkomt: foutmelding printen
		// en stoppen. 
		// Als er geen probleem was, vul je daarna de array met de tekst.
		
		int test_positie = positie;
		for(int i = 0; i < tekst.length; i++) {
			//code[test_positie] = tekst[i];
			if(test_positie < 0 || test_positie >= code.length) {
				System.out.println("fout: Array te klein");
				return;
			}
			test_positie += stap;
		}
		
		*/

		// op elke zoveelste plek zetten, beginnend bij [positie]
		for(int i = 0; i < tekst.length; i++) {
			code[positie] = tekst[i];
			positie += stap;
		}
	}



	// vb uit de toets
	public static void demo_PrintenEnVullen() {
		Geheimschrift g = new Geheimschrift(6);
		g.print();
	}


	// vb uit de toets
	public static void demo_add_simpel() {
		Geheimschrift g = new Geheimschrift(12);
		g.print();

		String[] java = {"J", "A", "V", "A"};
		g.verberg(3, 2, java);
		g.print();

		// ------------- decoderen met de juiste start en stap ---------------
		//
		String decoded = g.ontcijfer(3, 2, java.length);
		System.out.println(decoded);

		// ------- decoderen met verkeerde start of stap werkt niet --------
		//
		String decodedFout = g.ontcijfer(4, 2, java.length);
		System.out.println(decodedFout);

		decodedFout = g.ontcijfer(3, 4, java.length);
		System.out.println(decodedFout);

		// ---------------------------- past nog net! ----------------------------
		//
		Geheimschrift g2 = new Geheimschrift(16);
		g2.verberg(1, 4, java);
		g2.print();
		decoded = g2.ontcijfer(1, 4, java.length);
		System.out.println(decoded);

		// ----------------------------- past niet! ------------------------------
		//
		Geheimschrift teKlein = new Geheimschrift(7);
		String[] pastNiet = {"P", "A", "S", "T", " ", "N", "I", "E", "T"};
		teKlein.verberg(1, 2, pastNiet);

		// de array is niet veranderd:
		teKlein.print();
	}




	// vb uit de toets
	public static void demo_add_foutmelding() {
		String[] past_niet = {"P", "A", "S", "T", " ", "N", "I", "E", "T"};
		Geheimschrift g = new Geheimschrift(7);
		g.print();

		// past niet!
		g.verberg(4, 3, past_niet);

		// de array is niet veranderd:
		g.print();
	}




	// nodig voor randomSymbool()-methode
	public static Random random = new Random(1);

    // methode mag niet veranderd worden. Returnt een random teken
	private static String randomSymbool() {
		return "" + (char)(random.nextInt(5) + 42);
	}


	// onderstaande twee methodes zijn expres zo vaag en onduidelijk mogelijk :-)
	// Er worden lambda expressies enzo gebruikt. Deze "obfucatie" is gedaan,
	// zodat je WEL een methode hebt om je code te testen, maar uit die code 
	// NIET kunt afleiden hoe je met arrays om moet gaan. 
	// Dat is immers de lesstof die getoetst wordt!

    // methode mag niet veranderd worden. Decodeert het verborgen bericht.
	public String ontcijfer(int positie, int stap, int lengte) {
		return IntStream .range(0, code.length).filter(i -> ( (i - positie) % stap == 0)
				&& (i >= positie) && ( (i -positie) < lengte * stap ))
				.mapToObj(i -> code[i]) .collect(Collectors.joining(""));
	}

    // methode mag niet veranderd worden. Doet zelfde als verberg(...)-methode.
	public void cryptischeVerberg(int positie, int stap, String[] tekst) {
		code = IntStream.range(0, code.length).mapToObj(i -> ( ( (i - positie) % stap == 0)
				&& (i >= positie) && ( (i-positie) < tekst.length * stap )
				? tekst[(i-positie)/stap] : code[i]) ).collect(Collectors.toList()).toArray(new String[0]);
	}

}
