package MesClass2;

import javax.swing.*;
import java.awt.*;

public class CustomDialog23 extends JDialog {

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JTextField Inputa = new JTextField();
    JLabel labela = new JLabel();
    JLabel labelb = new JLabel();
    JLabel labelr = new JLabel();
    JButton btnOK = new JButton();
    JButton btnRAZ = new JButton();
    GridLayout gridLayout1 = new GridLayout();

    public CustomDialog23(Frame owner, String titre, Boolean modal) {

        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 200);

        labela.setText("Montant avant remise");
        labela.setBounds(new Rectangle(20, 20, 150, 21));
        labelb.setText("remise =");
        labelb.setBounds(new Rectangle(20, 60, 150, 21));
        Inputa.setText("");
        Inputa.setBounds(new Rectangle(150, 20, 100, 21));
        labelr.setText("Montant apres remise");
        labelr.setBounds(new Rectangle(20, 100, 200, 21));
        btnOK.setText("GO");
        btnRAZ.setText("RAZ");

        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        jPanel1.add(labela, null);
        jPanel1.add(labelb, null);
        jPanel1.add(labelr, null);
        jPanel1.add(Inputa, null);
        jPanel2.add(btnOK, null);
        jPanel2.add(btnRAZ, null);

        jPanel2.setLayout(gridLayout1);
        gridLayout1.setRows(4);
        gridLayout1.setColumns(1);
        gridLayout1.setVgap(15);

        this.getContentPane().add(jPanel2,  BorderLayout.EAST);
        this.getContentPane().add(jPanel1,  BorderLayout.CENTER);

        btnOK.addActionListener(e -> {
            double da, total;
            String temp = Inputa.getText();
            da = Double.parseDouble(temp);
            if (da>100 && da<500){
                total = da - (da * 0.05);
                labelb.setText("remise = 5%");
                temp = Double.toString(total);
                labelr.setText("Montant apres remise = " + temp);
            }
            if (da>500){
                total = da - (da * 0.08);
                labelb.setText("remise = 8%");
                temp = Double.toString(total);
                labelr.setText("Montant apres remise = " + temp);
            }
            if (da<100) {
                total = da;
                labelb.setText("pas de remise");
                temp = Double.toString(total);
                labelr.setText("Montant = " + temp);
            }
        });

        btnRAZ.addActionListener(e -> {
            Inputa.setText("");
            labelb.setText("remise =");
            labelr.setText("Montant apres remise");
        });
    }
}
