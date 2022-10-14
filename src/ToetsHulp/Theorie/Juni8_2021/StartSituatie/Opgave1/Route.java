package ToetsHulp.Theorie.Juni8_2021.StartSituatie.Opgave1;

// code voor opgave 1
//
public class Route {
    public int afstand;
    public String start;

    public int moeilijkheidsgraad(int tijd, int conditie) {
        // voor vraag (c)
        return conditie / (tijd * (afstand - 3));
    }
}
