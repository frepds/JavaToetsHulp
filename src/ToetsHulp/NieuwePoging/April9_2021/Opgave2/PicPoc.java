package ToetsHulp.NieuwePoging.April9_2021.Opgave2;

//vraag 2
public class PicPoc {
    private Plaatje img;

    public void uploadPlaatje(Plaatje i) {
        img = i;
    }

    public Plaatje downloadPlaatje() {
//        img.toon(); // dit plaatje wordt gedownload.
//        return img;

        Plaatje imgCopy = new Plaatje(img.pixel1, img.pixel2);
        return imgCopy;
    }

    public void toon() {
        img.toon();
    }
}
