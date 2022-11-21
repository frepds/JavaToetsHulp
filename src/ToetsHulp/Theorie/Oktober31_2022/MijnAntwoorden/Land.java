// s1173423 : folder: s1173423_Frederik_Smits.zip

package Opgave2;

// code voor opgave 2

public class Land {
    private String naam;
    private int code;

    public Land(String n, int c) {
        naam = n;
        code = c;
    }


    public boolean equals(Object o) {
        if (!(o instanceof Land)) {
            return false;
        }

        Land that = (Land) o;
        return this.code == that.code;
    }
}

