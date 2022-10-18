package ToetsHulp.NieuwePoging.Opgave1;

// code voor opgave 1

public class Verhuiswagen {
    Doos[] dozen;

    public Verhuiswagen(int lengte) {
        dozen = new Doos[lengte];
    }

    public void print() {
        System.out.println("Verhuiswagen:");
        for (int i = 0; i < dozen.length; i++) {
            System.out.println("plek " + i + ": " + dozen[i]);
        }
    }

    public boolean zetNeer(Doos doos, int plek) {
        if (plek < 0 || plek > dozen.length) {
            System.out.println("fout: buiten bereik");
        } else {
            if (dozen[plek] == null) {
                dozen[plek] = doos;
                return true;
            } else {
                System.out.println("fout: plek is al bezet");
            }
        }
        return false;
    }

    public int zetOpLaatsteVrijePlek(Doos doos) {
        for (int i = dozen.length - 1; i >= 0; i--) {
            if (dozen[i] == null){
                dozen[i] = doos;
                return i;
            }
        }
        return 0;
    }

}
