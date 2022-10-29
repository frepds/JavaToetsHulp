package ToetsHulp.Theorie.Juni14_2022.Antwoorden.Antwoorden;// puntentelling: elke klasse met een fout: 1 punt aftrek
// fouten kunnen zijn:
// - abstract mist/had aanwezig moeten zijn
// - klasse had interface moeten zijn (of andersom)
// - extends mist of verkeerde klasse wordt ge-extend
// - verkeerde lijst met te implementeren klasses
// - methode afwezig die aanwezig had moeten zijn (of andersom)
// - methode heeft verkeerde signatuur

abstract class Held {

    public Held(String s, int y) {
    }

    // er is alleen overriding nodig als er een string (met naam v/d klasse + methode) wordt gereturnd.
    // Dus methode heeftXRayVision hoeft nooit overschreven te worden door een subklasse.
    public boolean heeftXRayVision(int x) {
        return true;
    }

    // moet wel geimplementeerd worden in *alle* klassen die deze klasse overerven,
    // omdat de eis is: return de naam v/d klasse + methode-naam,
    // en dat kan deze klasse niet regelen (behalve met instanceof).
    public String vermomming() {
        return "Held --> vermomming";
    }

    public String alleOverloading() {
        return "vermomming + kwetsbaar";
    }

    // abstracte methode, dus GEEN body. Moet wel geimplementeerd worden in de klassen die deze klasse overerven.
    public abstract String specialeKracht();
}
