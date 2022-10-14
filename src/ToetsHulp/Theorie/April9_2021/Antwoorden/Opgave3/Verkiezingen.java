package ToetsHulp.Theorie.April9_2021.Antwoorden.Opgave3;


public class Verkiezingen {
    private int[] stemmen;

    // vraag (a)
    public Verkiezingen(int aantalKandidaten) {
        stemmen = new int[aantalKandidaten];
        // omdat we evenveel kandidaten hebben als plekken in de stemmen-array, moeten we de
        // eerste kandidaat op [0], tweede op plek [1], etc...
        // Je had ook een grotere array kunnen maken (stemmen = new int[aantalKandidaten + 1];
        // dan had kandidaat 1 op plek [1] gekund, kandidaat 2 op plek [2], etc..
        // maar dan had je je niet aan de opdracht gehouden dat de grootte v/d array 'aantalKandidaten' moest zijn, dus dat levert puntenaftrek op.
    }


    // vraag (b)
    public void stemOp(int kandidaatnr) {
        kandidaatnr--;   // omdat we kandidaat 1 op [0] zetten, etc.. maar de kandidaten tellen vanaf 1, moeten we de input 1 lager maken, zodat kandidaat 1 in stemmen[0] komt, etc..
        try {
            stemmen[kandidaatnr]++;
        } catch (ArrayIndexOutOfBoundsException e) { // mochten geen if-else gebruiken, dus dan maar gewoon proberen en fout laten gaan als we buiten de array zitten.
            System.out.println("kandidaat " + (kandidaatnr + 1) + " bestaat niet");  // bij de foutmelding niet vergeten dat -- hadden gedaan.
        }
    }

    // vraag (b)
    public void print() {
        for (int i = 0; i < stemmen.length; i++) {
            String txt = " stemmen";
            if (stemmen[i] == 1) {  // subtiel, maar in de vb output stond 'stem' als het om 1 stem ging.
                txt = " stem";
            }
            // niet vergeten dat we op plek [0] de stemmen van kandidaat 1 hadden staan.
            // het is bij deze print niet handig om de for-each loop te gebruiken want dan
            // moet je alsnog een tellertje maken om het kandidaatnr goed te printen.
            // (mag uiteraard wel, is alleen minder duidelijk).
            System.out.println("kandidaat nr " + (i + 1) + " heeft " + stemmen[i] + txt);
        }
    }


    /*
    vraag: we hebben de winnaar nodig, dus dat is de kandidaat met het hoogste aantal stemmen.
    oplossing: loop over alle stemmen heen, en kijk welke de hoogste is.
                De *index* van die hoogste waarde, is de kandidaat.
                Niet vergeten om rekening te houden met de offset omdat kandidaat 1 op plek [0] komt,
                Dus als plek [5] de hoogste waarde heeft, is het kandidaat 6 die gewonnen heeft.
    */
    public int getWinnaar() {
        int grootsteIndex = 0; // om de index v/d hoogste bij te houden
        for (int i = 1; i < stemmen.length; i++) {
            if (stemmen[i] > stemmen[grootsteIndex]) {  // vergelijk hier stemmen met stemmen, dus de stemmen van de hoogste tot dan toe, met de  stemmen van [i]
                // veel geziene fout hier: vergelijken van stemmen[i] en grootsteIndex... maar dat gaat natuurlijk mis, omdat
                // je dan een aantal met een index vergelijkt, en dat gaat gegarandeerd mis.
                grootsteIndex = i;  // onthoud dat dit de hoogste tot nu toe is.
            }
        }
        return (grootsteIndex + 1); // niet vergeten om +1 te doen vanwege de offset, dat kandidaat 3 z'n stemmen op plek [2] heeft.
    }

}
	
