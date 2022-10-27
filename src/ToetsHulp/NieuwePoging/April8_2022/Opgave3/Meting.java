package ToetsHulp.NieuwePoging.April8_2022.Opgave3;

// code voor opgave 3

public class Meting {
    private int waarde;
    private boolean isCelsius; //  true: Celsius, false: Kelvin
    private String locatie;

    public Meting(int w, boolean c, String l) {
        waarde = w;
        isCelsius = c;
        locatie = l;
    }

    public int waardeInKelvin() {
        if (isCelsius) {
            return waarde + 273;
        } else {
            return waarde;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Meting)) {
            return false;
        }

        Meting that = (Meting) o;

        boolean locatie = this.locatie.equals(that.locatie);
        int waardeThis = this.waardeInKelvin();
        int waardeThat = that.waardeInKelvin();
        boolean waarde = waardeThis == waardeThat;

        return locatie && waarde;
    }

}
