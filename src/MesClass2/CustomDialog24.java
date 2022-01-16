package MesClass2;

import javax.swing.*;
import java.awt.*;

public class CustomDialog24 extends JDialog {

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JTextField inputx = new JTextField();
    JTextField inputy = new JTextField();
    JTextField  inputz = new JTextField();
    JLabel labelx = new JLabel();
    JLabel labely = new JLabel();
    JLabel labelz = new JLabel();
    JLabel labelres = new JLabel();
    JButton btnOK = new JButton();
    JButton btnRAZ = new JButton();
    GridLayout gridLayout1 = new GridLayout();

    public CustomDialog24(Frame owner, String titre, Boolean modal) {

        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 250);

        labelx.setText("x = ");
        labelx.setBounds(new Rectangle(20, 20, 25, 21));
        labely.setText("y =");
        labely.setBounds(new Rectangle(20, 50, 25, 21));
        labelz.setText("z =");
        labelz.setBounds(new Rectangle(20, 80, 25, 21));
        labelres.setText("");
        labelres.setBounds(new Rectangle(20, 120, 250, 21));
        inputx.setText("");
        inputx.setBounds(new Rectangle(50, 20, 50, 21));
        inputy.setText("");
        inputy.setBounds(new Rectangle(50, 50, 50, 21));
        inputz.setText("");
        inputz.setBounds(new Rectangle(50, 80, 50, 21));
        btnOK.setText("GO");
        btnRAZ.setText("RAZ");

        jPanel2.setLayout(gridLayout1);
        gridLayout1.setRows(1);
        gridLayout1.setColumns(2);
        gridLayout1.setVgap(5);

        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setBorder(BorderFactory.createEtchedBorder());

        jPanel1.setLayout(null);
        jPanel1.add(labelx, null);
        jPanel1.add(labely, null);
        jPanel1.add(labelz, null);
        jPanel1.add(labelres, null);
        jPanel1.add(inputx, null);
        jPanel1.add(inputy, null);
        jPanel1.add(inputz, null);
        jPanel2.add(btnOK, null);
        jPanel2.add(btnRAZ, null);

        this.getContentPane().add(jPanel2,  BorderLayout.SOUTH);
        this.getContentPane().add(jPanel1,  BorderLayout.CENTER);

        btnOK.addActionListener(e -> {
            int valx,valy,valz;

            String temp = inputx.getText();
            valx = Integer.parseInt(temp);
            temp = inputy.getText();
            valy = Integer.parseInt(temp);
            temp = inputz.getText();
            valz = Integer.parseInt(temp);
            if (valx <= valy  && valy <= valz) {
                labelres.setText("nombres dans l'ordre croissant.");
            } else {
                labelres.setText("nombres dans le desordre.");
            }

        });

        btnRAZ.addActionListener(e -> {
            inputx.setText("");
            inputy.setText("");
            inputz.setText("" );
            labelx.setText("x = ");
            labely.setText("y =");
            labelz.setText("z = ");
            labelres.setText("");
        });
    }
}
