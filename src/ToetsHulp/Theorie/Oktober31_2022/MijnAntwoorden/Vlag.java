// s1173423 : folder: s1173423_Frederik_Smits.zip

package ToetsHulp.Theorie.Oktober31_2022.MijnAntwoorden;

// code voor opgave 1

public class Vlag {
    private int grootte;
    public String kleur1;
    public String kleur2;

    public Vlag(int grootte, String k1, String k2) {
        this.kleur1 = k1;
        this.kleur2 = k2;

        // input validatie: te klein of te groot --> corrigeren
        if (grootte < 50) {
            this.grootte = 50;
        } else if (grootte > 500) {
            this.grootte = 500;
        } else {
            this.grootte = grootte;
        }
    }

    public String toString() {
        return grootte + " + " + kleur1 + " + " + kleur2;
    }

    public void printVlag() {
        System.out.println(grootte + " + " + kleur1 + " + " + kleur2);
    }

    public void printKleuren() {
        if (kleur2 == null || kleur2.equals(kleur1)) {
            System.out.println(kleur1);
        } else {
            System.out.println(kleur1 + " en " + kleur2);
        }
    }

    // let op: pas deze methode niet aan!
    public void setGrootte_werkend(int m) {
        grootte = m;
    }
}

