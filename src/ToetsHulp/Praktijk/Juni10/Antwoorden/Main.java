package ToetsHulp.Praktijk.Juni10.Antwoorden;/*PARAMSUBST_START
PARAMSUBST_END */

import static java.lang.Math.PI; //Automatisch toegevoegd voor tests (mnc07)
import java.util.Collections; //Automatisch toegevoegd voor tests (mnc07)
import java.util.List; //Automatisch toegevoegd voor tests (mnc07)
import java.util.ArrayList; //Automatisch toegevoegd voor tests (mnc07)
import java.util.Arrays; //Automatisch toegevoegd voor tests (mnc07)
import java.util.stream.IntStream; //Automatisch toegevoegd voor tests (mnc07)
import java.util.*; //Automatisch toegevoegd voor tests (mnc07)
import java.lang.reflect.*; //Automatisch toegevoegd voor tests (mnc07)

public class Main
{

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
