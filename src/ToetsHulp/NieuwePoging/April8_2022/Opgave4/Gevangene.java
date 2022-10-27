package ToetsHulp.NieuwePoging.April8_2022.Opgave4;

// code voor opgave 4

public class Gevangene {
    public boolean strafBooleanGebruikt = false;
    public String naam = "?";
    public int straf = 0, wachtwoord = 1234567; //  duur van de gevangenisstraf in jaren

    public Gevangene(String n) {
        naam = n;
    }

    public void geefStraf(int wachtwoord, int straf) {
        if (this.wachtwoord == wachtwoord && !strafBooleanGebruikt) {
            if (straf < 0) { // straf moet altijd >= 0 zijn.
                this.straf = 0;
            } else {
                this.straf = straf;
            }
            strafBooleanGebruikt = true;
        } else {
            System.out.println("mag niet!");
        }

    }

    public void verminder(int wachtwoord) {
        if (this.wachtwoord == wachtwoord) {
            if ((straf - 1) < 0) {
                straf = 0;
            } else {
                straf--;
            }
        } else {
            System.out.println("mag niet");
        }
    }

    // deze methode mag niet veranderd worden
    public boolean isVrij() {
        return straf <= 0;
    }

    public String toString() {
        return naam + "(straf: " + this.straf + ")";
    }
}
