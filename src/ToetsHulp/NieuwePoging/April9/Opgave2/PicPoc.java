package ToetsHulp.NieuwePoging.April9.Opgave2;

//vraag 2
public class PicPoc {
    private Plaatje img;

    public void uploadPlaatje(Plaatje i) {
        img = i;
    }

    public Plaatje downloadPlaatje() {
        img.toon(); // dit plaatje wordt gedownload.
        return img;
    }

    public void toon() {
        img.toon();
    }
}
