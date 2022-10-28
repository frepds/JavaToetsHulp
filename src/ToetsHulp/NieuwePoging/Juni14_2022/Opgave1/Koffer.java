package ToetsHulp.NieuwePoging.Juni14_2022.Opgave1;

// code voor opgave 1

import java.util.ArrayList;

public class Koffer {
	private int grootte;
	private String inhoud;
	private int code;
	private boolean codeBoolean = false, lockdown = false;

	public Koffer(int grootte) {
		this(grootte, "leeg");
	}

	public Koffer(int grootte, String inhoud) {
		if (grootte < 10) {
			this.grootte = 10;
		} else {
			this.grootte = grootte;
		}
		this.inhoud = inhoud;
		System.out.println("nieuw: " + inhoud + "(" + grootte + ")");
	}

	public void setCode(int code) {
		if ((code > 1000 && code < 9999) && !codeBoolean) {
			this.code = code;
			codeBoolean = true;
		} else {
			System.out.println("mag niet");
		}
	}

	// voor vraag 3
	public ArrayList<Koffer> verdeel(int aantal, String naam) {
		int nieuweGrootte;
		ArrayList<Koffer> lijstje = new ArrayList<>();
		try {
			nieuweGrootte = 1 + grootte / aantal;
			for (int i = 0; i < aantal; i++) {
				String nieuweInhoud = inhoud + "_"
						+ naam.toLowerCase() + "#" + (i + 1);
				lijstje.add(new Koffer(nieuweGrootte, nieuweInhoud));
			}
		} catch (ArithmeticException e) {
			System.out.println("dat is wiskundig onmogelijk!");
			return null;
		} catch (Exception e) {
			System.out.println("er is een fout opgetreden");
			return null;
		}
		return lijstje;
	}

	public String getInhoud(int code) {
		if (code == this.code && !lockdown) {
			return grootte + ": " + inhoud;
		}
		if (code != this.code) {
			lockdown = true;
		}
		return "---lockdown---";
	}

}
