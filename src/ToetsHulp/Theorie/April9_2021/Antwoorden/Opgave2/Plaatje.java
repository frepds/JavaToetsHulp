package ToetsHulp.Theorie.April9_2021.Antwoorden.Opgave2;

public class Plaatje {

    public int pixel1;
    public int pixel2;

    public Plaatje(int pixel1, int pixel2) {
        // hier zat een scope probleempje. De this miste, dus pixel1 = pixel1; waardoor niks in het attribuut opgeslagen werd.
        this.pixel1 = pixel1;
        this.pixel2 = pixel2;
    }


    public void toon() {
        //
        System.out.println("ToetsHulp.Theorie.April9.Antwoorden.Opgave2.ToetsHulp.Theorie.April9.StartSituatie.Opgave2.ToetsHulp.NieuwePoging.April9.Opgave2.ToetsHulp.NieuwePoging.April9_2021.Opgave2.Plaatje: " + pixel1 + ", " + pixel2);
    }
}
