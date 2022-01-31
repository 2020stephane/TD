package MesClass2;

import javax.swing.*;
import java.awt.*;

public class CustomDialog21 extends JDialog {

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JTextField InputN = new JTextField();
    JLabel labelN = new JLabel();
    JLabel labelR = new JLabel();
    JButton btnOK = new JButton();
    JButton btnRAZ = new JButton();
    GridLayout gridLayout1 = new GridLayout();

    public CustomDialog21(Frame owner, String titre, Boolean modal) {

        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 200);

        labelN.setText("Saisir un nombre");
        labelN.setBounds(new Rectangle(20, 20, 100, 21));
        labelR.setText(" ");
        labelR.setBounds(new Rectangle(20, 60, 150, 21));
        InputN.setText("");
        InputN.setBounds(new Rectangle(150, 20, 100, 21));
        btnOK.setText("TEST");
        btnRAZ.setText("RAZ");
        jPanel2.setLayout(gridLayout1);
        gridLayout1.setRows(4);
        gridLayout1.setColumns(1);
        gridLayout1.setVgap(15);
        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        jPanel1.add(labelR, null);
        jPanel1.add(labelN, null);
        jPanel1.add(InputN, null);
        jPanel2.add(btnOK, null);
        jPanel2.add(btnRAZ, null);

        this.getContentPane().add(jPanel2, BorderLayout.EAST);
        this.getContentPane().add(jPanel1, BorderLayout.CENTER);
        btnOK.addActionListener(e -> {
            int total;
            String temp = InputN.getText();
            total = Integer.parseInt(temp);
            if ((total % 2) == 0) {
                labelR.setText("le nombre est pair");
            } else labelR.setText("le nombre est impair");
        });

        btnRAZ.addActionListener(e -> {
            InputN.setText("");
            labelR.setText("");
        });
    }

}
