package ToetsHulp.Theorie.April8_2022.Antwoorden.Antwoorden.Opgave6;

// digitale versie.

abstract class SpaceShip {
    public SpaceShip(String s, int y) {
    }

    // abstracte methode, dus GEEN body. 
    // Moet wel geimplementeerd worden in de klassen die deze klasse overerven (en niet abstract zijn)
    public abstract String ietsDoen();

    // er is alleen overwriting nodig als er een string (met naam v/d klasse + methode) wordt gereturnd.
    // Dus methode functie hoeft NOOIT overschreven te worden door een subklasse.
    public int functie(int x) {
        return 42;
    }

    // moet WEL geimplementeerd worden in ALLE klassen die deze klasse overerven,
    // omdat de eis is: return de naam v/d klasse + methode-naam,
    // en dat kan deze klasse niet regelen (behalve met instanceof).
    public String uitvoeren() {
        return "SpaceShip --> uitvoeren";
    }

    public String alleOverloading() {
        return "uitvoeren + gedrag";
    }
}


// 'papieren' klassendiagram.
//abstract class SpaceShip {
//
//    public SpaceShip(String s, int y) {
//    }
//
//    // abstracte methode, dus GEEN body. Moet wel geimplementeerd worden in de klassen die deze klasse overerven.
//    public abstract String ietsDoen();
//
//    // er is alleen overwriting nodig als er een string (met naam v/d klasse + methode) wordt gereturnd.
//    // Dus methode functie hoeft nooit overschreven te worden door een subklasse.
//    public int functie() {
//        return 42;
//    }
//
//    // moet wel geimplementeerd worden in ALLE klassen die deze klasse overerven,
//    // omdat de eis is: return de naam v/d klasse + methode-naam,
//    // en dat kan deze klasse niet regelen (behalve met instanceof).
//    public String uitvoeren() {
//        return "SpaceShip + uitvoeren";
//    }
//
//    public String alleOverloading() {
//        return "uitvoeren";
//    }
//}
