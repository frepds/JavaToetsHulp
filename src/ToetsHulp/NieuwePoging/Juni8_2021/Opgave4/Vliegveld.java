package ToetsHulp.NieuwePoging.Juni8_2021.Opgave4;

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
        System.out.println("hangar:");
        for (int i = 0; i < hangar.length; i++) {
            if (hangar[i] == null) {
                System.out.println("* plek " + i + ": ---");
            } else {
                System.out.println("* plek " + i + ": " + hangar[i]);
            }
        }
    }

    public Vliegtuig haalEruit(int plek) {
        Vliegtuig vliegtuig;
        if (hangar[plek] != null) {
            vliegtuig = hangar[plek];
            hangar[plek] = null;
            return vliegtuig;
        }
        return null;
    }

    public int zetOpEersteVrijePlek(Vliegtuig vliegtuig) {
        for (int i = 0; i < hangar.length; i++) {
            if (hangar[i] == null) {
                hangar[i] = vliegtuig;
                return i;
            }
        }
        return -1;
    }

}
