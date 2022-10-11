package ToetsHulp.Theorie.April9.Antwoorden.Opgave1;


public class Beschermd {
    // moet altijd groter of gelijk aan 10 zijn.
    private int getal = 12345;  // niet vergeten om 'm private te maken, anders helpen de setter en constructor met beshermende logica niet.
    private static int aantal_illegaal = 0; // static attributen nodig, omdat we iets moeten bijhouden dat over meerdere objecten gaat.
    private static int aantal_legaal = 0;

    private static int grens = 10; // mocht ook hardcoded getal in setter en constructor

    public Beschermd(int getal) {
        // omdat getal by default op 12345 staat (declaratie van het attribuut hierboven), kunnen we nu gewoon setGetal aanroepen.
        // Als je getal bij de declaratie een andere waarde geeft (of niks doet: "private int getal; " dan moet je er op een andere manier voor zorgen
        // dat de constructor getal =p 12345 zet als de input illegaal is.
        setGetal(getal);
    }


    public String toString() {
        return "ToetsHulp.Theorie.April9.Antwoorden.Opgave1.ToetsHulp.Theorie.April9.StartSituatie.Opgave1.ToetsHulp.NieuwePoging.April9.Opgave1.Beschermd: getal = " + getal;
    }


    public void setGetal(int getal) {
        if (getal >= grens) {
            System.out.println("ok");
            this.getal = getal;
            aantal_legaal++;
        } else {
            System.out.println("mag niet");
            aantal_illegaal++;
        }
    }


    public static void printLogging() {
        System.out.print("# ok = " + aantal_legaal + ", ");
        System.out.println("# mag niet = " + aantal_illegaal);
    }


    // wat testcode

    public static void test_constr_en_setter() {
        Beschermd a = new Beschermd(777777);
        a.setGetal(2);
        System.out.println(a);
        a.setGetal(333);
        System.out.println(a);

        Beschermd b = new Beschermd(-1);
        System.out.println(b);
    }


    public static void test_constructor() {
        Beschermd a = new Beschermd(88888);
        Beschermd b = new Beschermd(-1);
    }

    public static void test_setter() {
        Beschermd a = new Beschermd(777777);
        a.setGetal(2);
        a.setGetal(333);
    }


    public static void test_tostring() {
        Beschermd a = new Beschermd(88888);
        System.out.println(a);
    }

    public static void test_static_logging() {
        Beschermd.printLogging();

        Beschermd a = new Beschermd(777);
        Beschermd b = new Beschermd(-1);
        b.setGetal(123);
        Beschermd c = new Beschermd(98765);

        Beschermd.printLogging();

        Beschermd d = new Beschermd(100);
        d.setGetal(-1);
        Beschermd.printLogging();
    }


}
