/*
 * icsd12207 Ματθαίος Χουλιάρας
 * icsd11026 Κωνσταντίνος Γιακουμιδάκης
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUI_Add_Remove_Vehicle extends JFrame {

    FlowLayout layout = new FlowLayout();
    JPanel energeies = new JPanel();
    JPanel epiloges_prosthikis = new JPanel();
    JPanel epiloges_diagrafis = new JPanel();
    JRadioButton epiloges1 = new JRadioButton("Αυτοκίνητο");;
    JRadioButton epiloges2 = new JRadioButton("Γουρούνα");;
    JRadioButton epiloges3 = new JRadioButton("Σκούτερ");;
    JButton prosth_Vehicle;
    JButton diagr_Vehicle;

    public GUI_Add_Remove_Vehicle() {

        this.setTitle("ΕΠΙΛΟΓΗ ΕΝΕΡΓΕΙΩΝ");
        this.setSize(500, 220);
        this.setLocation(145, 230);
        this.setLayout(new BorderLayout());
        this.setVisible(true);

        Container pane = getContentPane();
        GridLayout glayout = new GridLayout(2, 1);
        pane.setLayout(glayout);

        energeies.setLayout(layout);

        add(energeies);
        prosth_Vehicle = new JButton("Προσθήκη");
        energeies.add(prosth_Vehicle);
        JLabel mhnyma = new JLabel("(Διπλό κλικ.)");
        energeies.add(mhnyma);
        prosth_Vehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                epiloges_prosthikis.setLayout(layout);
                add(epiloges_prosthikis);
                revalidate();
                epiloges_prosthikis.add(epiloges1);
                epiloges_prosthikis.add(epiloges2);
                epiloges_prosthikis.add(epiloges3);
            }
        });
        diagr_Vehicle = new JButton("Διαγραφή");
        energeies.add(diagr_Vehicle);
        diagr_Vehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                epiloges_diagrafis.setLayout(layout);
                add(epiloges_diagrafis);
                revalidate();
                epiloges_diagrafis.add(epiloges1);
                epiloges_diagrafis.add(epiloges2);
                epiloges_diagrafis.add(epiloges3);
            }
        });
    }
}
