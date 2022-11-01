import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WaterBestelDialoog extends JDialog implements ActionListener
{
	private JTextField formaatTextfield;
	private JTextField aantalTextfield;
	private JButton okButton;
	private JButton cancelButton;
	private boolean isOk;

	public WaterBestelDialoog(JFrame frame) {
		super(frame, true);
		setTitle("Water bestellen");

		setSize(400, 100);
		setLayout(new FlowLayout());

		// maak componenten aan
		add(new JLabel("formaat:"));
		formaatTextfield = new JTextField(5);
		add(formaatTextfield);

		add(new JLabel("aantal:"));
		aantalTextfield = new JTextField(4);
		add(aantalTextfield);

		okButton = new JButton("OK");
		okButton.addActionListener(this);
		add(okButton);

		cancelButton = new JButton("cancel");
		cancelButton.addActionListener(this);
		add(cancelButton);

		setVisible(true);
	}
	//actionperformed handelt alle knoppen af
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == okButton) {
			isOk = true;
		} else {
			isOk = false;
		}
		setVisible(false);
	}

	public boolean getIsOk() { return isOk; }

	public String getAantal() { return aantalTextfield.getText(); }

	public String getFormaat() { return formaatTextfield.getText(); }
}
