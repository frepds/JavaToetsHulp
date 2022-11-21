package ToetsHulp.Theorie.Oktober31_2022.Antwoorden;

public class Speler {
    public String naam;
    public int punten = 0;
    public boolean inTeam1 = true;

    public static int spelerTeller = 0;
    public static boolean teamTeller = true; //eerste zit in team 1
    // de teamTeller is een boolean die elke keer in de constructor
    // "geflipt" wordt (true --> false en false --> true).

    public Speler(String n) {
        naam = n;
        this.inTeam1 = teamTeller;
        teamTeller = !teamTeller; //de volgende Speler moet in het andere team dan deze speler
        //n.b. dit had ook met bv. modulo opgelost kunnen worden, zonder teamTeller variabele:
        // if(spelerTeller % 2 == 0) { ... }
        spelerTeller++;
    }

    public String toString() {
        return "Speler " + naam + ": " + punten + " punten";
    }

    public void printTeam() {
        if (inTeam1) {
            // "team een" en "team 2" zijn ook goed gerekend
            System.out.println("team 1");
        } else {
            System.out.println("team twee");
        }
    }


    // dit moest een static methode zijn, want hij wordt in onderstaand code vb.
    // aangeroepen met de klassenaam: Speler.getAantalSpelers()
    //
    public static void getAantalSpelers() {
        if (spelerTeller == 1) { // 1 speler, 0 of meerdere spelerS.
            System.out.println("" + spelerTeller + " speler");
        } else {
            System.out.println("" + spelerTeller + " spelers");
        }
    }


    //vb uit de toets.
    public static void _demo_werkingOmEnOm() {
        Speler.getAantalSpelers();
        Speler a = new Speler("a");
        a.printTeam();
        Speler.getAantalSpelers();

        Speler bb = new Speler("bb");
        bb.printTeam();

        Speler ccc = new Speler("ccc");
        Speler dddd = new Speler("dddd");
        Speler eeeee = new Speler("eeeee");

        a.printTeam();
        bb.printTeam();
        ccc.printTeam();
        dddd.printTeam();
        eeeee.printTeam();

        Speler.getAantalSpelers();
    }
}
