package ToetsHulp.Theorie.Juni8.StartSituatie.Opgave3;

// code voor opgave 3
//
public class Garage {
    private Vliegtuig vliegtuig;

    public void zetInGarage(Vliegtuig v) {
        vliegtuig = v;
    }

    public void upgrade(String upgradeNaam) {
        // de nieuwe naam voor het ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.ToetsHulp.Theorie.Juni8.StartSituatie.Opgave4.Vliegtuig
        upgradeNaam = vliegtuig.getNaam() + upgradeNaam;

        // upgrade het ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.ToetsHulp.Theorie.Juni8.StartSituatie.Opgave4.Vliegtuig
        Vliegtuig upgrade = new Vliegtuig(upgradeNaam);

        // en update de ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.Garage
        zetInGarage(upgrade);
    }
}
