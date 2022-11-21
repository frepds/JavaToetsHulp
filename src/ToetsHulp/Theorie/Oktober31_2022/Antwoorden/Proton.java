package ToetsHulp.Theorie.Oktober31_2022.Antwoorden;

public class Proton extends Konkreetioniet implements Ukrainium {

    public Proton() {
        super("42");
    }

    public Proton(String s) {
        this();
    }

    // methode kleur(int) uit abstracte klasse Abstracton
    // moet *niet* overschreven worden. returnt een int en dat is al goed.
//    public double kleur(int x) {
//        return ...;
//    }

    //methode moet overschreven worden, omdat ie de naam van deze klasse moet returnen!
    public String gewicht() {
        return "Proton --> gewicht";
    }


    // methodes vanwege de Ukrainium interface:
    public int kracht(boolean x) {
        return 0;
    }

    public int kracht(int y) {
        return 0;
    }
}
