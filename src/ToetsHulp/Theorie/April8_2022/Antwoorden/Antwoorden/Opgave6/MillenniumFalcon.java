package ToetsHulp.Theorie.April8_2022.Antwoorden.Antwoorden.Opgave6;
// 'digitale' versie klassendiagram.

public class MillenniumFalcon extends SpaceShip {
    public MillenniumFalcon() {
        super("Jar Jar Binks!", 42);
    }

    // methode 'functie' uit abstracte klasse SpaceShip
    // moet NIET overschreven worden. Geeft een int terug.

    // moet geimplementeerd worden omdat ie abstract is in de parent klasse.
    public String ietsDoen() {
        return "MillenniumFalcon --> ietsDoen";
    }

    // moet geimplementeerd worden (overwriting), vanwege de inhoud van wat gereturnd moet worden.
    public String uitvoeren() {
        return "MillenniumFalcon --> uitvoeren";
    }

    // moet geimplementeerd worden. Deze methode wordt niet overgeerft maar heeft "toevallig"
    // dezelfde naam als een andere methode die wel van de abstracte klasse afkomt (overloading).
    public int uitvoeren(int x) {
        return 42;
    }

    // moet geimplementeerd worden. Deze methode wordt niet overgeerft maar heeft "toevallig"
    // dezelfde naam als een andere methode die wel van de abstracte klasse afkomt (overloading).
    // Is GEEN geval van overloading, aangezien er geen methode met dezelfde naam in deze klasse aanwezig is.
    // (maar toevallig wel eentje in de interface StealthFighter die niks met deze klasse te maken heeft)
    public int handeling(int y, int z) {
        return 42;
    }
}


// papieren versie klassendiagram.

//public class MillenniumFalcon extends SpaceShip {
//
//    public MillenniumFalcon() {
//        super("Jar Jar Binks!", 42);
//    }
//
//    // moet geimplementeerd worden (overwriting), vanwege de inhoud van wat gereturnd moet worden.
//    public String ietsDoen() {
//        return "MillenniumFalcon + ietsDoen";
//    }
//
//    // moet NIET geimplementeerd worden, omdat de 'parent'klasse al een geschikte invulling heeft.
//    //public int functie() {
//    // return ....;
//    //}
//
//    // moet geimplementeerd worden (overwriting), vanwege de inhoud van wat gereturnd moet worden.
//    public String uitvoeren() {
//        return "MillenniumFalcon + uitvoeren";
//    }
//
//    // moet geimplementeerd worden. Deze methode wordt niet overgeerft maar heeft "toevallig"
//    // dezelfde naam als een andere methode die wel van de abstracte klasse afkomt (overloading).
//    public int uitvoeren(int x, int y) {
//        return 42;
//    }
//}
