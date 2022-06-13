package ToetsHulp.Theorie.April9.Antwoorden.Opgave4;

public class Munteenheid
{
	private String valuta;

	public Munteenheid(String valuta) {
		//
		this.valuta = valuta;
	}
	
	// we willen twee Munteenheden kunnen vergelijken. Dus een equals nodig (want het attribuut is private en er mochten ook geen getters gemaakt worden)
	public boolean equals(Object obj) {
		if (! (obj instanceof Munteenheid) ) { return false; }  // dit had uiteraard ook met een try-catch (ClassCastException ...) gekund.

		Munteenheid that = (Munteenheid) obj;
		return this.valuta.equals(that.valuta);
	
		// ze zijn gelijk als "de munteenheid-objecten dezelfde valuta hebben.", dus vergelijken met equals. 
		// Want Strings moet je altijd met equals vergelijken. Je weet namelijk nooit waar een String vandaan komt.
		// Het kan zijn dat de java compiler al bij het compileren van de java-byte-code kan zien dat het dezelfde Strings zijn
		// bv. als er staat: 
		//		String s1 = "bla";
		// 		String s2 = "bla";
		// In dat geval *mag* de compiler beslissen om die twee in hetzelfde geheugen op te slaan (en dan zou s1 == s2 true zijn)
		// maar het *hoeft niet*. Het hangt af van je besturingssysteem, java-versie, de kleur van de lucht of wat dan ook: geen garantie.
		// Soms *kan* de Java compiler het ook niet eens weten:
		// 		String s1 = "hoi";
		//		... ene heleboel andere code met een GUI en dialoog met een textfield.
		//		String s2 = dialoog.getText();
		// Nu kan de java compiler echt niet raden dat iemand "bla" gaat invullen. De strings kunnen dus niet op dezelfde plek worden
		// opgeslagen. Dus s1 == s2 is dan altijd false.
		// Zelfde geldt ook voor een string die je met "new" maakt:
		//		String s1 = "bla";
		//		String s2 = new String("bla"); 
		// Nu zijn ze ook twee verschillende objecten op 2 verschillende plekken in het geheugen (want dat is wat *new* doet)
												
	}
}
