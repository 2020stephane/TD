package MesClass3;

import javax.swing.*;
import java.awt.*;

public class CustomDialog311 extends JDialog {

    JTextArea output;
    JScrollPane scrollPane;
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JButton btnOK = new JButton("GO");
    JButton btnRAZ = new JButton("RAZ");
    GridLayout gridLayout1 = new GridLayout();
    GridLayout GridLayout2 = new GridLayout();
    JLabel labelmot = new JLabel("Saisissez un mot");
    JTextField inputmot = new JTextField("");


    public CustomDialog311(Frame owner, String titre, Boolean modal) {
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

        panel3.add(labelmot, null);
        panel3.add(inputmot, null);

        panel2.add(btnOK, null);
        panel2.add(btnRAZ, null);

        this.getContentPane().add(panel1, BorderLayout.CENTER);
        this.getContentPane().add(panel3, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);

        btnOK.addActionListener(e -> {

            String temp1 = "";
            String temp2 = "";
            int longueur = 0;

            temp1 = inputmot.getText();
            longueur = (temp1.length()) - 1;
            output.append("\n" + "palindrome de " + temp1 + " est " + "\n");
            do {
                temp2 = temp2 + temp1.charAt(longueur);
                longueur -= 1;
            } while ((longueur != 0));
            output.append(" " + temp2 + "\n");
            if (temp1.equals(temp2)) {
                output.append("c'est un palindrome" + "\n");
            } else output.append("c'est pas un palindrome" + "\n");

        });
        btnRAZ.addActionListener(e -> {
            inputmot.setText("");
        });

    }
}