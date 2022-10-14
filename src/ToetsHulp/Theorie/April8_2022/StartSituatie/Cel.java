package ToetsHulp.Theorie.April8_2022.StartSituatie;

// code voor opgave 5
//
public class Cel {

	private Gevangene gevangene;

	public String toString() {
		return "Cel: # " +  gevangene + " #";
	}

	public void setGevangene(String naam, int straf) {
		gevangene = new Gevangene(naam);
		gevangene.geefStraf(1234567, straf);
	}

	public Gevangene getGevangene() {
		return gevangene;
	}

	public void jaarwisseling() {
		gevangene.verminder(1234567);
	}

	public void laatVrij() {
		if (gevangene.isVrij()) {
			gevangene = null;
		}
	}

	public void omwisselen(Cel andere) {
		andere.gevangene = gevangene;
		gevangene = andere.gevangene;
	}
}
