package MesClass3;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CustomDialog312 extends JDialog {

    JTextArea output;
    JScrollPane scrollPane;
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JButton btnOK = new JButton("GO");
    JButton btnRAZ = new JButton("RAZ");
    GridLayout gridLayout1 = new GridLayout();
    GridLayout GridLayout2 = new GridLayout();
    JLabel labelchiffre = new JLabel("Saisissez un chiffre");
    JTextField inputchiffre = new JTextField("");


    public CustomDialog312(Frame owner, String titre, Boolean modal) {
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

        panel3.add(labelchiffre, null);
        panel3.add(inputchiffre, null);

        panel2.add(btnOK, null);
        panel2.add(btnRAZ, null);

        this.getContentPane().add(panel1, BorderLayout.CENTER);
        this.getContentPane().add(panel3, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);

        btnOK.addActionListener(e -> {

            String temp1;
            StringBuilder temp2;
            String temp4;
            int longueur;
            int temp3;
            int index;
            int compteur = 0;
            int i;

            temp1 = inputchiffre.getText();
            temp3 = Integer.parseInt(temp1);
            index = temp3;
            for (i = 0; i <= index; i++) {
                temp2 = new StringBuilder();
                temp3 = i * i;
                temp4 = Integer.toString(temp3);
                longueur = (temp4.length()) - 1;
                if (longueur < 0) longueur = 0;
                do {
                    temp2.append(temp4.charAt(longueur));
                    longueur -= 1;
                } while ((longueur >= 0));
                if (Objects.equals(temp4, temp2.toString())) {
                    compteur += 1;
                }
            }
            output.append("nombre de palindrome" + compteur + "\n");
        });
        btnRAZ.addActionListener(e -> inputchiffre.setText(""));

    }
}