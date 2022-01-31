package MainClass4;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class CustomDialog411 extends JDialog {

    JTextArea output;
    JScrollPane scrollPane;
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JButton btnOK = new JButton("GO");
    JButton btnRAZ = new JButton("INIT");
    JButton btnsuiv = new JButton("SUIVANT");

    GridLayout gridLayout1 = new GridLayout();
    GridLayout GridLayout2 = new GridLayout();
    JLabel labelvaleur1 = new JLabel("Taille du tableau");
    JTextField tailletableau = new JTextField("");
    JLabel labelvaleur2 = new JLabel("valeur ");
    JTextField inputval = new JTextField("");

    int[][] tab = {{0, 2, 4, 6, 8}, {1, 3, 5, 7, 9}};
    int index = 0;
    int taille;


    public CustomDialog411(Frame owner, String titre, Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 500, 350);

        panel1.setLayout(new BorderLayout());
        panel2.setLayout(gridLayout1);
        panel3.setLayout(GridLayout2);
        gridLayout1.setRows(1);
        gridLayout1.setColumns(3);
        gridLayout1.setHgap(15);
        GridLayout2.setRows(2);
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

        panel3.add(labelvaleur1, null);
        panel3.add(tailletableau, null);
        panel3.add(labelvaleur2, null);
        panel3.add(inputval, null);

        panel2.add(btnOK, null);
        panel2.add(btnRAZ, null);
        panel2.add(btnsuiv, null);

        this.getContentPane().add(panel1, BorderLayout.CENTER);
        this.getContentPane().add(panel3, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);

        btnsuiv.addActionListener(e -> {


            for (int i = 0; i < taille; i++) {
                output.append(tab[0][i] + "");
            }
            output.append("tab[" + index + "/" + "]=" + tab[index] + "\n");
            labelvaleur2.setText("valeur " + (index + 2));
            index = index + 1;
            inputval.setText("");
        });

        btnOK.addActionListener(e -> {

            for (int i = 0; i < 5; i++) {
                output.append(tab[0][i] + "");
            }
            output.append("\n");
            for (int i = 0; i < 5; i++) {
                output.append(tab[1][i] + "");
            }


        });
        btnRAZ.addActionListener(e -> {

            String temp;

            temp = tailletableau.getText();
            taille = Integer.parseInt(temp);
            labelvaleur2.setText("valeur 1");
            output.append("taille du tableau = " + taille + "\n");
        });

    }
}