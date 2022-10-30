package ToetsHulp.Theorie.Juni14_2022.Antwoorden.Antwoorden.Opgave5;// fouten kunnen zijn:
// - abstract mist/had aanwezig moeten zijn
// - klasse had interface moeten zijn (of andersom)
// - extends mist of verkeerde klasse wordt ge-extend
// - verkeerde lijst met te implementeren klasses
// - methode afwezig die aanwezig had moeten zijn (of andersom)
// - methode heeft verkeerde signatuur

public class Superman extends OnrechtBestrijder implements KanVliegen {

    public Superman() {
        super("42");
    }

    public Superman(String s) {
        this();
    }

    public double snelheid() {
        return -1;
    }

    //methode moet overschreven worden, omdat ie de naam van deze klasse moet returnen!
    public String specialeKracht() {
        return "Superman --> specialeKracht";
    }

    //methode moet overschreven worden, omdat ie de naam van deze klasse moet returnen!
    public String vermomming() {
        return "Superman --> vermomming";
    }
}
