package ToetsHulp.NieuwePoging.Juni14_2022.Opgave3;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// code voor opgave 3

public class Geheimschrift {
	String[] code;

	public Geheimschrift(int lengte) {
		code = new String[lengte];
		maakGereed();
	}

	public void maakGereed() {
		for (int i = 0; i < code.length; i++) {
			code[i] = randomSymbool();
		}
	}

	public void print() {
		for (int i = 0; i < code.length; i++) {
			System.out.print(code[i]);
		}
		System.out.println();
	}

	public void verberg(int positie, int stap, String[] tekst) {
		if (tekst.length > code.length) {
			System.out.println("fout: Array te klein");
		} else {
			for (int i = 0; i < tekst.length; i++) {
				code[positie] = tekst[i];
				positie += stap;
			}
		}
	}

	// nodig voor randomSymbool()-methode
	public static Random random = new Random(1);

	// methode mag niet veranderd worden. Returnt een random teken
	private static String randomSymbool() {
		return "" + (char)(random.nextInt(5) + 42);
	}

	// methode mag niet veranderd worden. Decodeert het verborgen bericht.

	public String ontcijfer(int positie, int stap, int lengte) {
		return IntStream.range(0, code.length).filter(i -> ( (i - positie) % stap == 0)
						&& (i >= positie) && ( (i -positie) < lengte * stap ))
				.mapToObj(i -> code[i]) .collect(Collectors.joining(""));
	}


	// methode mag niet veranderd worden. Doet zelfde als verberg(...)-methode.
	/*
	public void cryptischeVerberg(int positie, int stap, String[] tekst) {
		code = IntStream.range(0, code.length).mapToObj(i -> ( ( (i - positie) % stap == 0)
				&& (i >= positie) && ( (i-positie) < tekst.length * stap  )
				? tekst[(i-positie)/stap] : code[i]) ).collect(Collectors.toList()).toArray(new String[0]);
	}
	 */
}
