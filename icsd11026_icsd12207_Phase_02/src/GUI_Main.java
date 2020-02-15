/*
 * icsd12207 Ματθαίος Χουλιάρας
 * icsd11026 Κωνσταντίνος Γιακουμιδάκης
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI_Main extends JFrame {

    public static ArrayList<Room> lista_dwmatiwn = new ArrayList<>();
    public static ArrayList<Vehicle> lista_oxhmatwn = new ArrayList<>();
    public static ArrayList<Booking> bookList = new ArrayList<>();

    BorderLayout borderLayout1 = new BorderLayout();
    JPanel menuArxikis1 = new JPanel();
    JButton krathsh_enoik = new JButton("Κράτηση");
    JButton ProsDiag_Dwmatiou = new JButton("Προσθ./Διαγρ. Δωματίου");
    JButton ProsDiag_Oxhmatos = new JButton("Προσθ./Διαγρ. Οχήματος");
    JButton AnazVasei_Hmnias = new JButton("Αναζ. via Ημ/νίας");
    JButton AnazVasei_Onom = new JButton("Αναζ. via Ονόματος");
    JButton diagpel_ID = new JButton("Διαγ. via ID");
    JButton emftypKathl = new JButton("Εμφάνιση τύπου κατειλ.");
    JButton emfplithKathl = new JButton("Εμφάνιση όλων");
    JButton ypolesodownmhna = new JButton("Εισόδημα μηνιαίο");

    public GUI_Main() {
        setTitle("ΠΙΝΑΚΑΣ ΕΛΕΓΧΟΥ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 140);
        setLocation(120, 200);
        setVisible(true);
        add(menuArxikis1);
        menuArxikis1.add(krathsh_enoik);
        krathsh_enoik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            }
        });
        menuArxikis1.add(ProsDiag_Dwmatiou);
        ProsDiag_Dwmatiou.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GUI_Add_Remove_Room a = new GUI_Add_Remove_Room();
            }
        });
        menuArxikis1.add(ProsDiag_Oxhmatos);
        ProsDiag_Oxhmatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GUI_Add_Remove_Vehicle b = new GUI_Add_Remove_Vehicle();
            }
        });
        menuArxikis1.add(AnazVasei_Hmnias);
        AnazVasei_Hmnias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String input = JOptionPane.showInputDialog(null, "Γράψτε ημ/νία προς αναζήτηση.(ΗΗ-ΜΜ-ΧΧΧΧ)",
                        "ΕΠΙΛΟΓΗ ΕΝΕΡΓΕΙΩΝ", JOptionPane.QUESTION_MESSAGE);
                SimpleDateFormat sdfCase6 = new SimpleDateFormat("dd-MM-yyyy");
                Calendar case6Calendar = Calendar.getInstance();
                try {
                    case6Calendar.setTime(sdfCase6.parse(input));
                } catch (ParseException ex) {
                    Logger.getLogger(GUI_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                int sum = 0;
                for (Booking bookList1 : bookList) {
                    if (case6Calendar.compareTo(bookList1.check_in) >= 0 && case6Calendar.compareTo(bookList1.check_out) <= 0) {
                        sum++;
                    }
                }
                JOptionPane.showMessageDialog(null, "Οι κρατήσεις για " + input + " είναι: " + sum);
            }
        });
        menuArxikis1.add(AnazVasei_Onom);
        AnazVasei_Onom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String input = JOptionPane.showInputDialog(null, "Γράψτε όνομα προς αναζήτηση.",
                        "ΕΠΙΛΟΓΗ ΕΝΕΡΓΕΙΩΝ", JOptionPane.QUESTION_MESSAGE);
                int sum = 0;
                for (Booking bookList1 : bookList) {
                    if (bookList1.onomatepwnymo.equalsIgnoreCase(input)) {
                        sum++;
                        break;
                    }
                }
                if (sum > 0) {
                    JOptionPane.showMessageDialog(null, "Η κράτηση " + bookList.get(sum) + " βρέθηκε");
                } else {
                    JOptionPane.showMessageDialog(null, "Η αναζήτηση απέτυχε.");
                }
            }
        });
        menuArxikis1.add(diagpel_ID);
        diagpel_ID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String input = JOptionPane.showInputDialog(null, "Γράψτε ID προς αναζήτηση και διαγραφή.",
                        "ΕΠΙΛΟΓΗ ΕΝΕΡΓΕΙΩΝ", JOptionPane.QUESTION_MESSAGE);
                for (int i = 0; i < bookList.size(); i++) {
                    if (bookList.get(i).id_krathshs == Integer.parseInt(input)) {
                        bookList.remove(i);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Η διαδικασία ολοκληρώθηκε.");
            }
        });
        menuArxikis1.add(emftypKathl);
        emftypKathl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int c1 = 0,
                        c2 = 0;
                for (Room lista_dwmatiwn1 : lista_dwmatiwn) {
                    if (lista_dwmatiwn1.diathesimothta == false) {
                        if (lista_dwmatiwn1.type.equalsIgnoreCase("Luxury")) {
                            c2++;
                        } else {
                            c1++;
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Απλά Δωμάτια: " + c1 + "\nΠολυτελή Δωμάτια: " + c2);
            }
        });
        menuArxikis1.add(emfplithKathl);
        emfplithKathl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int c = 0;
                for (Room lista_dwmatiwn1 : lista_dwmatiwn) {
                    if (lista_dwmatiwn1.diathesimothta == false) {
                        c++;
                    }
                }
                JOptionPane.showMessageDialog(null,c + " δωμάτια είναι κατηλειμμένα");
            }
        });
        menuArxikis1.add(ypolesodownmhna);
        ypolesodownmhna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            }
        });
    }

    public static void main(String[] args) {
        Room dwmatio = new Venue_Room();
        lista_dwmatiwn.add(dwmatio);
        Room dwmatio1 = new Luxury_Room(true);
        lista_dwmatiwn.add(dwmatio1);
        Room dwmatio2 = new Luxury_Room(false);
        lista_dwmatiwn.add(dwmatio2);
        Room dwmatio3 = new Simple_Room(1, true);
        lista_dwmatiwn.add(dwmatio3);
        Room dwmatio4 = new Simple_Room(1, false);
        lista_dwmatiwn.add(dwmatio4);
        Room dwmatio5 = new Simple_Room(2, true);
        lista_dwmatiwn.add(dwmatio5);
        Room dwmatio6 = new Simple_Room(2, false);
        lista_dwmatiwn.add(dwmatio6);
        Room dwmatio7 = new Simple_Room(3, true);
        lista_dwmatiwn.add(dwmatio7);
        Room dwmatio8 = new Simple_Room(3, false);
        lista_dwmatiwn.add(dwmatio8);

        Vehicle oxhma1 = new FourWheel(1);
        lista_oxhmatwn.add(oxhma1);
        Vehicle oxhma2 = new FourWheel(2);
        lista_oxhmatwn.add(oxhma2);
        Vehicle oxhma3 = new TwoWheel();
        lista_oxhmatwn.add(oxhma3);

        GUI_Main gui_Main = new GUI_Main();
    }
}
