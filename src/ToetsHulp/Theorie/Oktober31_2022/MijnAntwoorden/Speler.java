package ToetsHulp.Theorie.Oktober31_2022.MijnAntwoorden;// s1173423 : folder: s1173423_Frederik_Smits.zip

// code voor opgave 3

public class Speler {
    public String naam;
    public int punten = 0;
    public boolean inTeam1;
    public static int aantalSpelers = 0;

    public Speler(String n) {
        naam = n;
        aantalSpelers++;
        inTeam1 = aantalSpelers % 2 != 0;
    }

    public static void getAantalSpelers() {
        if (aantalSpelers == 1) {
            System.out.println(aantalSpelers + " speler");
        } else {
            System.out.println(aantalSpelers + " spelers");
        }
    }

    public String toString() {
        return "Speler " + naam + ": " + punten + " punten";
    }

    public void printTeam() {
        if (inTeam1) {
            System.out.println("team 1");
        } else {
            System.out.println("team twee");
        }
    }
}

