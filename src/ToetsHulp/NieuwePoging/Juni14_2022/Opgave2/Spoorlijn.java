package ToetsHulp.NieuwePoging.Juni14_2022.Opgave2;// code voor opgave 2
//

import java.util.ArrayList;

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
}
