package ToetsHulp.NieuwePoging.Juni8_2021.Opgave3;

public class Garage {
    private Vliegtuig vliegtuig;

    public void zetInGarage(Vliegtuig v) {
        vliegtuig = v;
    }

    public void upgrade(String upgradeNaam) {
        upgradeNaam = vliegtuig.getNaam() + upgradeNaam;
        vliegtuig.setNaam(upgradeNaam);
    }

    public static void main(String[] args) {
        Garage garage = new Garage();
        Vliegtuig f16 = new Vliegtuig("F-16");
        garage.zetInGarage(f16);
        garage.upgrade(".upgrade");
        // Waarom is de naam van f16 niet veranderd in "F-16.upgrade" na upgrade(...) ?
        System.out.println(f16); // F-16
    }
}

