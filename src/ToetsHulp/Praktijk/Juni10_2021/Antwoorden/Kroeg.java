package ToetsHulp.Praktijk.Juni10_2021.Antwoorden;

import java.awt.*;
import java.util.ArrayList;

public class Kroeg {
    private ArrayList<Groep> wachtrij = new ArrayList<>();
    private Groep bar;

    public boolean toevoegen(String naam, String adres, int aantal) {
        Groep r = new Groep(naam, adres, aantal);
        if (r.getAantal() >= 1 && r.getAantal() <= 5) {
            if (bar == null) {
                // plekkie vrij!
                bar = r;
            } else {
                wachtrij.add(r);
            }
            return true;
        } else {
            System.out.println("sorry, kan niet");
            return false;
        }
    }


    public void bekijk() {
        if (bar == null) {
            System.out.println("bar: leeg");
        } else {
            System.out.println("bar: " + bar);
        }
        if (wachtrij.size() > 0) {
            System.out.println("wachtrij:");
            for (int i = 0; i < wachtrij.size(); i++)   // of met foreach en een tellertje
            {
                System.out.println("* plek " + i + ": " + wachtrij.get(i));
            }
        } else {
            System.out.println("wachtrij: leeg");
        }
    }


    //vb code uit toets:
    public static void demo_voegtoe() {
        Kroeg k = new Kroeg();
        k.bekijk();
        k.toevoegen("Haantje", "de Voorste", 2);
        k.toevoegen("Jan", "ergens", 3);
        k.toevoegen("Anna", "thuis", 2);
        k.toevoegen("P. Party", "0800-FEEST", 17);
        k.bekijk();
    }


    public void doorstroom() {
        if (wachtrij.size() > 0) {
            // 4 van de eerste af:
            bar = wachtrij.remove(0);
        } else {
            //System.out.println("de wachtrij is leeg!");
            bar = null;
        }
    }


    //vb code uit toets:
    public static void demo_update() {
        Kroeg k = new Kroeg();
        k.toevoegen("Haantje", "de Voorste", 2);
        k.bekijk();
        k.doorstroom();
        k.bekijk();
        k.toevoegen("Jan", "ergens", 3);
        k.toevoegen("Anna", "thuis", 4);
        k.toevoegen("Rik", "r@ik.nl", 1);
        k.bekijk();
        k.doorstroom();
        k.bekijk();
    }


    public int zoek(String naam) {
        for (int i = 0; i < wachtrij.size(); i++) {
            Groep r = wachtrij.get(i);
            if (r.getNaam().equals(naam)) {
                return i;
            }
        }
        return -1;
    }


    //vb code uit toets:
    public static void demo_zoek() {
        Kroeg k = new Kroeg();
        k.toevoegen("Haantje", "de Voorste", 2);
        k.toevoegen("Jan", "ergens", 3);
        k.toevoegen("Anna", "thuis", 4);
        k.toevoegen("Rik", "r@ik.nl", 2);
        k.bekijk();
        System.out.println(k.zoek("Anna"));
    }


    public void weggaan(String naam, int weglopers) {
        if (weglopers < 0) {
            return; // dit kan natuurlijk niet!
        }
        int index = zoek(naam);
        if (index >= 0) {
            Groep r = wachtrij.get(index);
            r.setAantal(r.getAantal() - weglopers);

            if (r.getAantal() < 1) {
                wachtrij.remove(index); // geannuleerd
            }
        }
    }

    //vb code uit toets:
    public static void demo_zoek_wijzig() {
        Kroeg k = new Kroeg();
        k.toevoegen("Haantje", "de Voorste", 2);
        k.toevoegen("Anna", "thuis", 4);
        k.toevoegen("Jan", "ergens", 3);
        k.toevoegen("Rik", "r@ik.nl", 3);
        k.toevoegen("L. Aatste", "achteraf", 1);
        k.bekijk();

        System.out.println(k.zoek("Anna"));
        k.weggaan("Anna", 1);
        k.weggaan("Jan", 100);
        k.weggaan("Rik", -20);
        k.bekijk();
    }


    // in deze vb uitwerking laten we de kroeg alles tekenen
    // maar de teken-logica had ook in het tekenpanel kunnen staan, of ergens anders.
    public void _TEKENMIJ(Graphics g, int width, int height) {
        g.setFont(new Font("default", Font.PLAIN, 14));
        // de kroeg:
        int kroegBreedte = 100;
        int afstand_cirkels = 40;
        int ystart = 70;
        g.setColor(Color.white);
        g.fillRect(1, 1, kroegBreedte, height - 2); //kroeg, met klein zwart randje van de achtergrond overgelaten, voor beter contrast
        g.setColor(Color.black);
        g.drawString("Kroeg", 20, 20);

        if (bar != null) {
            // cirkeltjes voor aantal gasten aan tafel:
            int y_tafel = ystart;
            int x_tafel = 30;
            g.setColor(Color.black);
            g.drawString(bar.getContactgegevens(), 20, y_tafel - 20);

            for (int i = 0; i < bar.getAantal(); i++) {
                g.setColor(Color.green);
                g.fillOval(x_tafel, y_tafel, 30, 30);
                g.setColor(Color.black); // lijntje eromheen voor contrast
                g.drawOval(x_tafel, y_tafel, 30, 30);
                y_tafel = y_tafel + afstand_cirkels;
            }
        } else {
            g.setColor(Color.black);
            g.drawString("leeg hier!", 20, 140);
        }

        // de wachtrij:
        g.setColor(Color.white);
        g.drawString("wachtrij", kroegBreedte + 20, 20);

        int x = kroegBreedte;
        int breedte = 105;
        int y = ystart;
        for (int i = 0; i < wachtrij.size(); i++) {
            Groep res = wachtrij.get(i);
            g.setColor(Color.red);
            for (int teller = 0; teller < res.getAantal(); teller++) {
                g.fillOval(x + 40, y + teller * afstand_cirkels, 30, 30);
            }
            g.setColor(Color.white);
            g.drawString(res.getContactgegevens(), x + 20, y - 20);
            x = x + breedte;
        }
    }
}
