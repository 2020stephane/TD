package MesClass3;

import javax.swing.*;
import java.awt.*;

public class CustomDialog36 extends JDialog {

    JLabel labelmontant = new JLabel("Entrer le montant :");
    JTextField inputmontant = new JTextField("");
    JLabel resultat = new JLabel("");

    JPanel panel1 = new JPanel(new BorderLayout());
    JPanel panel2 = new JPanel(new BorderLayout());

    GridLayout gridLayout = new GridLayout();

    JButton btnOK = new JButton("GO");
    JButton btnRAZ = new JButton("RAZ");

    public CustomDialog36(Frame owner, String titre, Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 250);

        panel1.setLayout(null);
        panel2.setLayout(gridLayout);
        gridLayout.setRows(1);
        gridLayout.setColumns(2);
        gridLayout.setVgap(15);

        labelmontant.setBounds(10, 25, 150, 25);
        inputmontant.setBounds(160, 25, 50, 25);
        resultat.setBounds(25, 100, 150, 25);

        panel1.setBorder(BorderFactory.createEtchedBorder());
        panel2.setBorder(BorderFactory.createEtchedBorder());
        panel1.add(labelmontant);
        panel1.add(inputmontant);
        panel1.add(resultat);
        panel2.add(btnOK);
        panel2.add(btnRAZ);

        this.getContentPane().add(panel1, BorderLayout.CENTER);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);

        btnOK.addActionListener(e -> {

            double temp1 = 0;
            double temp2 = 0;
            int annee = 0;

            temp1 = Double.parseDouble(inputmontant.getText());
            temp2 = temp1 * 2;
            while (temp1 < temp2) {
                temp1 = temp1 + (temp1 * 0.2);
                annee = annee + 1;
            }
            resultat.setText("il faut " + annee + " ans.");

        });
        btnRAZ.addActionListener(e -> {
            resultat.setText("");
            inputmontant.setText("");
        });

    }
}