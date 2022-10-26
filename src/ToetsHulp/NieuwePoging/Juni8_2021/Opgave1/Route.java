package ToetsHulp.NieuwePoging.Juni8_2021.Opgave1;

// code voor opgave 1

import java.util.ArrayList;

public class Route {
    private int afstand;
    private String start;
    private static ArrayList<Integer> arrayList = new ArrayList<>();

    public Route(int afstand) {
        this(afstand, "???");
    }

    public Route(int afstand, String start) {
        if (afstand < 3) {
            this.afstand = -1;
            System.out.println("te kort");
        } else {
            arrayList.add(afstand);
            this.afstand = afstand;
        }
        this.start = start;
    }

    public void setStart(String start) {
        if (this.start.equals("???")) {
            this.start = start;
        } else {
            System.out.println("mag niet");
        }
    }

    public int moeilijkheidsgraad(int tijd, int conditie) {
        // voor vraag (c)
        if (tijd < 0 || conditie < 0) {
            return -1;
        }

        return conditie / (tijd * (afstand - 3));
    }

    public static void printMinMax() {
        int grootsteAfstand = 0;
        int korsteAfstand = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (korsteAfstand <= arrayList.get(i)) {
                korsteAfstand = arrayList.get(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) >= grootsteAfstand) {
                grootsteAfstand = arrayList.get(i);
            }
        }
        System.out.println("kortste afstand is " + korsteAfstand + " km");
        System.out.println("langste afstand is " + grootsteAfstand + " km");
    }



    public String toString() {
        return "Route van " + this.afstand + " km, start: " + this.start;
    }

}
