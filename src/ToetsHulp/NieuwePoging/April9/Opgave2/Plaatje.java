package ToetsHulp.NieuwePoging.April9.Opgave2;

//vraag 2
public class Plaatje {
    public int pixel1;
    public int pixel2;

    public Plaatje(int pixel1, int pixel2) {
        pixel1 = pixel1;
        pixel2 = pixel2;
    }

    public void toon() {
        System.out.println("ToetsHulp.NieuwePoging.April9.Opgave2.Plaatje: " + pixel1 + ", " + pixel2);
    }
}
