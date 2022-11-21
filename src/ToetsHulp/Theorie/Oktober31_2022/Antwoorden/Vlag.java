package ToetsHulp.Theorie.Oktober31_2022.Antwoorden;

public class Vlag {
    private int grootte;
    public String kleur1;
    public String kleur2;



/*
    // FOUTE constructor, zoals getoond in de toets en startcode
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
*/


    public Vlag(int grootte, String k1, String k2) {
        this.grootte = grootte;
        this.kleur1 = k1;
        this.kleur2 = k2;

        // input validatie: te klein of te groot --> corrigeren
        //
        // aangezien je het attribuut (this.groote) de goede waarde wilt geven,
        // moet je overal this.grootte gebruiken.
        // Dat lost alle problemen op. De variabele "grootte" verwijst naar de lokale variabele
        // die ontstaat bij aanroep van deze methode (om de input door te geven)
        //
        if (500 < this.grootte || this.grootte < 50) {
            // n.b. de volgorde van deze if is gek, maar dat is NIET fout.
            // Het zou logischer zijn om het als volgt te schrijven:
            // if(this.grootte < 50 || this.grootte > 500) ...
            // maar de if die hier staat is logisch gezien hettzelfde (en werkt ook gewoon, het is alleen niet zo leesbaar!)
            //
            // In de if gaat het ook goed (zolang je overal this hebt, anders ben je de lokale var. aan het aanpassen)
            // Want eerst check je dus met bovenstaande if of grootte NIET ok is (dus te groot of te klein)
            //
            // en dan WEET je dus al dat als de grootte < 500 is, en hij was te groot of te klein,
            // dat ie dan te klein moet zijn, vandaar dat je in de if(this.grootte < 500)
            // de waarde op 50 kunt zetten. Idem voor de else: dan was de waarde te groot.
            //
            // maar uiteraard kun je de logica ook veel netter schrijven. De gegeven code was expres
            // behoorlijk rommelig en zag er onlogisch uit.
            if (grootte < 500) {
                this.grootte = 50;    //HIER zit het probleem. grootte is de lokale variabele. this.grootte (het attribuut)
            } else {
                this.grootte = 500;  //idem.
            }
        }


        // alternatief:
        // veel kortere en leesbaardere manier om hetzelfde resultaat te krijgen:
        // (ook hier weer this nodig, omdat je het attribuut wilt veranderen.
        if (this.grootte < 50) {
            this.grootte = 50;
        }
        if (this.grootte > 500) {
            this.grootte = 500;
        }

        // nog een alternatief:
        // wat ook nog had gewerkt, was na de ingewikkelde if( ... ) { ... }
        // een regel: this.grootte = grootte;
        // want in de if pas je de variabele/input genaamd grootte aan.
        // en na de if(...) { .. } stop je dan die aangepaste waarde in het attribuut this.grootte.

    }


    public String toString() {
        return grootte + " + " + kleur1 + " + " + kleur2;
    }


    // let op: pas deze methode niet aan!
    public void setGrootte_werkend(int m) {
        grootte = m;
    }

    public void printVlag() {
        System.out.println(grootte + " + " + kleur1 + " + " + kleur2);
    }

    public static void main(String[] args) {
        _demo__constructor();
    }



/*
	// foute code, zoals in de toets gegeven:
	//
	public void printKleuren() 
	{
		if(kleur2 == kleur1 || kleur2 == null) {	 // <---- hier heb je equals nodig!
			System.out.println(kleur1);
		}
		else {
			System.out.println( kleur1 + " en " + kleur2);
		}
	}
*/


    public void printKleuren() {
        // let op: als je eerst kleur2.equals(kleur1) zou doen, krijg je een crash als kleur2 null is.
        // De reden dat dit werkt, is dat Java (en PHP, C#, etc) lui is. Als bij een if al duidelijk is,
        // dat het antwoord zeker true is omdat het eerste deel true is,
        // dan hoeft het tweede deel niet meer uitgevoerd te worden.
        //
        // Dus:
        //		if(A || B) {..}  met A true, zal B compleet negeren
        //				(en dus ook niet crashen, ook niet als er null.equals(..) gedaan wordt,
        //				want die code wordt helemaal niet uitgevoerd!)
        //
        // Maar je kunt natuurlijk met meerdere if's oplossen, bv.:
        //
        // 		if(A) { ... }
        // 		else if(B) { ...}
        //
        //
        // Je kunt het in deze opgave ook oplossen door kleur1.equals(kleur2),
        // omdat in de vraag stond dat kleur1 NOOIT null zal zijn, dus:
        //
        // 		if(kleur1.equals(kleur2)) { ...
        //
        if (kleur2 == null || kleur2.equals(kleur1)) {
            System.out.println(kleur1);
        } else {
            System.out.println(kleur1 + " en " + kleur2);
        }
    }


    // code/demo in toets:
    public static void _demo__constructor() {
        Vlag v = new Vlag(77, "blauw", "geel");
        v.printVlag();
        System.out.println(v);

        // v.grootte = -98765;  // niet meer mogelijk!
        v = new Vlag(-98765, "blauw", "geel"); // te klein: wordt 50
        v.printVlag();

        v = new Vlag(1234567, "blauw", "geel"); // te groot: wordt 500
        v.printVlag();

        v = new Vlag(444, "blauw", "geel"); // binnen bereik. grootte wordt 444.
        v.printVlag();
        System.out.println(v);
    }


    // code/demo in toets:
    public static void _demo__printKleuren() {
        // vb #1: 2x zelfde kleur opgegeven
        Vlag v_kleuren = new Vlag(300, "blauw", "blauw");
        v_kleuren.printVlag();
        v_kleuren.printKleuren();

        // vb #2: ook 2x zelfde kleur.
        // Maar de tweede kleur krijgen we via gebruikers-input (bv. een dialoog)
        // Dat simuleren we hier door een nieuwe String te maken met new(...)
        String input = new String("donkerwit");
        Vlag v_input = new Vlag(77, "donkerwit", input);

        v_input.printVlag();
        v_input.printKleuren();

        // vb #3: tweede kleur is null.
        Vlag v_1kleur = new Vlag(450, "zwart", null);
        v_1kleur.printVlag();
        v_1kleur.printKleuren();
    }
}
