//package ToetsHulp.Praktijk.Gui;
//
//import ToetsHulp.Praktijk.Juni10.Antwoorden.HorecaGui;
//
//import javax.swing.*;
//import java.awt.*;
//
//
//public class TekenPanel extends JPanel {
//    private JFRAME gui;
//
//    public TekenPanel(HorecaGui gui) {
//        // hier ervoor gekozen om de jframe aan de panel mee te geven. We hadden ook de Horeca zelf mee kunnen geven. Zolang we maar een link hebben (evt indirect) naar de horeca die we willen tekenen.
//        this.gui = gui;
//        setPreferredSize(new Dimension(610, 275));
//        setBackground(Color.black); //of iets anders wat mooi staat.
//    }
//
//    public void paintComponent(Graphics g) {
//        //let op: niet paintComponents(...) met een s aan het eind. Dat bestaat ook maar is iets heel anders.
//        // nooit vergeten! Dat kan leiden tot raar gedrag van de window.
//        super.paintComponent(g);
//
//        // we laten in deze uitwekring de klas zichzelf tekenen (maar tekenen had ook hier in de tekenpanel gekund).
//        gui._TEKENMIJ(g, this.getWidth(), this.getHeight());
//    }
//}
