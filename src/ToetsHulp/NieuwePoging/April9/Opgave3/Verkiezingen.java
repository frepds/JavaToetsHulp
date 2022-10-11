package ToetsHulp.NieuwePoging.April9.Opgave3;

//vraag 3
public class Verkiezingen {
    int[] stemmen;

    // vraag (a)
    public Verkiezingen(int aantalKandidaten) {
        stemmen = new int[aantalKandidaten];
    }

    // vraag (b)
    public void stemOp(int kandidaatnr) {
        kandidaatnr --;
        try {
            stemmen[kandidaatnr]++;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("kandidaat " + kandidaatnr + " bestaat niet");
        }
    }

    // vraag (b)
    public void print() {
        for (int i = 0; i < stemmen.length; i++) {
            System.out.println("kandidaat nr " + (i + 1) + " heeft " + stemmen[i] + " stemmen");
        }
    }

    public int getWinnaar() {
        int grootste = 0;
        for (int i = 0; i < stemmen.length; i++) {
            if (i > grootste) {
                grootste = stemmen[i];
            }
        }
        return grootste + 1;
    }

}
