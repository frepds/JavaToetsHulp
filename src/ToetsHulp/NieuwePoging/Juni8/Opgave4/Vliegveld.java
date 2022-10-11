package ToetsHulp.NieuwePoging.Juni8.Opgave4;
// code voor opgave 4


public class Vliegveld {
    Vliegtuig[] hangar;
    public Vliegveld(int grootte) {
        hangar = new Vliegtuig[grootte];
    }

    public void zetBinnen(Vliegtuig v, int plek) {
        if (plek < 0 || plek > hangar.length) {
            System.out.println("hangar " + plek + " bestaat niet!");
        } else {
            if (hangar[plek] == null) {
                hangar[plek] = v;
            } else {
                System.out.println("hangar " + plek + " is al bezet");
            }
        }
    }

    public void print() {
        System.out.println("hangar: ");
        for (int i = 0; i < hangar.length; i++) {
            if (hangar[i] == null) {
                System.out.println("* plek " + i + ": ---");
            } else {
                System.out.println("* plek " + i + ": " + hangar[i]);
            }
        }
    }

    public Vliegtuig haalEruit(int plek) {
        Vliegtuig copy = hangar[plek];
        hangar[plek] = null;
        return copy;
    }

    public int zetOpEersteVrijePlek(Vliegtuig v) {
        return 1;
    }

}
