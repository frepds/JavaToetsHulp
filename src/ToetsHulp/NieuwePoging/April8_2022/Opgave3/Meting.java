package ToetsHulp.NieuwePoging.April8_2022.Opgave3;

// code voor opgave 3

import java.util.Objects;

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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Meting that = (Meting) o;

        boolean locatie = this.locatie.equals(that.locatie);
        int thisWaarde = this.waardeInKelvin();
        int thatWaarde = that.waardeInKelvin();
        boolean waarde = thisWaarde == thatWaarde;
        return locatie && waarde;
    }

}
