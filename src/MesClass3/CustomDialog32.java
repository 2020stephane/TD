package MesClass3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomDialog32 extends JDialog {

    JLabel label1 = new JLabel("Entrer n");
    JTextField input1 = new JTextField("");
    JLabel labels = new JLabel("somme =");
    JTextField resultat = new JTextField("");
    JPanel jpanel1 = new JPanel();
    JPanel jpanel2 = new JPanel();
    JButton btnOK = new JButton("CALCUL");
    JButton btnRAZ = new JButton("RAZ");
    GridLayout gridLayout1 = new GridLayout();

    public CustomDialog32(Frame owner, String titre, Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 250);

        jpanel2.setLayout(gridLayout1);
        gridLayout1.setRows(1);
        gridLayout1.setColumns(2);
        gridLayout1.setHgap(25);
        jpanel2.setBorder(BorderFactory.createEtchedBorder());
        jpanel1.setBorder(BorderFactory.createEtchedBorder());
        jpanel1.setLayout(null);
        resultat.setEditable(false);

        label1.setBounds(0, 25, 100, 25);
        input1.setBounds(100, 25, 100, 25);
        labels.setBounds(0, 120, 100, 25);
        resultat.setBounds(100, 120, 100, 25);
        resultat.setEditable(false);

        jpanel1.add(label1, null);
        jpanel1.add(labels, null);
        jpanel1.add(input1, null);
        jpanel1.add(resultat, null);
        jpanel2.add(btnOK, null);
        jpanel2.add(btnRAZ, null);

        this.getContentPane().add(jpanel1, BorderLayout.CENTER);
        this.getContentPane().add(jpanel2, BorderLayout.SOUTH);

        btnOK.addActionListener(e -> {

            int temp1, i;
            double temp2 = 0;

            temp1 = Integer.parseInt(input1.getText());
            for (i = 1; i <= temp1; i++) {
                temp2 = temp2 + Math.pow(i, 2);
            }
            resultat.setText(Double.toString(temp2));
        });
        btnRAZ.addActionListener(e -> {
            resultat.setText("");
            input1.setText("");
        });
    }
}