package MesClass1;

import javax.swing.*;
import java.awt.*;

public class CustomDialog16 extends JDialog {

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JTextField Theure = new JTextField();
    JTextField Tminute = new JTextField();
    JTextField Tseconde = new JTextField();
    JTextField Inputs = new JTextField();
    JLabel labelH = new JLabel();
    JLabel labelM = new JLabel();
    JLabel labelS = new JLabel();
    JLabel resultat = new JLabel();
    JButton btnOK = new JButton();
    JButton btnRAZ = new JButton();
    GridLayout gridLayout1 = new GridLayout();

    public CustomDialog16(Frame owner, String titre, Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 200);

        Theure.setEditable(false);
        Theure.setText("");
        Theure.setBounds(new Rectangle(60, 60, 50, 21));
        Tminute.setEditable(false);
        Tminute.setText("");
        Tminute.setBounds(new Rectangle(60, 90, 50, 21));
        Tseconde.setEditable(false);
        Tseconde.setText("");
        Tseconde.setBounds(new Rectangle(60, 120, 50, 21));
        Inputs.setText("");
        Inputs.setBounds(new Rectangle(150, 25, 50, 21));
        btnOK.setText("CONVERTIR");
        btnRAZ.setText("RAZ");

        jPanel2.setLayout(gridLayout1);
        gridLayout1.setRows(4);
        gridLayout1.setColumns(1);
        gridLayout1.setVgap(15);
        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        labelH.setHorizontalAlignment(SwingConstants.RIGHT);
        labelH.setText("Heure");
        labelH.setBounds(new Rectangle(0, 60, 50, 17));
        labelM.setHorizontalAlignment(SwingConstants.RIGHT);
        labelM.setText("Minute");
        labelM.setBounds(new Rectangle(0, 90, 50, 17));
        labelS.setHorizontalAlignment(SwingConstants.RIGHT);
        labelS.setText("Seconde");
        labelS.setBounds(new Rectangle(0, 120, 50, 17));
        resultat.setHorizontalAlignment(SwingConstants.RIGHT);
        resultat.setText("Seconde");
        resultat.setBounds(new Rectangle(90, 25, 50, 17));

        jPanel1.add(labelH, null);
        jPanel1.add(Theure, null);
        jPanel1.add(labelM, null);
        jPanel1.add(Tminute, null);
        jPanel1.add(labelS, null);
        jPanel1.add(Tseconde, null);
        jPanel1.add(resultat, null);
        jPanel1.add(Inputs, null);

        jPanel2.add(btnOK, null);
        jPanel2.add(btnRAZ, null);

        this.getContentPane().add(jPanel2, BorderLayout.EAST);
        this.getContentPane().add(jPanel1, BorderLayout.CENTER);

        btnOK.addActionListener(e -> {
            int total;
            int nbrh = 0, nbrm = 0, nbrs = 0;
            String temp = Inputs.getText();
            total = Integer.parseInt(temp);
            if (total > 3600 && total < (2600 * 24)) {
                nbrh = total / 3600;
                total = total % 3600;
                nbrm = total / 60;
                nbrs = total % 60;
            } else if (total > 60) {
                nbrm = total / 60;
                nbrs = total % 60;
            }
            if (total < 60) nbrs = total;
            temp = Integer.toString(nbrh);
            Theure.setText(temp);
            temp = Integer.toString(nbrm);
            Tminute.setText(temp);
            temp = Integer.toString(nbrs);
            Tseconde.setText(temp);
        });

        btnRAZ.addActionListener(e -> {
            Theure.setText("");
            Tminute.setText("");
            Tseconde.setText("");
            Inputs.setText("");
        });
    }
}

