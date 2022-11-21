package ToetsHulp.Theorie.Oktober31_2022.Antwoorden;

import java.util.ArrayList;

public class Spel {
    public Speler[] alleSpelers;

    public Spel(int aantalSpelers) {
        alleSpelers = new Speler[aantalSpelers];
    }

    public void toevoegen(int index, String naam) {
        if (index < 0 || index >= alleSpelers.length) {
            System.out.println("Fout: ongeldige index!");
            return; //klaar
        }

        if (alleSpelers[index] == null) {
            alleSpelers[index] = new Speler(naam);
        } else {
            // al bezet
            System.out.println("Fout: bezet!");
        }
    }

    public void toevoegen(int index, int punten) {

        if (index < 0 || index >= alleSpelers.length) {
            System.out.println("Fout: ongeldige index!");
            return; // klaar
        } else {
            // ok (en mag volgens de vraag niet null zijn, dus hoeven eigenlijk niet te checken
            if (alleSpelers[index] != null) {
                alleSpelers[index].punten += punten;
            } else {
                System.out.println("Fout: geen Speler!");
            }
        }
    }

    public void print() {
        String txt = "";
        for (int i = 0; i < alleSpelers.length; i++) {
            txt += "[" + i + "]: ";
            if (alleSpelers[i] == null) {
                txt += " ---   ";
            } else {
                txt += alleSpelers[i] + "    ";
            }
            txt = txt + "\n"; // enter
        }
        // Had natuurlijk ook elke keer een regel kunnen printen.
        // Maar de huidige oplossing, met het steeds groter maken v/d string
        // is ook heel makkelijk toe te passen bij een toString() methode
        // (en deze vraag ging eerst over een toString()).
        System.out.println(txt);
    }


    /************************************************ c **************************************************/
    /************************************************ c **************************************************/

    // "algoritme"
    public String winnaar() {
        int index_grootste = -1; // default een index die niet in de array kan voorkomen.
        double grootste_waarde = 0;
        for (int i = 0; i < alleSpelers.length; i++) {
            if (alleSpelers[i] != null) { // er kan een plek leeg zijn
                if (alleSpelers[i].punten >= grootste_waarde) {
                    // bij gelijke stand: nieuwe onthouden (want hoogste index)
                    // dus groter-of-gelijk-aan nodig.
                    index_grootste = i;
                    grootste_waarde = alleSpelers[i].punten;
                }
            }
        }
        //als niks gevonden, dan null returnen.
        if (index_grootste == -1) {
            return null;
        } else { // naam v/d Speler returnen
            return alleSpelers[index_grootste].naam;
        }
    }

    public static void demo_set_en_print() {
        Spel game = new Spel(5);
        game.print();
        game.toevoegen(1, "Yvonne");
        game.toevoegen(1, 99);
        game.print();
        game.toevoegen(3, "Kevin");
        game.toevoegen(3, 3);
        game.toevoegen(0, "Jairo");
        game.toevoegen(0, 7);
        game.print();
        // foutmeldingen:
        game.toevoegen(1, "Spuit Elf");
        game.toevoegen(12345, "Spuit Elf");

        game.toevoegen(12345, 1);
        game.toevoegen(2, 44);

        // bestaande waarde ophogen:
        game.toevoegen(1, 5);
        game.print();
    }

    public static void demo_max() {
        Spel game = new Spel(4);
        System.out.println(game.winnaar());
        game.toevoegen(0, "Jairo");
        game.toevoegen(2, "Yvonne");
        game.toevoegen(3, "Kevin");
        game.toevoegen(0, 3);
        game.toevoegen(2, 3);
        game.toevoegen(3, 1);
        game.print();

        System.out.println(game.winnaar());
        game.toevoegen(0, 987);
        game.print();

        System.out.println(game.winnaar());
    }
}
