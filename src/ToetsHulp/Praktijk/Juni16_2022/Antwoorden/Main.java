public class Main
{

	public static void main(String[] args) {
		Bar bar = new Bar();
		bar.toevoegen(new Water("groot"));
		bar.toevoegen(new WarmeDrank(true,false,true));
		bar.toevoegen(new Water("klein"));
		bar.toevoegen(new WarmeDrank(false,false,false));

		BarGui gui = new BarGui(bar);
	}
}
