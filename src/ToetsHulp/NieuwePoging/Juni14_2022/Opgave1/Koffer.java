package ToetsHulp.NieuwePoging.Juni14_2022.Opgave1;

// code voor opgave 1

import java.util.ArrayList;

public class Koffer {
    private int grootte;
	private String inhoud;
	private int code;
	private boolean inLockdown = false;

	public Koffer(int grootte) {
		this(grootte, "leeg");
	}

	public Koffer(int grootte, String inhoud) {
		if (grootte >= 10) { this.grootte = grootte; }
		else { this.grootte = 10; }
		this.inhoud = inhoud;
		System.out.println("nieuw: " + this.inhoud + " (" + this.grootte + ")");
	}

	public void setCode(int code) {
		if (this.code != 0) {
			System.out.println("mag niet");
			return;
		}
		if (code >= 1000 && code <= 9999) {
			this.code = code;
		} else {
			System.out.println("mag niet");
		}
	}

	// voor vraag c
	public ArrayList<Koffer> verdeel(int aantal, String naam) {
		int nieuweGrootte;
		ArrayList<Koffer> lijstje;
		try {
			nieuweGrootte = 1 + grootte / aantal;
			lijstje = new ArrayList<>();
			for (int i = 0; i < aantal; i++) {
				String nieuweInhoud = inhoud + "_"
						+ naam.toLowerCase() + "#" + (i + 1);
				lijstje.add(new Koffer(nieuweGrootte, nieuweInhoud));
			}
		} catch (ArithmeticException e) {
			System.out.println("dat is wiskundig onmogelijk!");
			return null;
		} catch (NullPointerException e) {
			System.out.println("er is een fout opgetreden");
			return null;
		}
		return lijstje;
	}

	public String getInhoud(int code) {
		if (this.code == code && !inLockdown) {
			return grootte + ": " + inhoud;
		}
		if (code != this.code) {
			inLockdown = true;
		}
		return "---lockdown---";
	}
}
