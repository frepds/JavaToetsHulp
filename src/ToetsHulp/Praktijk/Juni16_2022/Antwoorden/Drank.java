abstract class Drank
{
//deze klasse moest abstract gemaakt worden
	public String toString() { return getOmschrijving() + " (" + getPrijs() + ")"; }

	// de volgende methodes moesten abstract zijn en dus bij water en warme drank gebruikt worden.
	public abstract double getPrijs();

	public abstract String getOmschrijving();
}
