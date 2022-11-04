package ToetsHulp.Theorie.Oktober31_2022;

// code voor opgave 1
//
public class VlaggenWinkel {

    public Vlag maakVlag(int grootte, String k1, String k2) {
        return new Vlag(grootte, k1, k2);
    }

    public Vlag zelfdeAls(Vlag origineel, int nieuweGrootte) {
        Vlag kopie = origineel;
        kopie.kleur1 = origineel.kleur1;
        kopie.kleur2 = origineel.kleur2;
        kopie.setGrootte_werkend(nieuweGrootte);
        return kopie;
    }
}
