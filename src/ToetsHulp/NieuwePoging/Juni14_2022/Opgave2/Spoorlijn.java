package ToetsHulp.NieuwePoging.Juni14_2022.Opgave2;
import java.util.ArrayList;

// code voor opgave 2

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
        return naam + ": " + stations.get(0) + " --> "
                + getLaatsteStation() + " (" + lengte() + ")";
    }

    public void voegStationToe(String station) {
        Station s = new Station(stations.size(), station);
        stations.add(s);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Spoorlijn)) return false;

        Spoorlijn that = (Spoorlijn) o;

       if (this.stations.get(0).equals(that.stations.get(0))  && this.stations.get(stations.size() - 1).equals(that.stations.get(stations.size() - 1))) { return true ;};
       if (this.stations.get(0).equals(that.stations.get(stations.size() - 1)) && this.stations.get(stations.size() - 1).equals(that.stations.get(0))) { return true; };
       return false;
    }

    public static void printLangste() {

    }

}
