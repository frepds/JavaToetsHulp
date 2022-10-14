package ToetsHulp.Theorie.April9_2021.StartSituatie.Opgave2;

import ToetsHulp.Theorie.April9_2021.Antwoorden.Opgave2.Plaatje;

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
