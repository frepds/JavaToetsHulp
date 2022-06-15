package ToetsHulp.Praktijk.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WijzigDialoog extends JDialog implements ActionListener
{

	private JTextField textField0;
	private JTextField textField1;
	private JButton jbOk;
	private JButton jbCancel;
	private boolean isOkGekozen;


	public WijzigDialoog(JFrame frame) {
		super(frame, true);
		setSize(350, 95);
		setTitle("weggaan");

		//met wat kunst-en-vliegwerk kun je een soortgelijke dialoog maken met een flowlayout (maar dat is gepruts).
		setLayout(new GridLayout(2, 3));
		int textfield_width = 20;

		jbOk = new JButton("OK");
		jbOk.addActionListener(this);
		jbCancel = new JButton("cancel");
		jbCancel.addActionListener(this);

		textField0 = new JTextField(textfield_width);
		textField1 = new JTextField(textfield_width);

		add(new JLabel(" naam"));
		add(textField0);
		add(jbOk);

		add(new JLabel(" weglopers"));
		add(textField1);
		add(jbCancel);

		setVisible(true);
	}

   
   // getters om de ingevoerde waardes op te kunnen vragen.
	public String getNaamUitTekstveld0() { return this.textField0.getText(); }
	public String getAantalUitTekstveld1() { return this.textField1.getText(); }

	public boolean getIsOkGekozen() { return isOkGekozen; }

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbOk)
   		{
   			isOkGekozen = true;
   		} else if(e.getSource() == jbCancel)
   		{
   			isOkGekozen = false;
   		}
   		setVisible(false); //of dispose. Niet vergeten om na *elke* knop de dialog te sluiten.
		// alternatieven, waarbij je een popup geeft als er onzin (geen getal) ingevuld wordt, zijn ook ok.
		// Zolang je maar weg kunt uit de dialoog via de "ok"

	}
}
