package ToetsHulp.Praktijk.April7.Antwoorden;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpDialoog extends JDialog implements ActionListener
{
	//4a (5 punten)
	//[1] verschijnt als de "help iemand"-knop wordt ingedrukt
	//[1] is modaal
	//[1] layout en titel ongeveer zoals in screenshot in toets.
	//[1] wordt afgesloten als op het kruisje of de knoppen geklikt wordt. Dus zowel ok als cancel knop resulteren in afsluiten van dialoog.
	//[1] alle attributen zijn private

	// 4b (5 punten)
	//[2] als de OK-knop gekozen is, wordt van de Persoon met de ingevoerde naam de blij-waarde aangepast (verhoogd of verlaagd, afhankelijk van de opgegeven waarde).
	//[1] Als er geen Persoon aanwezig is met de ingevoerde naam, dan wordt er niks gedaan.
	//[1] Als er geen int ingevuld wordt, gebeurt er uiteraard niks (en de GUI mag niet crashen, dus opvangen met bv. NumberFormatException, maar Exception mag ook).
	//[1] Als de blijheid van een Persoon verhoogd werd, dan wordt de docent 10 blijer, en anders niet. Dus als de docent altijd of nooit +10 krijgt, mis je dit punt.
	
	private JTextField naamTextfield;  // naam
	private JTextField blijheidveranderingsTextfield;  // blijheid
	private JButton jbOk;
	private JButton jbCancel;
	private boolean isOkGekozen;

	public HelpDialoog(JFrame frame) {
		super(frame, true);
		setSize(290, 140);
		setTitle("Help iemand");
		setLayout(new GridLayout(3, 2)); //met wat kunst-en-vliegwerk kun je een soortgelijke dialoog maken met een flowlayout (maar dat is gepruts).
		int textfield_width = 20;

		jbOk = new JButton("OK");
		jbOk.addActionListener(this);
		
		jbCancel = new JButton("cancel");
		jbCancel.addActionListener(this);

		naamTextfield = new JTextField(textfield_width);
		blijheidveranderingsTextfield = new JTextField(textfield_width);

		add(new JLabel("  naam"));
		add(naamTextfield);

		add(new JLabel("  blijheidswijziging"));
		add(blijheidveranderingsTextfield);

		add(jbOk);
		add(jbCancel);

		setVisible(true);
	}

    // getters om de ingevoerde waardes op te kunnen vragen.
	public String getNaamUitTekstveld0() { return this.naamTextfield.getText(); }

	public String getBlijheidsVeranderingUitTekstveld1() { return this.blijheidveranderingsTextfield.getText(); }

	public boolean getIsOkGekozen() { return isOkGekozen; }

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbOk)
		{
			isOkGekozen = true;
		} else if(e.getSource() == jbCancel)
		{
			isOkGekozen = false;
		}
		setVisible(false); //of dispose. Niet vergeten om na elke knop de dialog te sluiten (stond in de vraag).

	}
}

