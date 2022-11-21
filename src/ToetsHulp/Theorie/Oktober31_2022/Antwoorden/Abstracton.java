package ToetsHulp.Theorie.Oktober31_2022.Antwoorden;

abstract class Abstracton {

    public Abstracton(String s, int y) {
    }

    // er is alleen overriding nodig als er een string (met naam v/d klasse + methode) wordt gereturnd.

    // Dus deze methode moet niet overschreven worden. (Wat de "parent" klasse returnt, is goed genoeg. 
    // De klasse die deze klasse gaat extenden, kan dus gewoon meeliften op deze methode.
    public double kleur(int x) {
        return 42;
    }


    // abstracte methode, dus GEEN body. Moet wel geimplementeerd worden in de klassen die deze klasse overerven.
    // maar returnt geen String, dus zodra deze methode ergens een body heeft, dan hoeft een klasse die die weer
    // extend, 'm niet te overschrijven
    public abstract int smaak();


    public String alleOverloading() {
        return "kracht + smaak";
    }

}
