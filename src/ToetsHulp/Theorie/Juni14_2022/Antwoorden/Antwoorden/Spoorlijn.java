package ToetsHulp.Theorie.Juni14_2022.Antwoorden.Antwoorden;

import java.util.ArrayList;

public class Spoorlijn {
    private String naam;
    private ArrayList<Station> stations;

    // static voor opdracht b
    private static Spoorlijn langste = null;

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


//	public boolean equals(Spoorlijn s) {  // deze heeft verkeerde signatuur!
//	System.out.println("verkeerde sig");
//		return true;
//	}


    public boolean equals(Object o) { //aanpassing van de auto-gegenereerde equals.
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Spoorlijn that = (Spoorlijn) o;
        // kunt ook de naam opvragen en die vergelijken.
        Station this_eerste = this.stations.get(0);
        Station that_eerste = that.stations.get(0);
        Station this_laatste = this.getLaatsteStation();
        Station that_laatste = that.getLaatsteStation();

        // begin zelfde, eind zelfde.
        if (this_eerste.equals(that_eerste) && this_laatste.equals(that_laatste)) {
            return true;
        }

        // begin van ene is einde van ander, en andersom.
        if (this_eerste.equals(that_laatste) && this_laatste.equals(that_eerste)) {
            return true;
        }

        // alle overgebleven opties zijn niet gelijk:
        return false;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    // code zoals in startcode.zip:
    public void voegStationToe___FOUT___(String station) {
        Station s = new Station(stations.size(), station);
        stations.add(s);
    }


    public void voegStationToe(String station) {
        Station s = new Station(stations.size(), station);
        stations.add(s);

        if (langste == null) {    // er moet er eentje de eerste zijn...
            langste = this;
        } else if (stations.size() >= langste.stations.size()) { //langer? dan opslaan.
            langste = this;
        }
    }

    public static void printLangste() {
        System.out.println(langste);
    }


    // vb uit de toets
    public static void demo_equals() {
        Spoorlijn een = new Spoorlijn("IC");
        een.voegStationToe("Zwolle");
        een.voegStationToe("Deventer");

        Spoorlijn twee = new Spoorlijn("Sprinter");
        twee.voegStationToe("Zwolle");
        twee.voegStationToe("Heino");
        twee.voegStationToe("Raalte");
        twee.voegStationToe("Wierden");
        twee.voegStationToe("Deventer");

        // begin- en eindpunt hetzelfde
        System.out.println(een.equals(twee));

        Spoorlijn drie = new Spoorlijn("IC");
        drie.voegStationToe("Deventer");
        drie.voegStationToe("Zwolle");

        // eindpunt van ene is beginpunt van de ander, en andersom.
        System.out.println(een.equals(drie));

        Spoorlijn vier = new Spoorlijn("stoomtrein");
        vier.voegStationToe("Zwolle");
        vier.voegStationToe("Middle-of-Nowhere");

        // ander begin- of eindpunt
        System.out.println(een.equals(vier));
    }


    // vb uit de toets
    public static void demo_static() {
        Spoorlijn.printLangste();

        Spoorlijn een = new Spoorlijn("IC");
        een.voegStationToe("Zwolle");
        een.voegStationToe("Deventer");

        Spoorlijn.printLangste();

        // Spoorlijn twee is langer dan Spoorlijn een, dus twee wordt onthouden
        Spoorlijn twee = new Spoorlijn("Sprinter");
        twee.voegStationToe("Zwolle");
        twee.voegStationToe("Wezep");
        twee.voegStationToe("Nunspeet");
        twee.voegStationToe("Harderwijk");
        twee.voegStationToe("Utrecht");

        Spoorlijn.printLangste();

        // Spoorlijn drie is korter dan de langste
        Spoorlijn drie = new Spoorlijn("Sprinter");
        drie.voegStationToe("Groningen");
        drie.voegStationToe("Assen");
        drie.voegStationToe("Zwolle");

        Spoorlijn.printLangste();
    }

}
