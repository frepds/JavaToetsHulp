package ToetsHulp.Praktijk.April7_2021.Antwoorden;

import java.awt.*;

public class Main {
    // Het is uiteraard geen probleem als testcode in de main uitgecomment wordt.
    public static void main(String[] args) {
        Klas klas = new Klas("ICTm2W");
        klas.voegToe(new Student("Marie", "s1231", 90));
        klas.voegToe(new Student("Rik", " s1175"));
        klas.voegToe(new Docent("Jan"));
        klas.voegToe(new Student("Ellen", "s1377", 15));
        klas.voegToe(new Student("Tim", "s1653", 75));
        klas.voegToe(new Student("Marc", "s1001"));
        KlasGui gui = new KlasGui(klas);
    }

    // Plaats deze code in de klasse waar je 'm wilt gebruiken. (Of roep 'm van daaruit aan)
//
// aanroep: drawStringRotated(g2d, "hoi", 100, 200, 45);
// resultaat: tekent "hoi" op plek x=100, y=200 met een hoek van 45 graden.
//
// Inhoud van deze methode direct weer vergeten, alleen gebruiken :-)
//
// Gebaseerd op: stackoverflow.com/a/26705815
//
    public static void drawStringRotated(Graphics g, String txt, double x, double y, int angle) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate((float) x, (float) y);
        g2d.rotate(Math.toRadians(angle));
        g2d.drawString(txt, 0, 0);
        g2d.rotate(-Math.toRadians(angle));
        g2d.translate(-(float) x, -(float) y);
    }
}

