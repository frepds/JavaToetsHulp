package ToetsHulp.Praktijk.Juni10_2021.Antwoorden;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HorecaGui extends JFrame implements ActionListener {

    private JButton nieuweReserveringButton; // buttons als attribuut zodat we ze in actionPerformed kunnen herkennen.
    private JTextField textfield1_naam;
    private JTextField textfield2_adres;
    private JTextField textfield3_aantal;
    private JButton wijzigReserveringButton;
    private JButton tafelVrijButton;
    private Kroeg horeca;


    public HorecaGui() {
        this.horeca = new Kroeg();
        this.setTitle("Voornaam Achternaam, s7777777");

        // layout
        this.setLayout(new FlowLayout());

        add(new JLabel("naam: "));
        textfield1_naam = new JTextField(5);
        add(textfield1_naam);

        add(new JLabel("adres: "));
        textfield2_adres = new JTextField(5);
        add(textfield2_adres);

        add(new JLabel("aantal: "));
        textfield3_aantal = new JTextField(5);
        add(textfield3_aantal);

        nieuweReserveringButton = new JButton("toevoegen");
        nieuweReserveringButton.setBackground(Color.green);
        add(nieuweReserveringButton);
        nieuweReserveringButton.addActionListener(this);
        tafelVrijButton = new JButton("doorstroom");
        tafelVrijButton.addActionListener(this);
        add(tafelVrijButton);
        wijzigReserveringButton = new JButton("weggaan");
        wijzigReserveringButton.addActionListener(this);
        add(wijzigReserveringButton);

        //add(new TekenPanel(this));

        setMinimumSize(new Dimension(1200, 600)); // of een andere geschikte afmeting. Hangt van je besturingsysteem af.

        setMinimumSize(new Dimension(650 - 1, 350 - 1));
        setSize(650, 350);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == wijzigReserveringButton) {
            // hier een nieuwe dialoog starten
            WijzigDialoog dialog = new WijzigDialoog(this);
            if (dialog.getIsOkGekozen()) {
                // input verwerken
                String naam = dialog.getNaamUitTekstveld0();
                String aantalTxt = dialog.getAantalUitTekstveld1();
                try {
                    int aantal = Integer.parseInt(aantalTxt);
                    horeca.weggaan(naam, aantal);
                } catch (NumberFormatException nfe) {
                    System.out.println("oeps...! ");
                    // hier ook iets aanpassen, todo. Label van kleur veranderen ofzo? NIET weer de titel
                }
            } else {
                // blijkbaar gecancelled of via kruisje afgesloten.
            }

        } else if (e.getSource() == nieuweReserveringButton) {
            try {
                String naam = this.textfield1_naam.getText();
                String adres = this.textfield2_adres.getText();
                int aantal = Integer.parseInt(this.textfield3_aantal.getText());
                boolean succes = horeca.toevoegen(naam, adres, aantal);
                if (succes) {
                    nieuweReserveringButton.setBackground(Color.green);
                } else {
                    nieuweReserveringButton.setBackground(Color.orange);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("oeps...! ");
                nieuweReserveringButton.setBackground(Color.red);
                // hier ook iets aanpassen, todo. Label van kleur veranderen ofzo? NIET weer de titel
            }
        } else if (e.getSource() == tafelVrijButton) {
            horeca.doorstroom();
        }
        horeca.bekijk();
        // en zorgen dat alles opnieuw getekend wordt
        repaint();
    }


    public void _TEKENMIJ(Graphics g, int width, int height) {
        horeca._TEKENMIJ(g, width, height);
    }
}
