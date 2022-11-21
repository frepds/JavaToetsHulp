package ToetsHulp.Theorie.Oktober31_2022.Antwoorden;

public class Land {
    private String naam;
    private int code;

    public Land(String n, int c) {
        naam = n;
        code = c;
    }

    // altijd handig om te hebben (maar niet verplicht in deze vraag)
    public String toString() {
        return naam + " (" + code + ")";
    }


    // automatisch gegenereerd, en daarna aangepast aan de eisen v/d vraag
    public boolean equals(Object o) {  //Let op: altijd (Object o)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Land that = (Land) o; // casting
        // de eis was: codes hetzelfde, dan zijn ze gelijk.
        // dus de naam wordt helemaal niet gebruikt in deze equals.
        return code == that.code;
    }
}
