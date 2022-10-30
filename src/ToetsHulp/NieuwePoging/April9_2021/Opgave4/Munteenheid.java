package ToetsHulp.NieuwePoging.April9_2021.Opgave4;

import java.util.Objects;

//vraag 4
public class Munteenheid {
    private String valuta;

    public Munteenheid(String valuta) {
        this.valuta = valuta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;

        Munteenheid that = (Munteenheid) o;
        return Objects.equals(this.valuta, that.valuta);
    }

}
