package ToetsHulp.Theorie.April8_2022.Antwoorden.Antwoorden;/*
public class TieFighter extends XWing implements StealthFighter
{
	public TieFighter() {
		super("42");  //of hier this(..) en bij de ander super(...)
	}

	public TieFighter(String s) { 
		this(); 
	}

	public int handeling() { return -1; }

    //methode moet overschreven worden, omdat ie de naam van deze klasse moet returnen!
	public String ietsDoen() { return "TieFighter --> ietsDoen"; }

    //methode moet overschreven worden, omdat ie de naam van deze klasse moet returnen!
	public String uitvoeren() { return "TieFighter --> uitvoeren"; }

}

*/

// papieren vesrie
public class TieFighter extends XWing implements StealthFighter
{
	public TieFighter() { super("42"); }

	public TieFighter(String s) { this(); }

	public int handeling() { return 42; }

    //methode moet overschreven worden, omdat ie de naam van deze klasse moet returnen!
	public String ietsDoen() { return "TieFighter " + "ietsDoen"; }

    //methode gedrag hoeft niet overschreven te worden.
    // parent klasse heeft al een goed gedrag (return een int)

    // moet wel geimplementeerd worden in ALLE klassen die deze klasse overerven,
    // omdat de eis is: return de naam v/d klasse + methode-naam,
    // en dat kan deze klasse niet regelen (behalve met instanceof).
	public String uitvoeren() { return "SpaceShip + uitvoeren"; }
}
