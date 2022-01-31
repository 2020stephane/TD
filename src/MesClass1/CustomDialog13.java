package MesClass1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CustomDialog13 extends JDialog {

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JLabel valeur1 = new JLabel();
    JLabel valeur2 = new JLabel();
    JButton btnOK = new JButton();
    JButton btnRAZ = new JButton();
    GridLayout gridLayout1 = new GridLayout();

    public CustomDialog13(Frame owner, String titre, Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 200);

        jTextField1.setText("");
        jTextField1.setBounds(new Rectangle(101, 24, 92, 21));
        jTextField2.setText("");
        jTextField2.setBounds(new Rectangle(101, 57, 92, 21));
        btnOK.setText("ECHANGE");
        btnRAZ.setText("RAZ");

        jPanel2.setLayout(gridLayout1);
        gridLayout1.setRows(4);
        gridLayout1.setColumns(1);
        gridLayout1.setVgap(15);
        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        valeur1.setHorizontalAlignment(SwingConstants.RIGHT);
        valeur1.setText("valeur 1");
        valeur1.setBounds(new Rectangle(18, 24, 75, 17));
        valeur2.setHorizontalAlignment(SwingConstants.RIGHT);
        valeur2.setText("valeur 2");
        valeur2.setBounds(new Rectangle(18, 56, 75, 17));

        jPanel1.add(valeur1, null);
        jPanel1.add(jTextField1, null);
        jPanel1.add(valeur2, null);
        jPanel1.add(jTextField2, null);

        jPanel2.add(btnOK, null);
        jPanel2.add(btnRAZ, null);

        this.getContentPane().add(jPanel2, BorderLayout.EAST);
        this.getContentPane().add(jPanel1, BorderLayout.CENTER);

        btnOK.addActionListener(e -> {
            String temp = jTextField1.getText();
            jTextField1.setText(jTextField2.getText());
            jTextField2.setText(temp);
        });

        btnRAZ.addActionListener(e -> {
            jTextField1.setText("");
            jTextField2.setText("");
        });
    }
}
