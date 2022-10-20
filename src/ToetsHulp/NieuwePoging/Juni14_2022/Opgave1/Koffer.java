package ToetsHulp.NieuwePoging.Juni14_2022.Opgave1;// code voor opgave 1
//

import java.util.ArrayList;

public class Koffer {
    private int grootte;
    private String inhoud;
    private int code;

    public Koffer(int grootte) {
        if (grootte < 10) {
            this.grootte = 10;
        } else {
            this.grootte = grootte;
        }
        this.inhoud = "leeg";
        System.out.println("nieuw: " + inhoud + " (" + grootte + ")");
    }

    public Koffer(int grootte, String inhoud) {
        if (grootte < 10) {
            this.grootte = 10;
        } else {
            this.grootte = grootte;
        }
        this.inhoud = inhoud;
        System.out.println("nieuw: " + inhoud + " (" + grootte + ")");
    }

    public void setCode(int code) {
        if (code >= 1000 && code <= 9999) {
            if (this.code == 0) {
                this.code = code;
            } else {
                System.out.println("mag niet");
            }
        } else {
            System.out.println("mag niet");
        }
    }

    public String getInhoud(int code) {
        int oudeCode = this.code;
        boolean lockdown = false;
        if (code != this.code) {
            lockdown = true;
        }
        if (lockdown && code == oudeCode) {
            return "mag niet";
        }
        if (!lockdown && code == this.code) {
            return grootte + ": " + inhoud;
        }
        return "---lockdown---";
    }

    // voor vraag $REF::@TRY_CATCH$

    public ArrayList<Koffer> verdeel(int aantal, String naam) {
        ArrayList<Koffer> lijstje = new ArrayList<>();
        int nieuweGrootte = 0;
        try {
            nieuweGrootte = 1 + grootte / aantal;
            for (int i = 0; i < aantal; i++) {
                String nieuweInhoud = inhoud + "_"
                        + naam.toLowerCase() + "#" + (i + 1);
                lijstje.add(new Koffer(nieuweGrootte, nieuweInhoud));
            }
        } catch (ArithmeticException e) {
            System.out.println("dat is wiskundig onmogelijk!");
            return null;
        } catch (NullPointerException e) {
            System.out.println("er is een fout opgetreden");
            return null;
        }
        return lijstje;
    }

}
