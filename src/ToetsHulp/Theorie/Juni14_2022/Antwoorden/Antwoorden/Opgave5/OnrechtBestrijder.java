package ToetsHulp.Theorie.Juni14_2022.Antwoorden.Antwoorden.Opgave5;// puntentelling: elke klasse met een fout: 1 punt aftrek
// fouten kunnen zijn:
// - abstract mist/had aanwezig moeten zijn
// - klasse had interface moeten zijn (of andersom)
// - extends mist of verkeerde klasse wordt ge-extend
// - verkeerde lijst met te implementeren klasses
// - methode afwezig die aanwezig had moeten zijn (of andersom)
// - methode heeft verkeerde signatuur

class OnrechtBestrijder extends Held implements HeeftAartsvijand {

    public OnrechtBestrijder(int x) {
        super("blabla", 42);
    }

    public OnrechtBestrijder(String s) {
        this(42);
        // of: super("...", 42); // maakt niet uit. This kan ook in de andere constructor staan en dan hier een geschikte super(..) of super(..) in beide
    }

    // methode heeftXRayVision uit abstracte klasse Held
    // moet *niet* overschreven worden. Geeft een int terug. Dus kan volstaan met die uit de super klasse
    // want er moesten zo weinig mogelijk functies. Dus alleen als je een String (met naam v/d klasse)
    // moet returnen, zul je een functie moeten overschrijven.

    //methode moet overschreven worden omdat ie abstract is in de super klasse
    // (en dit is geen abstracte klasse, dus deze klasse moet 'm implementeren)
    public String specialeKracht() {
        return "OnrechtBestrijder --> specialeKracht";
    }

    public int kwetsbaar(boolean x) {
        return -1;
    }

    public int kwetsbaar(int y) {
        return -1;
    }

    //methode moet overschreven worden, omdat ie de naam van deze klasse moet returnen!
    // en dat doet de methode in de superklasse niet.
    public String vermomming() {
        return "OnrechtBestrijder --> vermomming";
    }
}
