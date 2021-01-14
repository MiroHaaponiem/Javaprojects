/*************************************
Tekijä: Miro Haapaniemi
Jakson numero: 6
Jakson tehtävänumero: 6.1
Päiväys: 24.11.2020
*************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ikkuna extends JFrame {
    
    // Ulkoasun tekeminen
    private FlowLayout flowLayout = new FlowLayout();
    private Container contentPane=this.getContentPane();
    
    // Dialogin tekeminen
    private JOptionPane dialog=new JOptionPane();

    // Nappulan tekeminen
    private JButton nappi=new JButton("Avaa Dialogi");

    public Ikkuna() {

        contentPane.setLayout(flowLayout);
        contentPane.add(nappi_1);
		nappi_1.addActionListener(new AvaaDialogi());
		this.setSize(400,300);
		this.setTitle("Ikkuna");
    }
    
}

class AvaaDialogi implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        dialog.showInputDialog(this,"Syötä hakusana");
    }
}

