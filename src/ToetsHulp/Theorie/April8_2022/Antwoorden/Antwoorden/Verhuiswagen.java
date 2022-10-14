package ToetsHulp.Theorie.April8_2022.Antwoorden.Antwoorden;

public class Verhuiswagen
{
	private Doos[] dozen;

	public Verhuiswagen(int lengte) { dozen = new Doos[lengte]; }

	public void print() {
		System.out.println( "Verhuiswagen: ");
		for (int i = 0; i < dozen.length; i++) {
			System.out.println("plek " + i + ": " + dozen[i]);
		}
	}


	public boolean zetNeer(Doos doos, int plek) {
		if(plek >= 0 && plek < this.dozen.length) { //let op: arrays tellen van [0] t/m [array.lengte - 1]
			if(dozen[plek] != null) {
				System.out.println("fout: plek is al bezet");
				return false;
			}
			dozen[plek] = doos;
			return true;
		}
		else {
			System.out.println("fout: buiten bereik");
			return false;
		}
	}



	public int zetOpLaatsteVrijePlek(Doos doos) {
		for(int i = dozen.length - 1; i >= 0; i--) {
		   if(dozen[i] == null) {
			   // gevonden:
			   dozen[i] = doos;
			   return i; // klaar
		   }
	   }
	   return -1; // stond niks over in de toets, is ook niet beoordeeld. 
				  // Maar -1 klinkt wel logisch als 'foutcode'.
	}


    // vb. code uit de toets
	public static void demo_add_en_print() {
		Verhuiswagen v = new Verhuiswagen(4);
		v.print();
		v.zetNeer(new Doos("Doos 1"), 2);

		// vb. van de return van zetNeer(...)
		boolean b = v.zetNeer(new Doos("Doos 22"), 2);
		System.out.println(b);

		v.zetNeer(new Doos("Doos 333"), -1);

		v.print();
	}


    // vb. code uit de toets
	public static void demo_vrije_plek() {
		Verhuiswagen v = new Verhuiswagen(5);
		//zomaar wat vulling:
		v.zetNeer(new Doos("doos #1"), 2);
		v.zetNeer(new Doos("doos #22"), 3);
		v.print();

		// achterste plek zoeken:
		int vrijePlek = v.zetOpLaatsteVrijePlek(new Doos("doos #333"));
		System.out.println(vrijePlek);

		vrijePlek = v.zetOpLaatsteVrijePlek(new Doos("doos #4444"));
		System.out.println(vrijePlek);

		v.print();
	}
}
