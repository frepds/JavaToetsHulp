package ToetsHulp.Praktijk.Juni10_2021.Antwoorden;/*PARAMSUBST_START
PARAMSUBST_END */


public class Main {

    /*PARAMSUBST_START
    //PARAMSUBST:  VERZAMELING = Kroeg
    //PARAMSUBST:  VERZAMELING::_VERZVAR = k
    //PARAMSUBST:  VERZAMELING::_VOEGTOE = toevoegen
    PARAMSUBST_END */
    public static void main(String[] args) {
        // write your code here
        Kroeg k = new Kroeg();
        k.toevoegen("Jan", "hier", 3);
        k.toevoegen("Mieke", "daar", 5);
        k.toevoegen("Rik", "r@rik.nl", 1);
        k.toevoegen("Eva", "huis 1", 3);
        //HorecaGui gui = new HorecaGui(k);
    }
}
