package MesClass1;

import javax.swing.*;
import java.awt.*;

public class CustomDialog110 extends JDialog {

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JLabel labelA = new JLabel();
    JLabel labela = new JLabel();
    JButton btnOK = new JButton();
    GridLayout gridLayout1 = new GridLayout();

    public CustomDialog110(Frame owner,String titre,Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 200);

        btnOK.setText("TEST");
        jPanel2.setLayout(gridLayout1);
        gridLayout1.setRows(1);
        gridLayout1.setColumns(1);
        gridLayout1.setVgap(5);
        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        labelA.setHorizontalAlignment(SwingConstants.LEFT);
        labelA.setText("caractere A =");
        labelA.setBounds(new Rectangle(0, 25, 300, 17));
        labela.setHorizontalAlignment(SwingConstants.LEFT);
        labela.setText("caractere a =");
        labela.setBounds(new Rectangle(0, 75, 300, 17));
        jPanel1.add(labelA, null);
        jPanel1.add(labela, null);
        jPanel2.add(btnOK, null);

        this.getContentPane().add(jPanel2,  BorderLayout.SOUTH);
        this.getContentPane().add(jPanel1,  BorderLayout.CENTER);

        btnOK.addActionListener(e -> {
            int chA = 'A';
            int cha = 'a';
            String strA = "A";
            int asciiA = 0, asciia = 0;
            labelA.setText("caractere = A code ASCII : " + chA +
                    " code hexadecimal : " + Integer.toHexString(65));
            labela.setText("caractere = a code ASCII : " + cha +
                    " code hexadecimal : " + Integer.toHexString(97));
        });
    }
}