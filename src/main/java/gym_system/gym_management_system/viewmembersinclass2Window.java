package gym_system.gym_management_system;

import Gym_Components.Gym_Class;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class viewmembersinclass2Window extends JFrame {
    private JTextField txt_name;
    private JTextPane textPane1;
    private JButton btn_search;
    private JPanel viewmembersinclass2Panel;
    private JLabel lbl_viewmemberinclass;
    public JButton backToMenuButton;

    private void updateTextPane(final String text) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Document doc = textPane1.getDocument();
                try {
                    doc.insertString(doc.getLength(), text, null);
                } catch (BadLocationException e) {
                    throw new RuntimeException(e);
                }
                textPane1.setCaretPosition(doc.getLength() - 1);
            }
        });
    }

    private void redirectSystemStreams() {
        OutputStream out = new OutputStream() {
            @Override
            public void write(final int b) throws IOException {
                updateTextPane(String.valueOf((char) b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                updateTextPane(new String(b, off, len));
            }

            @Override
            public void write(byte[] b) throws IOException {
                write(b, 0, b.length);
            }
        };

        System.setOut(new PrintStream(out, true));
        System.setErr(new PrintStream(out, true));
    }

    GymSystem Gym_Managment_System = new GymSystem();


    viewmembersinclass2Window() {

        setContentPane(viewmembersinclass2Panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 420);
        setTitle("View Members in a Class");
        setVisible(true);


        btn_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String specific_class= txt_name.getText().toUpperCase(Locale.ROOT);
                Gym_Class assigned_class=Gym_Managment_System.admin1.findClass(specific_class);
                if (assigned_class==null) {
                    lbl_viewmemberinclass.setText("No such class found ! Please try again !");
                    lbl_viewmemberinclass.setForeground(new Color(255, 0, 0));
                }
                else {
                    lbl_viewmemberinclass.setText("");
                    textPane1.setText("");
                    redirectSystemStreams();

                    System.out.println("\n-----------------------------------------------" +
                            "-----------------------------------------------\n");

                    System.out.format("%47s\n", "Class name: " + assigned_class.getType());
                    System.out.format("%47s\n", "Class description: " + assigned_class.getDescription());
                    if (!assigned_class.getClass_members().isEmpty()) {
                        System.out.format("%16s\t%24s\t%6s\t%11s\n",
                                "Name",
                                "National ID",
                                "Gender" ,
                                "Phone_Number"
                        );
                        for (int i = 0; i < assigned_class.getClass_members().size(); i++) {
                            System.out.format("%16s%24s\t%6s\t%11s\n",
                                    assigned_class.getClass_members().get(i).get_name(),
                                    assigned_class.getClass_members().get(i).get_national_id(),
                                    assigned_class.getClass_members().get(i).get_gender(),
                                    assigned_class.getClass_members().get(i).getPhone_number());
                            //membership //specific_class.getClass_members().get(i).get_name(),
                        }
                    }else {
                        System.out.format("%47s\n", "There are no members currently in this class");
                    }
                    System.out.println("\n-----------------------------------------------" +
                            "-----------------------------------------------\n");

                }
            }
        });



        backToMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                employeemanagmentWindow employeemanagmentwindow = new employeemanagmentWindow();
            }
        });
    }
}