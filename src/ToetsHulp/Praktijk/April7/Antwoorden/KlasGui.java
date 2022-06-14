package ToetsHulp.Praktijk.April7.Antwoorden;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KlasGui extends JFrame implements ActionListener
{
	// frame (a)
	// a: 5 punten.
	//[1] heeft uberhaupt een frame achtig iets.
	//[1] heeft een Klas-object als attribuut (via de constructor meegegeven). 
	//[1] layout ongeveer zoals in toets screenshot.
	//[1] De applicatie wordt afgesloten door op het kruisje te klikken.
	//[1] De titel bevat je eigen naam en studentnummer, de naam van het meegegeven Klas-object, en de tekst "mededeling:"
	
	//b) vraag 3b: 5 punten
	//[2] de voeg toe-knop voegt een student-object toe aan de Klas op basis van de waardes in de tekstvelden. (Foutafhandeling komt bij (3c)).
	//[2] de tijd verstrijkt-knop roept de maakBlij-methode van Klas aan met waarde -5
	//[1] Elke keer dat een knop ingedrukt wordt, moet de Klas geprint worden. Dus zowel bij de helpdialoog, als de voegtoe, als de tijdverstrijkt. Als je dat ergens niet doet, verlies je dit punt.
	// let op, om de knoppen werkend te krijgen zijn 3 dingen nodig: implements ActionListener, addActionListener(..) en de actionPerformed(..) methode. Zonder 1 van deze componenten geen punten.
	// het is niet erg als de methodes van klas die je moet aanroepen, niet werken (dus als voegtoe of maakblij het niet doet, kun je nog steeds alle punten halen hier).

	// vraag 3c (5 punten)
	//[3]  een werkende en specifieke try-catch met NumberFormatException. Anders mis je deze 3 punten. De titel kan natuurlijk nog wel up-to-date zijn.
	//[2]  titel up-to-date. Let op: als de titel op de foutmelding wordt gezet, en de keer erna weer een toevoeging slaagt, dan moet de titel ook weer op "ok". Als je dat niet doet, dan mis je deze 2 punten.

	private Klas klas;
	private JButton voegToeButton; // buttons als attribuut zodat we ze in actionPerformed kunnen herkennen.
	private JTextField textfield1;
	private JTextField textfield2;
	private JTextField textfield3;
	private JButton helpIemandButton;
	private JButton tijdVerstrijktButton;

	public KlasGui(Klas klas) {
		this.klas = klas; // klas opslaan, zodat de GUI opdrachten (zoasls : teken jezelf, of : voeg iets toe) kan geven aan de klas)
		updateTitle(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE); //niet vergeten dat de app moet sluiten als je op het kruisje klikt.

		//initialize components
		tijdVerstrijktButton = new JButton("tijd verstrijkt");
		tijdVerstrijktButton.addActionListener(this);
		add(tijdVerstrijktButton);

		helpIemandButton = new JButton("help iemand");
		helpIemandButton.addActionListener(this);
		add(helpIemandButton);
		add(new JLabel("naam: "));
		textfield1 = new JTextField(5);
		add(textfield1);

		add(new JLabel("blij: "));
		textfield2 = new JTextField(5);
		add(textfield2);

		add(new JLabel("s: "));
		textfield3 = new JTextField(5);
		add(textfield3);

		voegToeButton = new JButton("voeg toe");
		add(voegToeButton);
		voegToeButton.addActionListener(this);

		add(new TekenPanel(klas));

		setMinimumSize(new Dimension(650, 400)); // of een andere geschikte afmeting. Hangt van je besturingsysteem af.
		setSize(600, 400);
		this.setVisible(true);
	}

    // handige hulpmethode om de titel 'te beheren'
    // het kan natuurlijk ook zonder deze methode, maar dan
    // krijg je op meerdere plekken in de code extra logica erbij, en dat is rommeliger,
    // en moeilijker te onderhouden.
	private void updateTitle(boolean ok) {
		String mededeling = "OK";
		if(!ok) {
			mededeling = "Exception!";
		}
		setTitle("Wilco Moerman (s77777777): " + klas.getNaam() + " - mededeling: " + mededeling);
	}

    // acties afhandelen:
	public void actionPerformed(ActionEvent e) {
		// resetten van het label met de foutmeldingen
		updateTitle(true);

		if (e.getSource() == helpIemandButton) // de event e heeft een referentie naar de originele button die de klick genereerde, dus == is voldoende. 
		{
		   //dialoog om gegevens op te vragen
			HelpDialoog helpDialoog = new HelpDialoog(this);
			if(helpDialoog.getIsOkGekozen())
			{
				// ok afhandelen.
				boolean succes = false;
				try {
					String naam = helpDialoog.getNaamUitTekstveld0();
					int blij = Integer.parseInt( helpDialoog.getBlijheidsVeranderingUitTekstveld1() );
					// parsen is succesvol verlopen: maak blij:
					klas.maakBlij(naam, blij);
					// maak nu ook Docent naam:
					if(blij > 0) {
						// maar alleen als de blijheid v/d student vermeerderd werd!
						klas.getDocent().maakBlij(10);
					}
					succes = true;
				}
				catch(NumberFormatException nfe) {
					// we zouden hier een melding kunnen printen op de console
				}

				updateTitle(succes);
			}
			// else cancel in dialog: negeren
		}
		else if(e.getSource() == tijdVerstrijktButton)
		{
			klas.maakBlij(-5); // iedereen, zelfs docenten, zijn onderhevig aan de tijd, en worden minder blij :-)
		}
		else if(e.getSource() == voegToeButton)
		{
			//textvelden uitlezen voor de gegevens:
			try
			{
				Student nieuweStudent = new Student(textfield1.getText(), textfield2.getText(), Integer.parseInt(textfield3.getText()));
				klas.voegToe(nieuweStudent);
			}
			catch(NumberFormatException nfe)
			{
				updateTitle(false);
			}
		}

		// maakt niet uit wat er gebeurd is (en ook niet of het op de toets gevraagd wordt of niet), altijd ff printen om te zien of het getekende klopt met wat er in arraylist zit!
		klas.print();

		// en zorgen dat alles opnieuw getekend wordt
		repaint();
	}
}

