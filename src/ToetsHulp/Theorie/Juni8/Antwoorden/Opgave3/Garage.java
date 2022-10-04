package ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3;

public class Garage {

    private Vliegtuig vliegtuig;

    public void zetInGarage(Vliegtuig v) {
        vliegtuig = v;
    }

    // fout vb. uit de toets:
    public void upgrade___FOUT___(String upgradeNaam) {
        // de nieuwe naam voor het ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.ToetsHulp.Theorie.Juni8.StartSituatie.Opgave4.Vliegtuig
        upgradeNaam = vliegtuig.getNaam() + upgradeNaam;

        // upgrade het vliegtuig
        Vliegtuig upgrade = new Vliegtuig(upgradeNaam);

        // en update de ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.Garage
        zetInGarage(upgrade);

    }

    // goede code:
    public void upgrade(String upgradeNaam) {
        // de nieuwe naam voor het ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.ToetsHulp.Theorie.Juni8.StartSituatie.Opgave4.Vliegtuig
        upgradeNaam = vliegtuig.getNaam() + upgradeNaam;
        // upgrade het ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.ToetsHulp.Theorie.Juni8.StartSituatie.Opgave4.Vliegtuig. Hier geen new ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.ToetsHulp.Theorie.Juni8.StartSituatie.Opgave4.Vliegtuig maken, want dat is een ander (nieuw) object.
        // Dan hebben we ineens twee Vliegtuigen, waarvan de nieuwe de geupgrade naam krijgt, terwijl
        // er niks met de oude gedaan wordt (die dan dus onveranderd blijft).
        // We hoeven alleen de naam van het object dat al in het ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.ToetsHulp.Theorie.Juni8.StartSituatie.Opgave4.Vliegtuig attribuut van ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.Garage was opgeslagen,
        // aan te passen:
        vliegtuig.setNaam(upgradeNaam);
        // ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.Garage updaten is niet nodig. We hebben het ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.ToetsHulp.Theorie.Juni8.StartSituatie.Opgave4.Vliegtuig attribuut van ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.Garage aangepast, dus het staat al goede
        // maar het mag wel natuurlijk, ondanks dat het volkomen overbodig is:  zetInGarage(vliegtuig);
    }

    // voorbeeld uit de toets om de bug te demonstreren:
    // deze code mag niet veranderd worden
    public static void demo_upgrade() {
        Garage garage = new Garage();
        Vliegtuig f16 = new Vliegtuig("F-16");
        garage.zetInGarage(f16);

        garage.upgrade___FOUT___(".upgrade"); //bug
        //garage.upgrade( ".upgrade" ); //geen bug

        // Waarom is de naam van f16 niet veranderd in "F-16.upgrade" na upgrade(...) ?
        System.out.println(f16);
    }
}
