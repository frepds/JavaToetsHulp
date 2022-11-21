package ToetsHulp.Theorie.Oktober31_2022.MijnAntwoorden;// s1173423 : folder: s1173423_Frederik_Smits.zip

// code voor opgave 5

public class Spel {
    Speler[] alleSpelers;
    Speler speler;

    public Spel(int aantalSpelers) {
        alleSpelers = new Speler[aantalSpelers];
    }

    public void print() {
        for (int i = 0; i < alleSpelers.length; i++) {
            if (alleSpelers[i] == null) {
                System.out.println("[" + i + "]: ---");
            } else {
                System.out.println("[" + i + "]: " + alleSpelers[i]);
            }
        }
    }

    public void toevoegen(int index, String naam) {
        if (index >= 0 && index < alleSpelers.length) {
            if (alleSpelers[index] == null) {
                speler = new Speler(naam);
                alleSpelers[index] = speler;
            } else {
                System.out.println("Fout: bezet!");
            }
        } else {
            System.out.println("Fout: ongeldige index!");
        }
    }

    public void toevoegen(int index, int punten) {
        if (index >= 0 && index < alleSpelers.length) {
            if (alleSpelers[index] == null) {
                System.out.println("Fout: geen Speler!");
            } else {
                alleSpelers[index].punten += punten;
            }
        } else {
            System.out.println("Fout: ongeldige index!");
        }
    }

    public String winnaar() {
        try {
            String naam;
            int largest = 0;
            for (int i = 0; i < alleSpelers.length; i++) {
                if (alleSpelers[i].punten != 0 && alleSpelers[i].punten >= largest) {
                    largest = alleSpelers[i].punten;
                    naam = alleSpelers[i].naam;
                    if (alleSpelers[i].punten == largest) {
                        naam = alleSpelers[i].naam;
                    }
                    return naam;
                }
            }
        } catch (NullPointerException e) {
            return null;
        }
        return null;
    }
}

