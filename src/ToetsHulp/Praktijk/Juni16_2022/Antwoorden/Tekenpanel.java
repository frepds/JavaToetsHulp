import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Tekenpanel extends JPanel
{
	private Bar bar;

	public Tekenpanel(Bar bar) {
		this.bar = bar;
		setPreferredSize(new Dimension(550, 260)); // setSize werkt niet bij JPanel!
		setBackground(Color.white);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int x = 30;
		int y = 150;

		// de tafel: een blad en twee poten.
		g.setColor(Color.lightGray);
		// poten:
		g.fillRect(x + 50, y, 30, 100); // veel te hoog, maar maakt niet uit, is toch buiten beeld
		g.fillRect(this.getWidth() - 20 - 50 - 30, y, 30, 100);
		// dun zwart lijntje voor beter contrast op de papieren toets (niet verplicht)
		g.setColor(Color.black);
		g.drawRect(x + 50, y, 30, 100); // veel te hoog, maar maakt niet uit, is toch buiten beeld
		g.drawRect(this.getWidth() - 20 - 50 - 30, y, 30, 100);

		g.setColor(Color.lightGray);
		g.fillRect(10, y, this.getWidth() - 20, 20);
		g.setColor(Color.black);
		g.drawRect(10, y, this.getWidth() - 20, 20);

		// iets lichtere kleuren, komt beter uit screenshot in een zwart-wit uitgeprinte toets.
		// Maar je mag natuurlijk ook gewoon Color.blue etc... gebruiken.
		Color lightBlue = new Color(90, 130, 255);
		Color lightYellow = new Color(255, 255, 130);
		Color lightRed = new Color(255, 40, 20);

		// n.b. Als je de Drank zichzelf laat tekenen, is het niet nodig om hier moeilijk te doen met casten en instanceof enz.
		// Zie voor een vb. daarvan, een oefentoets. 
		for(Drank drank: bar.get_DRANKEN_LIJST())
		{
			if(drank instanceof Water) {				
				((Graphics2D) g).setStroke(new BasicStroke(3));
				Water w = (Water) drank;  // casten.
				int hoogte = w.getFormaatVoorGui() * 40;

				g.setColor(lightBlue);
				g.fillRect(x + 1, y - hoogte + 20, 58, hoogte - 21);

				g.setColor(Color.black);
				g.drawRect(x, y - hoogte, 60, hoogte);
			}
			else if(drank instanceof WarmeDrank)
			{
				WarmeDrank warm = (WarmeDrank) drank;  // casten.
				// lepeltje, alleen bij melk en/of suiker
				if (warm.heeftLepeltje()) {
					//schuine lijn
					((Graphics2D) g).setStroke(new BasicStroke(8));
					g.setColor(Color.black);
					g.drawLine(x + 45, y - 60, x + 60, y - 100);
				}
				((Graphics2D) g).setStroke(new BasicStroke(3));

				Color warmeDrankKleur = null;
				if (warm.getIsThee_voorGUI()) { warmeDrankKleur = lightRed; } //getter nodig als alles vanuit tekenpaneel wilt tekenen.
				else { warmeDrankKleur = Color.black; }

				// het 'oor' van de thee/koffiekop
				g.setColor(warmeDrankKleur);
				// een witte cirkel in de grotere cirkel van de juiste kleur, om het oor te maken.
				g.fillOval(x + 40, y - 57, 40, 46);
				g.setColor(Color.white);
				g.fillOval(x + 50, y - 47, 20, 23);

				// het kopje:
				g.setColor(warmeDrankKleur);
				g.fillRect(x, y - 60, 60, 60);
			}

			// een eindje verderop de volgende
			x += 100;
		}
	}
}
