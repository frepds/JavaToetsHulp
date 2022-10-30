package ToetsHulp.Theorie.April9_2021.Antwoorden.Opgave5;

import ToetsHulp.NieuwePoging.April9_2021.Opgave5.Kryptoniet;
import ToetsHulp.NieuwePoging.April9_2021.Opgave5.Tachyon;

public class Photon implements Kryptoniet, Tachyon {


    @Override
    public double rotatie(double x) {
        return 42;
    }

    @Override
    public String straling() {
        return "Photon --> straling";
    }
}
