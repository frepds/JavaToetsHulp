package ToetsHulp.Theorie.Oktober31_2022.Antwoorden;

class Konkreetioniet extends Abstracton {

    public Konkreetioniet(int x) {
        super("Konkreetioniet", 42);
    }

    public Konkreetioniet(String s) {
        this(42);
        // of: super("...", 42); // maakt niet uit. This kan ook in de andere constructor staan en dan hier een geschikte super(..)
        // of in beide constructors super(...)
    }

    // methode kleur(int) moet niet overschreven worden. Eis was: zo min mogelijk methodes
    // en de Abstracton klasse implementeert de kleur(..) methode al.

    // moet geimplementeerd worden in *alle* klassen die deze klasse gaan overerven,
    // omdat de eis is: return de naam v/d klasse + methode-naam,
    // en dat kan deze klasse niet regelen (behalve met instanceof).
    public String gewicht() {
        return "Abstracton --> gewicht";
    }

    // GEEN geval van overloading, aangezien er GEEN methode met dezelfde naam in deze klasse aanwezig is.
    // (maar toevallig wel eentje in een interface die niks met deze klasse te maken heeft)
    public int vaagheid(int v) {
        return 42;
    }

    public int smaak() {
        return 42;
    }
}
