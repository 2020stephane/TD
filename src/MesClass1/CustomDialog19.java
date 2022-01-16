package MesClass1;

import javax.swing.*;
import java.awt.*;

public class CustomDialog19 extends JDialog {


    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JLabel labeln = new JLabel();
    JTextField Inputn = new JTextField();
    JLabel resultat = new JLabel();
    JButton btnOK = new JButton();
    JButton btnRAZ = new JButton();
    GridLayout gridLayout1 = new GridLayout();

    public CustomDialog19(Frame owner,String titre,Boolean modal) {

        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 200);

        labeln.setText("votre nombre : ");
        labeln.setBounds(new Rectangle(50, 25, 100, 21));
        Inputn.setText("");
        Inputn.setBounds(new Rectangle(150, 25, 50, 21));
        btnOK.setText("TEST");
        btnRAZ.setText("RAZ");

        jPanel2.setLayout(gridLayout1);
        gridLayout1.setRows(4);
        gridLayout1.setColumns(1);
        gridLayout1.setVgap(15);
        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        resultat.setHorizontalAlignment(SwingConstants.LEFT);
        resultat.setText("Resultat");
        resultat.setBounds(new Rectangle(50, 60, 150, 17));


        jPanel1.add(resultat, null);
        jPanel1.add(Inputn, null);
        jPanel1.add(labeln, null);

        jPanel2.add(btnOK, null);
        jPanel2.add(btnRAZ, null);

        this.getContentPane().add(jPanel2,  BorderLayout.EAST);
        this.getContentPane().add(jPanel1,  BorderLayout.CENTER);

        btnOK.addActionListener(e -> {
            int total;
            int nbrh = 0, nbrm = 0, nbrs = 0;
            String temp = Inputn.getText();
            total = Integer.parseInt(temp);
            if (total == 0){
                resultat.setText("resultat 0,nombre null");
            } else if (total > 0) {
                resultat.setText("resultat +1,nombre positif");
            }else { resultat.setText("resultat -1,nombre negatif"); }
        });

        btnRAZ.addActionListener(e -> {
            resultat.setText("resultat");
            Inputn.setText("");
        });
    }
}