package ToetsHulp.Theorie.Oktober31_2022;

// code voor opgave 1
//
public class Vlag {

	public int grootte;
	public String kleur1, kleur2;

	public Vlag(int grootte, String k1, String k2) {
		this.grootte = grootte;
		this.kleur1 = k1;
		this.kleur2 = k2;

		// input validatie: te klein of te groot --> corrigeren
		if( 500 < grootte || grootte < 50) {
			if(grootte < 500) {
				grootte = 50;
			}
			else {
				grootte = 500;
			}
		}
	}

	public void printVlag() {
		System.out.println(grootte + " + " + kleur1 + " + " + kleur2);
	}

	public void printKleuren() {
		if(kleur2 == kleur1 || kleur2 == null) {
			System.out.println(kleur1);
		}
		else {
			System.out.println( kleur1 + " en " + kleur2);
		}
	}

	// let op: pas deze methode niet aan!
	public void setGrootte_werkend(int m) { grootte = m; }
}
