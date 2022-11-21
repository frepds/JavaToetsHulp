package ToetsHulp.Theorie.Oktober31_2022.Antwoorden;

public class VlaggenWinkel {

    public Vlag maakVlag(int grootte, String k1, String k2) {
        return new Vlag(grootte, k1, k2);
    }

/*
// foute code, uit toets:
	public Vlag zelfdeAls(Vlag origineel, int nieuweGrootte) 
	{
		Vlag kopie = origineel;
		kopie.kleur1 = origineel.kleur1;
		kopie.kleur2 = origineel.kleur2;
		kopie.setGrootte_werkend(nieuweGrootte);
		return kopie;
	}
*/

    // oplossing: een nieuw object maken (met new) en dan de gegevens
    // e.v.t. nog aanpassen indien nodig (hier niet nodig, dus kan meteen
    // gereturnd worden).
    //
    public Vlag zelfdeAls(Vlag origineel, int nieuweMaat) {
        // als je kleur1 en kleur2 priate had gemaakt (wat niet hoefde), zou je nu getters nodig hebben.
        Vlag kopie = new Vlag(nieuweMaat, origineel.kleur1, origineel.kleur2);
        // verander evt nog iets ...
        return kopie;
    }


    //demo uit toets
    public static void _demo__new() {
        VlaggenWinkel s = new VlaggenWinkel();
        Vlag mijn_vlag = s.maakVlag(60, "blauw", "geel");
        System.out.println(mijn_vlag);

        // een vriend wil net zo'n vlag als ik heb, maar wat groter!
        Vlag vlag_voor_vriend = s.zelfdeAls(mijn_vlag, 444);
        System.out.println(vlag_voor_vriend);

        // ik verwacht dat mijn_vlag niet veranderd is:
        System.out.println(mijn_vlag);
    }
}
