package ToetsHulp.Praktijk.April7_2021.Antwoorden;

import java.awt.*;

//mnc07: Student, de basis: 3 punten te behalen
//
public class Student extends Persoon {
    private String studentnummer = "s7777777";
    private static int defaultBlijheid = 50; //hoeft natuurlijk niet met een static, je kunt ook gewoon 50 gebruiken

    public Student(String naam, String studentnummer) {
        this(naam, studentnummer, Student.defaultBlijheid);  //this: ene constructor naar de andere doorverwijzen (was niet verplicht. Kunt ook hier super(..) doen).
    }

    public Student(String naam, String studentnummer, int blij) {
        super(naam, blij);
        this.studentnummer = studentnummer;
    }

    //
//mnc07: vraag 1(c): correcte implentatie van abstracte methode getBeschrijving: 1 punt te behalen

    public String getBeschrijving() {
        return this.studentnummer;
    }

    //
//mnc07: vraag 1(c): implementatie van abstracte methode getSmiley(): 1 punt te behalen

    public String getSmiley() {
        //logica heeft zelfde vorm (want zelfde grenswaardes) als getKleur. Dus die overnemen en ombouwen naar returnen van smiley
        if (this.getBlij() <= 25) {
            return ":-(";
        } else if (this.getBlij() <= 50) {
            return ":-|";
        } else if (this.getBlij() <= 75) {
            return ":-)";
        }
        return ":-D";
    }

    public static void test1() {
        //het vb. dat in de toets getoond werd.
        Student st = new Student("Anna", "s1234");
        System.out.println(st);

        st = new Student("Adam", "s0012", 95);
        System.out.println(st);
    }

    // impleentatie v/d absr. methode in Persoon, om te kunnen tekenen (er zijn ook allerlei andere manieren om het tekenen te regelen).
    public void tekenMij(Graphics g, int x, int y) {
        g.setColor(getKleur());
        g.fillOval(x, y, 70, 70);
        g.setColor(Color.black);
        g.drawOval(x, y, 70, 70);
        onderschrift(g, x, y);
    }
}

