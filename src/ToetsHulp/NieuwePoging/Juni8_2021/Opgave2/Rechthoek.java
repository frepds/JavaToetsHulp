package ToetsHulp.NieuwePoging.Juni8_2021.Opgave2;

public class Rechthoek {
    private int lengte;
    private int breedte;
    private int kleur;

    public Rechthoek(int lengte, int breedte, int kleur) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.kleur = kleur;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Rechthoek)) {
            return false;
        }

        Rechthoek that = (Rechthoek) obj;

        boolean lengte = this.lengte == that.lengte || this.lengte == that.breedte;
        boolean breedte = this.breedte == that.breedte || this.breedte == that.lengte;
        boolean kleur = this.kleur == that.kleur;

        return lengte && breedte && kleur;

    }

    public static void main(String[] args) {
        Rechthoek re1 = new Rechthoek(3, 4, 123);
        Rechthoek re2 = new Rechthoek(5, 7, 123);
        Rechthoek re3 = new Rechthoek(4, 3, 123);
        Rechthoek re4 = new Rechthoek(3, 4, 7);
        Rechthoek re5 = new Rechthoek(3, 4, 123);

        // vorm verschillend en kleur gelijk
        System.out.println(re1.equals(re2)); // false
        // vorm gelijk maar gedraaid; kleur gelijk
        System.out.println(re1.equals(re3)); // true
        // vorm gelijk; kleur verschillend
        System.out.println(re1.equals(re4)); // false
        // vorm en kleur gelijk
        System.out.println(re1.equals(re5)); // true
    }


}
