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

public class GUI_Add_Remove_Room extends JFrame {

    FlowLayout layout = new FlowLayout();
    JPanel energeies = new JPanel();
    JPanel epiloges_prosthikis = new JPanel();
    JPanel epiloges_diagrafis = new JPanel();
    JRadioButton epiloges1 = new JRadioButton("Μονόκλινο με θέα");
    JRadioButton epiloges2 = new JRadioButton("Δίκλινο με θέα");
    JRadioButton epiloges3 = new JRadioButton("Τρίκλινο με θέα");
    JRadioButton epiloges4 = new JRadioButton("Μονόκλινο χωρίς θέα");
    JRadioButton epiloges5 = new JRadioButton("Δίκλινο χωρίς θέα");
    JRadioButton epiloges6 = new JRadioButton("Τρίκλινο χωρίς θέα");
    JButton prosth_Room;
    JButton diagr_Room;

    public GUI_Add_Remove_Room() {

        this.setTitle("ΕΠΙΛΟΓΗ ΕΝΕΡΓΕΙΩΝ");
        this.setSize(500, 200);
        this.setLocation(145, 230);
        this.setLayout(new BorderLayout());
        this.setVisible(true);

        Container pane = getContentPane();
        GridLayout glayout = new GridLayout(2, 1);
        pane.setLayout(glayout);

        energeies.setLayout(layout);
        add(energeies);
        prosth_Room = new JButton("Προσθήκη");
        energeies.add(prosth_Room);
        JLabel mhnyma = new JLabel("(Διπλό κλικ.)");
        energeies.add(mhnyma);
        prosth_Room.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                epiloges_prosthikis.setLayout(layout);
                add(epiloges_prosthikis);
                revalidate();
                epiloges_prosthikis.add(epiloges1);
                epiloges_prosthikis.add(epiloges2);
                epiloges_prosthikis.add(epiloges3);
                epiloges_prosthikis.add(epiloges4);
                epiloges_prosthikis.add(epiloges5);
                epiloges_prosthikis.add(epiloges6);
            }
        });
        diagr_Room = new JButton("Διαγραφή");
        energeies.add(diagr_Room);
        diagr_Room.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                epiloges_diagrafis.setLayout(layout);
                add(epiloges_diagrafis);
                revalidate();
                epiloges_diagrafis.add(epiloges1);
                epiloges_diagrafis.add(epiloges2);
                epiloges_diagrafis.add(epiloges3);
                epiloges_diagrafis.add(epiloges4);
                epiloges_diagrafis.add(epiloges5);
                epiloges_diagrafis.add(epiloges6);
            }
        });
    }
}
