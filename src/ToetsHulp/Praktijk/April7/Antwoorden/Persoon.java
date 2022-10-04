package ToetsHulp.Praktijk.April7.Antwoorden;

import java.awt.*;

//
// 
//mnc07: vraag 1(a): Alles m.b.t. het abstracte van Persoon: 3 punten te behalen
//
public abstract class Persoon {
    //
//mnc07: vraag 1(a): attribuut naam: 1 punt te behalen
    private String naam;
    //
//mnc07: vraag 1(a): attribuut blij: 1 punt te behalen
    private int blij = 0;  // tevredenheid  op schaal 0--100

    //
//mnc07: vraag 1(a): juiste constructor: 2 punten te behalen

    public Persoon(String naam, int blij) {
        this.naam = naam;
        maakBlij(blij);
    }

    //
//mnc07: vraag 1(a) getter getBlij(): 1 punt te behalen

    public int getBlij() {
        return this.blij;
    }

    //
//mnc07: vraag 1(a): getter getNaam(): 1 punt te behalen

    public String getNaam() {
        return this.naam;
    }

    //
//mnc07: vraag 1(a): abstracte methode  getBlij(): 3 punten te behalen

    public void maakBlij(int verandering) {
        this.blij += verandering;
        if (this.blij < 0) {
            this.blij = 0;
        }
        if (this.blij > 100) {
            this.blij = 100;
        } // of met max en min natuurlijk, of een andere vorm van if-else redeneren.

    }

    //
//mnc07: Docent erft de toString() van Persoon en implementeert 'm niet zelf: 2 punten te behalen

    public String toString() {
        return this.naam + " (" + this.getBeschrijving() + ") \t" + this.blij + " \t" + this.getSmiley();
    }

    //
//mnc07: vraag 1(a): functie getKleur(): 3 punten te behalen

    // kleur returnen op basis van blijheid
    public Color getKleur() {
        if (this.blij <= 25) {
            return Color.red;
        } else if (this.blij <= 50) {
            return Color.orange;
        } else if (this.blij <= 75) {
            return Color.yellow;
        }
        return Color.green;
    }

    // of het nu om een Docent of Student gaat, de txt onder de icoon is altijd hetzelfde, en de smiley ook. Dus handig om dat in de abstract klasse te doen. (Maar hoeft niet natuurlijk)
    protected void onderschrift(Graphics g, int x, int y) {
        // het stukje tekst onder de icoon
        g.setFont(new Font("default", Font.BOLD, 13));
        g.drawString(this.naam, x, y + 90);
        g.drawString(this.getBeschrijving(), x, y + 110);
        g.drawString("" + this.blij, x, y + 130);
        //smiley:
        g.setFont(new Font("default", Font.BOLD, 35));
        Main.drawStringRotated(g, getSmiley(), x + 25, y + 18, 90);
    }

    public abstract String getBeschrijving();

    public abstract String getSmiley();

    // In deze uitwerking ervoor gekozen om de objecten zichzelf te laten tekenen.
    // maar dat was niet de enige optie. Je kunt ook een for loop in het tekenpanel
    // maken en daarin alle info opvragen met getters (en instance of gebruiken voor
    // bepalen of het een cirkel of een vierkantje moet worden) en daar alles tekenen.
    public abstract void tekenMij(Graphics g, int x, int y);
}

