package ToetsHulp.Theorie.Juni14_2022.Antwoorden.Antwoorden;

import java.util.ArrayList;

public class Koffer {
    private int grootte;
    private String inhoud;
    private int code = -1;

    private boolean lockdown = false;

    public Koffer(int grootte, String inhoud) {
        this.grootte = 10;
        if (grootte >= 10) {
            this.grootte = grootte;
        }
        this.inhoud = inhoud;
        System.out.println("nieuw: " + inhoud + " (" + grootte + ")");
    }

    public Koffer(int grootte) {
        // maar 1 statement, dus this(..) gebruiken om andere constructor aan te roepen.
        this(grootte, "leeg");
    }

    //----------------------------------------------------------------------------------
    public void setCode(int nieuweCode) {
        // code == -1 gebruiken we als teken voor 'eerste keer'.
        // Maar het kan ook op een andere manier met bv. een boolean attribuut om te onthouden of de setCode al uitgevoerd is.
        if (code == -1 && nieuweCode > 999 && nieuweCode <= 9999) {
            code = nieuweCode;
        } else {
            System.out.println("mag niet");
        }
    }

    //----------------------------------------------------------------------------------
    public String getInhoud(int code) {
        if (code == this.code && !lockdown) {
            return this.grootte + ": " + this.inhoud;
        } else {
            lockdown = true;
            return "---lockdown---";
        }
    }

    //----------------------------------------------------------------------------------

    // voor vraag c
    public ArrayList<Koffer> verdeel___FOUT___(int aantal, String naam) {
        int nieuweGrootte = 1 + grootte / aantal;
        ArrayList<Koffer> lijstje = new ArrayList<>();
        for (int i = 0; i < aantal; i++) {
            String nieuweInhoud = inhoud + "_"
                    + naam.toLowerCase() + "#" + (i + 1);
            lijstje.add(new Koffer(nieuweGrootte, nieuweInhoud));
        }
        return lijstje;
    }

    // voor vraag c
    public ArrayList<Koffer> verdeel(int aantal, String naam) {
        try {
            int nieuweGrootte = 1 + grootte / aantal;
            ArrayList<Koffer> lijstje = new ArrayList<>();
            for (int i = 0; i < aantal; i++) {
                String nieuweInhoud = inhoud + "_"
                        + naam.toLowerCase() + "#" + (i + 1);
                lijstje.add(new Koffer(nieuweGrootte, nieuweInhoud));
            }
            return lijstje;
        } catch (ArithmeticException arEx) {
            System.out.println("dat is wiskundig onmogelijk!");
            return null;
        } catch (Exception exc) {
            System.out.println("er is een fout opgetreden");
            return null;
        }
    }

    public static void _demo_constructors() {
        Koffer k1 = new Koffer(555, "JAVA-boek");
        Koffer k2 = new Koffer(3);
    }

    public static void _demo_setCode() {
        Koffer k1 = new Koffer(77, "mobieltje");
        // te klein of te groot
        k1.setCode(1);
        k1.setCode(1000000);

        // goed
        k1.setCode(5678);

        // mag maar 1x ingesteld worden
        k1.setCode(1234);
    }

    public static void demo_verdeel() {
        String input = null;
        Koffer k1 = new Koffer(33, "laptop");

        ArrayList<Koffer> lijstje;
        lijstje = k1.verdeel(2, "DEEL");

        // gevulde Arraylist (inhoud niet belangrijk voor deze vraag).
        System.out.println(lijstje.size());

        lijstje = k1.verdeel(0, "oeps!");
        System.out.println(lijstje);

        lijstje = k1.verdeel(1, input);
        System.out.println(lijstje);
    }


    public static void demo_getInhoud() {
        Koffer k1 = new Koffer(50, "telefoon");
        k1.setCode(7777);

        System.out.println(k1.getInhoud(3400));
        System.out.println(k1.getInhoud(5600));

        // goede code werkt ook niet meer
        System.out.println(k1.getInhoud(7777));
        k1.setCode(7777);

        Koffer k2 = new Koffer(33, "boek");
        k2.setCode(1234);
        System.out.println(k2.getInhoud(1234));
    }


}
