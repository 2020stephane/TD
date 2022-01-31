package MainClass4;

import javax.swing.*;
import java.awt.*;

public class CustomDialog43 extends JDialog {

    JTextArea output;
    JScrollPane scrollPane;
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JButton btnOK = new JButton("GO");
    JButton btnRAZ = new JButton("RAZ");
    GridLayout gridLayout1 = new GridLayout();
    GridLayout GridLayout2 = new GridLayout();
    JLabel labeltexte = new JLabel("Saisissez votre texte");
    JTextField inputtexte = new JTextField("");


    public CustomDialog43(Frame owner, String titre, Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 350);

        panel1.setLayout(new BorderLayout());
        panel2.setLayout(gridLayout1);
        panel3.setLayout(GridLayout2);
        gridLayout1.setRows(1);
        gridLayout1.setColumns(2);
        gridLayout1.setHgap(15);
        GridLayout2.setRows(1);
        GridLayout2.setColumns(2);
        GridLayout2.setHgap(0);
        GridLayout2.setVgap(5);

        panel2.setBorder(BorderFactory.createEtchedBorder());
        panel1.setBorder(BorderFactory.createEtchedBorder());
        panel3.setBorder(BorderFactory.createEtchedBorder());

        output = new JTextArea(15, 20);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);
        panel1.add(scrollPane, BorderLayout.NORTH);

        panel3.add(labeltexte, null);
        panel3.add(inputtexte, null);

        panel2.add(btnOK, null);
        panel2.add(btnRAZ, null);

        this.getContentPane().add(panel1, BorderLayout.CENTER);
        this.getContentPane().add(panel3, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);

        btnOK.addActionListener(e -> {

            String inputlettre = inputtexte.getText();
            String newchaine = "";
            int tailletexte = inputlettre.length();
            int i;

            for (i = 0; i < tailletexte; i++) {
                if (inputlettre.charAt(i) != 'e') {
                    newchaine = newchaine + inputlettre.charAt(i);
                }
            }
            output.append("le texte sans le e est " + newchaine + "\n");
        });
        btnRAZ.addActionListener(e -> {
            inputtexte.setText("");
        });

    }
}