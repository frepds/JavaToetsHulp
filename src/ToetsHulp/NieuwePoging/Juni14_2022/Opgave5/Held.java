package ToetsHulp.NieuwePoging.Juni14_2022.Opgave5;

public abstract class Held {
    public Held(String s, int y){

    }

    public boolean heeftXRayVision(int x) {
        return false;
    }

    public String vermomming() {
        return "Held --> vermomming";
    }

    public String alleOverloading() {
        return "Held --> alleOverloading";
    }

    public abstract String specialeKracht();

}
