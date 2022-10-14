package ToetsHulp.Theorie.April9_2021.Antwoorden.Opgave2;

public class PicPoc {
    private Plaatje img;

    public void uploadPlaatje(Plaatje i) {
        img = i;
    }

    public Plaatje downloadPlaatje() {
		/*
		Het probleem was, dat na het downloaden het veranderen v/h gedownloade plaatje ervoor zorgde dat het plaatje in de account (img)
		ook veranderd werd. Dat koomt omdat het ToetsHulp.Theorie.April9.Antwoorden.Opgave2.ToetsHulp.Theorie.April9.StartSituatie.Opgave2.ToetsHulp.NieuwePoging.April9.Opgave2.Plaatje img gewoon gereturnd werd. De downloader krijgt dus de referentie (verwijzing/adres)
		naar exact hetzelfde stuk geheugen als het ToetsHulp.Theorie.April9.Antwoorden.Opgave2.ToetsHulp.Theorie.April9.StartSituatie.Opgave2.ToetsHulp.NieuwePoging.April9.Opgave2.PicPoc object ook heeft. Het is dus hetzelfde object, alleen toevallig bekend
		onder twee verschillende namen. 
		Om het op te lossen, moeten we een nieuw ToetsHulp.Theorie.April9.Antwoorden.Opgave2.ToetsHulp.Theorie.April9.StartSituatie.Opgave2.ToetsHulp.NieuwePoging.April9.Opgave2.Plaatje maken en dat de zelfde pixel waardes geven als het origineel.
		*/
        Plaatje imgCopy = new Plaatje(img.pixel1, img.pixel2);
        // imgCopy.pixel1 = img.pixel1; // als de ToetsHulp.Theorie.April9.Antwoorden.Opgave2.ToetsHulp.Theorie.April9.StartSituatie.Opgave2.ToetsHulp.NieuwePoging.April9.Opgave2.Plaatje constructor goed werkt, is deze twee regel niet nodig.
        // imgCopy.pixel2 = img.pixel2;; // als de ToetsHulp.Theorie.April9.Antwoorden.Opgave2.ToetsHulp.Theorie.April9.StartSituatie.Opgave2.ToetsHulp.NieuwePoging.April9.Opgave2.Plaatje constructor goed werkt, is deze twee regel niet nodig.
        return imgCopy;
    }

    public void toon() {
        img.toon();
    }

}
