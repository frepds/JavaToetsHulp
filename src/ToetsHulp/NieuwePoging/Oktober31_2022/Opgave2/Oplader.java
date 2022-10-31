package ToetsHulp.NieuwePoging.Oktober31_2022.Opgave2;

// code voor opgave 2

public class Oplader {

    private Land land;
    private int waarde;
    private boolean isKiloWatt = false; //  true --> kiloWatt, false --> watt

    public Oplader(int w, boolean e, Land l) {
        waarde = w;
        isKiloWatt = e;
        land = l;
    }

    public int omrekenenNaarWatt() {
        if (isKiloWatt) {
            return 1000 * waarde;
        } else {
            return waarde;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Oplader)) {
            return false;
        }

        Oplader that = (Oplader) o;

        boolean land = this.land.equals(that.land);
        boolean watt = false;
        int intThis = Math.abs(this.omrekenenNaarWatt());
        int intThat = Math.abs(that.omrekenenNaarWatt());

        if ((intThis - intThat) < 10) {
            watt = true;
        }

        return land && watt;
    }

}
