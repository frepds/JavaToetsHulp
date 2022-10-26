package ToetsHulp.NieuwePoging.Juni8_2021.Opgave3;

import ToetsHulp.NieuwePoging.Juni8_2021.Opgave4.Vliegtuig;

// code voor opgave 3
//
public class Garage
{
	private Vliegtuig vliegtuig;

	public void zetInGarage( Vliegtuig v ) { vliegtuig = v; }

	public void upgrade( String upgradeNaam ) {
		// de nieuwe naam voor het ToetsHulp.NieuwePoging.Juni8_2021.Opgave4.Vliegtuig
		upgradeNaam = vliegtuig.getNaam() + upgradeNaam;

		// upgrade het ToetsHulp.NieuwePoging.Juni8_2021.Opgave4.Vliegtuig
		Vliegtuig upgrade = new Vliegtuig( upgradeNaam );

		// en update de ToetsHulp.NieuwePoging.Juni8_2021.Opgave3.Garage
		zetInGarage( upgrade );
	}
}
