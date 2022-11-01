import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarGui extends JFrame implements ActionListener
{
	private Bar bar;
	private JButton voegToeButton;
	private JButton dialoogButton; // buttons als attribuut zodat we ze in actionPerformed kunnen herkennen.;
	private JCheckBox cb_thee;
	private JCheckBox cb_melk;
	private JCheckBox cb_suiker;
	public static boolean tekenVersimpeld = false;
	
	private static Color lightGreen = new Color(100,255,100); // iets lichter groen dan Color.green (komt beter uit in zwart-wit screencapture)

	public BarGui(Bar b) {
		this.bar = b;

		setTitle("Aminah Balfaqih s123456"); //titel zetten was een eis in de toets
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE); //niet vergeten dat de app moet sluiten als je op het kruisje klikt.

		//initialize components
		voegToeButton = new JButton("warme drank bestellen");
		add(voegToeButton);
		voegToeButton.addActionListener(this);

		cb_thee = new JCheckBox("thee?");
		add(cb_thee);
		cb_melk = new JCheckBox("melk?");
		add(cb_melk);
		cb_suiker = new JCheckBox("suiker?");
		add(cb_suiker);

		dialoogButton = new JButton("water bestellen");
		add(dialoogButton);
		dialoogButton.addActionListener(this);
		dialoogButton.setBackground(lightGreen);

		add(new Tekenpanel(b));

		//setMinimumSize(new Dimension(650, 400)); // of een andere geschikte afmeting. Hangt van je besturingsysteem af.
		setSize(550, 280);

		this.setVisible(true);

		//vb input voor screenshot:
		this.cb_thee.setSelected(true);
		this.cb_melk.setSelected(false);
		this.cb_suiker.setSelected(true);
		this.dialoogButton.requestFocus();
	}

	public void actionPerformed(ActionEvent e) {
		// we gaan er vanuit dat er nu een goede input is (of een andere knop ingedrukt is).
		dialoogButton.setBackground(lightGreen);

		if (e.getSource() == voegToeButton) {
			WarmeDrank wd = new WarmeDrank(cb_thee.isSelected(), cb_melk.isSelected(), cb_suiker.isSelected());
			bar.toevoegen(wd);
		}

		else if (e.getSource() == dialoogButton) {
			WaterBestelDialoog d = new WaterBestelDialoog(this);

			if (d.getIsOk()) {
				String aantalTxt = d.getAantal();
				String formaat = d.getFormaat();
				try {
					int aantal = Integer.parseInt(aantalTxt);
					Water w = new Water(formaat);
					for(int i = 0; i < aantal; i++) {
						bar.toevoegen(w);
					}
				}
				catch (NumberFormatException nfe) {
					dialoogButton.setBackground(Color.red);
				}
			}
		}

		bar.print(); // zodat je kunt zien (ook zonder gui) of er wat gebeurd is. Handig voor debuggen.

		repaint(); //zorgen dat gui up-to-date is.
	}
}
