package ToetsHulp.NieuwePoging.Juni14_2022.Opgave2;// code voor opgave 2
//

import java.util.ArrayList;
import java.util.Objects;

public class Spoorlijn {

	private String naam;
	private ArrayList<Station> stations;

	public Spoorlijn(String n) {
		naam = n;
		stations = new ArrayList<>();
	}

	public Station getLaatsteStation() {
		return stations.get(stations.size() - 1);
	}

	public int lengte() {
		return stations.size();
	}

	public String toString() {
		return  naam + ": " + stations.get(0) + " --> "
				+ getLaatsteStation() + " (" + lengte() + ")";
	}

	public void voegStationToe(String station) {
		Station s = new Station(stations.size(), station);
		stations.add(s);
	}

	@Override
	public boolean equals(Object o) {
		Spoorlijn that = (Spoorlijn) o;
		if (!(that instanceof Spoorlijn)) {
			return false;
		}
		if (!Objects.equals(this.naam, that.naam)) {
			return false;
		}

		boolean eersteStation = false, tweedeStation = false;
		if (this.stations.get(0).equals(that.stations.get(0)) || this.stations.get(0).equals(that.stations.get(stations.size() - 1))) { eersteStation = true; }
		if (this.stations.get(stations.size() - 1).equals(that.stations.get(0)) || this.stations.get(0).equals(that.stations.get(stations.size()))) { tweedeStation = true; }


		return Objects.equals(this.naam, that.naam) && eersteStation && tweedeStation;
	}

	public static void printLangste() {
		System.out.println();
	}

}
