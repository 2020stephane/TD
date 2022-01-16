package MainClass4;

import javax.swing.*;
import java.awt.*;

public class CustomDialog46 extends JDialog {

    JTextArea output;
    JScrollPane scrollPane;
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JButton btnOK = new JButton("GO");
    JButton btnRAZ = new JButton("RAZ");
    GridLayout gridLayout1 = new GridLayout();
    GridLayout GridLayout2 = new GridLayout();
    JLabel labelvaleur1 = new JLabel("valeur1");
    JTextField input1 = new JTextField("");
    JLabel labelvaleur2 = new JLabel("valeur2");
    JTextField input2 = new JTextField("");
    JLabel labelvaleur3 = new JLabel("valeur3");
    JTextField input3 = new JTextField("");
    JLabel labelvaleur4 = new JLabel("valeur4");
    JTextField input4 = new JTextField("");
    JLabel labelvaleur5 = new JLabel("valeur5");
    JTextField input5 = new JTextField("");


    public CustomDialog46(Frame owner, String titre, Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 500, 350);

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

        panel3.add(labelvaleur1, null);
        panel3.add(input1, null);
        panel3.add(labelvaleur2, null);
        panel3.add(input2, null);
        panel3.add(labelvaleur3, null);
        panel3.add(input3, null);
        panel3.add(labelvaleur4, null);
        panel3.add(input4, null);
        panel3.add(labelvaleur5, null);
        panel3.add(input5, null);


        panel2.add(btnOK, null);
        panel2.add(btnRAZ, null);

        this.getContentPane().add(panel1, BorderLayout.CENTER);
        this.getContentPane().add(panel3, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);

        btnOK.addActionListener(e -> {

            int tableau[] = new int[5];
            int i, j, index;

            tableau[0] = Integer.parseInt(input1.getText());
            tableau[1] = Integer.parseInt(input2.getText());
            tableau[2] = Integer.parseInt(input3.getText());
            tableau[3] = Integer.parseInt(input4.getText());
            tableau[4] = Integer.parseInt(input5.getText());

            output.append("\n");

            for (i=0; i<5; i++) {
                index = i;
                for (j=i; j<5; j++) {
                    if (tableau[index] > tableau[j]) {
                        index = j;
                    }
                }
                int min =tableau[index];
                tableau[index] = tableau[i];
                tableau[i] = min;
            }
            for  (i=0; i<5; i++) {
                output.append("tableau[" + i + "]=" + tableau[i] + "\n" + "\n");
            }
       });
        btnRAZ.addActionListener(e -> {
            input1.setText("");
            input2.setText("");
            input3.setText("");
            input4.setText("");
            input5.setText("");
         });

    }
}