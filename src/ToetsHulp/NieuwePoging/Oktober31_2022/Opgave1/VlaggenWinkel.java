package ToetsHulp.NieuwePoging.Oktober31_2022.Opgave1;

// code voor opgave 1

public class VlaggenWinkel {

    public Vlag maakVlag(int grootte, String k1, String k2) {
        return new Vlag(grootte, k1, k2);
    }

    public Vlag zelfdeAls(Vlag origineel, int nieuweGrootte) {
        return new Vlag(nieuweGrootte, origineel.kleur1, origineel.kleur2);
    }
}
