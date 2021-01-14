/*************************************
Tekijä: Miro Haapaniemi
Jakson numero: 6
Jakson tehtävänumero: 6.2
Päiväys: 19.11.2020
*************************************/

import java.awt.*;
import javax.swing.*;

public class Ikkuna extends JFrame{

    JMenuBar valikko;
    JMenu tiedosto_valikko;
    JMenuItem item1, item2;

    public Ikkuna() {

        //valikkorivin tekeminen

        valikko=new JMenuBar();

        //Tiedosto-valikon tekeminen

        tiedosto_valikko=new JMenu("Tiedosto");

        //valikkokohtien tekeminen 

        item1=new JMenuItem("Avaa");
        item2=new JMenuItem("Lopeta");

        //Ohjelman lopettaminen

        item2.addActionListener(new LopetaOhjelma());

        //valikon muodostaminen

        tiedosto_valikko.add(item1);
        tiedosto_valikko.add(item2);
        valikko.add(tiedosto_valikko);

        //valikko ikkunaan

        this.setJMenuBar(valikko);

        //ikkunan koko

        this.setSize(400,300);
        this.setTitle("Ikkuna");
    }
}

class LopetaOhjelma implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}
