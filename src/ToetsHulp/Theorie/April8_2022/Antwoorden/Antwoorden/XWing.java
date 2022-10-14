package ToetsHulp.Theorie.April8_2022.Antwoorden.Antwoorden;/*
class XWing extends SpaceShip implements Fighter
{
	public XWing(int x) { 
		super("XWing", 42);  
		// of met this(..) naar de andere constructor doorverwijzen en daar super(..) gebruiken
	}

	public XWing(String s) {
		this(42);
	}

    // methode 'functie' uit abstracte klasse SpaceShip
    // moet NIET overschreven worden. Geeft een int terug. Dus kan volstaan met die uit de super klasse
    // want er moesten zo weinig mogelijk functies. Dus alleen als je een String (met naam v/d klasse)
    // moet returnen, zul je een functie moeten overschrijven.


    //methode moet overschreven worden omdat ie abstract is in de super klasse
    // (en dit is geen abstracte klasse, dus deze klasse moet 'm implementeren)
	public String ietsDoen() { return "XWing " + "ietsDoen"; }

	//methode uit interface: moet sowieso geimplementeerd worden hier want interface heeft geen body
	public int gedrag(double x) { return -1; }

	//methode uit interface: moet sowieso geimplementeerd worden hier want interface heeft geen body
	public int gedrag(int y) { return -1; }

    //methode MOET overschreven worden, omdat ie de naam van deze klasse moet returnen!
    // en dat doet de methode in de superklasse niet.
	public String uitvoeren() { return "XWing --> uitvoeren"; }
}
*/


// papieren versie
class XWing extends SpaceShip implements Fighter
{
	public XWing(int x) { super("XWing", 42); }

	public XWing(String s) {
		this(42);
		// of: super("...", 42); // maakt niet uit. This kan ook in de andere constructor staan en dan hier een geschikte super(..)
	}

	//methode moet overschreven worden omdat ie abstract is in de super klasse
    // (en dit is geen abstracte klasse, dus deze klasse moet 'm implementeren)
	public String ietsDoen() { return "XWing " + "ietsDoen"; }

    //methode moet overschreven worden, omdat ie de naam van deze klasse moet returnen!
    // en dat doet de methode in de superklasse niet.
	public String uitvoeren() { return "XWing + uitvoeren"; }

    // deze moet. (Hij heeft toevallig wel dezelfde naam als de methode uit een interface
    // die niet door deze klas geimplementeerd wordt)
	public int handeling(String s, int z) { return -1; }

    // moet, vanwege interface Fighter
	public int gedrag(double x) { return 0; }
}
