package ToetsHulp.NieuwePoging.Oktober31_2022.Opgave2;

// code voor opgave 2

public class Land {

    private String naam;
    private int code;

    public Land(String n, int c) {
        naam = n;
        code = c;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Land)) {
            return false;
        }

        Land that = (Land) o;
        return this.code == that.code;
    }


}
