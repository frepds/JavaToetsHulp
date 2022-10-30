package ToetsHulp.NieuwePoging.April9_2021.Opgave3;

//vraag 3

public class Verkiezingen {
    int[] stemmen;

    // vraag (a)
    public Verkiezingen(int aantalKandidaten) {
        stemmen = new int[aantalKandidaten];
    }

    // vraag (b)
    public void stemOp(int kandidaatnr) {
        if (kandidaatnr < 0 || kandidaatnr > stemmen.length) {
            System.out.println("kandidaat " + kandidaatnr + " bestaat niet");
        } else {
            stemmen[kandidaatnr - 1]++;
        }
    }

    // vraag (b)
    public void print() {
        for (int i = 1; i <= stemmen.length; i++) {
            System.out.println("kandidaat nr " + i + " heeft " + stemmen[i - 1] + " stemmen");
        }
    }

    public int getWinnaar() {
        int largest = 0;
        for (int i = 0; i < stemmen.length; i++) {
            if (stemmen[i] > largest) {
                largest = i;
            }
        }
        return largest;
    }

}
