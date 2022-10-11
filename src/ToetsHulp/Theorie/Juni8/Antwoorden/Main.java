package ToetsHulp.Theorie.Juni8.Antwoorden;

import ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.Garage;
import ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.Vliegtuig;

public class Main {

    // Het is uiteraard geen probleem als testcode in de main uitgecomment wordt.
    public static void main(String[] args) {
        Garage garage = new Garage();
        Vliegtuig f16 = new Vliegtuig("F-16");
        System.out.println(f16);
        garage.zetInGarage(f16);

        //garage.upgrade___FOUT___(".upgrade"); //bug
        garage.upgrade( ".upgrade" ); //geen bug

        // Waarom is de naam van f16 niet veranderd in "F-16.upgrade" na upgrade(...) ?
        System.out.println(f16);
    }
}
