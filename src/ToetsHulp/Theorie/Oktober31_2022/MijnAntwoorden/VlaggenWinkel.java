// s1173423 : folder: s1173423_Frederik_Smits.zip

package ToetsHulp.Theorie.Oktober31_2022.MijnAntwoorden;


// code voor opgave 1

public class VlaggenWinkel {

    public Vlag maakVlag(int grootte, String k1, String k2) {
        return new Vlag(grootte, k1, k2);
    }

    public Vlag zelfdeAls(Vlag origineel, int nieuweGrootte) {
        return new Vlag(nieuweGrootte, origineel.kleur1, origineel.kleur2);
    }
}

