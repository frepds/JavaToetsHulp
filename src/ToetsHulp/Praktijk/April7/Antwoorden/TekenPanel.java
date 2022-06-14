package ToetsHulp.Praktijk.April7.Antwoorden;

import javax.swing.*;
import java.awt.*;

public class TekenPanel extends JPanel
{
	/*
	5: panel/tekenen, 15 punten =================
	[1] er is een tekenpanel
	[1] Een Docent wordt weergegeven als een vierkant van 70 x 70 pixels.
	[1] Studenten worden weergegeven als cirkels met een diameter van 70 pixels.

	[1] niet overlappen / De ruimte tussen de iconen is ook ongeveer 70 pixels.
	[2] Als de rij vol is, gaat het tekenen op de volgende rij verder. Let er ook op, dat de laatste op de rij nog goed zichtbaar is.
	
	[2] De getKleur-methode van Persoon wordt gebruikt voor de kleur.
	[2] Toon onder elk icoon de gegevens (klein, volgorde van naam, bij en beschrijving is niet van belang).
	[2] Teken in elke icoon het resultaat van getSmiley (groot, maakt niet uit welk font, en 90 graden gedraaid, bv. mbv de in toets gegeven drawStringRotated)
  
	[2] repaint() in actionperformed. Als je dit niet doet, zie je geen wijzigingen in de klas als je bv. iets toevoegt (je ziet dat pas als je het scherm van grootte verandert, omdat dat ook automatisch een repaint aanroept)
	[1] super.paintcomponent
	*/

	private Klas klas;

	public TekenPanel(Klas klas) {
		// hier ervoor gekozen om de klas aan de panel mee te geven. We hadden ook de KlasGui mee kunnen geven. Zolang we maar een link hebben (evt indirect) naar de klas die we willen tekenen.
		this.klas = klas;
		setPreferredSize(new Dimension(580, 360));
		setBackground(Color.white); //of iets anders wat mooi staat.

	}


	public void paintComponent(Graphics g) {
		//let op: niet paintComponents(...) met een s aan het eind. Dat bestaat ook maar is iets heel anders.
		// nooit vergeten! Dat kan leiden tot raar gedrag van de window.
		super.paintComponent(g);

		// we laten in deze uitwekring de klas zichzelf tekenen (maar tekenen had ook hier in de tekenpanel gekund).
		klas.tekenMij(g, this.getWidth() );
	}
}

