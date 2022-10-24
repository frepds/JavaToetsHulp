package ToetsHulp.Theorie.Juni14_2022.Antwoorden.Antwoorden;

public class Getal
{
	public int waarde;

	public Getal(int w) {
		//
		waarde = w;
	}

	public String toString() {
		//
		return "" + waarde;
	}


    // optellen met int
	public Getal plus(int x) {
		int waarde = this.waarde + x;	//de foute code had: waarde = waarde + x; Dus die verandert het attribuut waarde van this. Nu wordt een lokale var gmaakt met toevallig dezelfde naam.
		return new Getal(waarde);
	}


    // optellen met Getal
	public Getal plus(Getal getal) { 
		return new Getal( waarde + getal.waarde); // de foute code paste hier de waarde van getal aan en returnde getal.
	}


	//vb uit de toets
    public static void demo_getallen() {
        Getal vier = new Getal(4);
        Getal twaalf = vier.plus(8);

        System.out.println(vier);
        System.out.println(twaalf);


        Getal negenEnNegentig = new Getal(99);
        Getal drie = new Getal(3);

        Getal honderdTwee = negenEnNegentig.plus(drie);

        System.out.println(drie);
        System.out.println(negenEnNegentig);
        System.out.println(honderdTwee);
    }
}
