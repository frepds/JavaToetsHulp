package ToetsHulp.Praktijk.April7.Antwoorden;

import java.awt.*;

//mnc07: opgave 1(b) [BASIS: 2 PUNTEN]: basis van Docent (constr, attr.) Let op, punten voor toString() staan in Persoon
//
public class Docent extends  Persoon
{

	public Docent(String s) { super(s, 100); }

 // 
//mnc07: opgave 1(b) [ABSTRACTMETHOD: 1 PUNT]: overriding van abstracte methodes getBeschrijving en/of getSmiley
	
	public String getBeschrijving() { return "Docent"; }

	public String getSmiley() { return ":-P"; }

	public static void testConcreet1ToString() {
		//het vb. dat in de toets getoond werd.
		Docent x = new Docent( "Jan");
		System.out.println(x);
	}


	// in deze uitwerking is ervoor gekozen om de objecten zichzelf te laten tekenen, vandaar dat hier een GUI-gerelateerde methode staat.
	public void tekenMij(Graphics g, int x, int y) {
		//kleur op basis van blijheid
		g.setColor(getKleur());
		g.fillRect(x, y, 70, 70);
		g.setColor(Color.black); // lijntje eromheen voor de duidelijkheid (niet verplicht. Tekenen hoefde niet op de pixel precies).
		g.drawRect(x, y, 70, 70);
		onderschrift(g, x, y);
	}
}

