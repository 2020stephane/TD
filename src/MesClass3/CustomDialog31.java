package MesClass3;

import javax.swing.*;
import java.awt.*;

public class CustomDialog31 extends JDialog {

    JLabel label1 = new JLabel("Valeur 1 =");
    JLabel label2 = new JLabel("Valeur 2 =");
    JLabel label3 = new JLabel("Valeur 3 =");
    JLabel labels = new JLabel("somme =");
    JTextField input1 = new JTextField("");
    JTextField input2 = new JTextField("");
    JTextField input3 = new JTextField("");
    JTextField resultat = new JTextField("");
    JPanel jpanel1 = new JPanel();
    JPanel jpanel2 = new JPanel();
    JButton btnOK = new JButton("CALCUL");
    JButton btnRAZ = new JButton("RAZ");
    GridLayout gridLayout1 = new GridLayout();
    int temp1, temp2, temp3, temp4;

    public CustomDialog31(Frame owner, String titre, Boolean modal, JTextArea outpt) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 250);

        jpanel2.setLayout(gridLayout1);
        gridLayout1.setRows(1);
        gridLayout1.setColumns(2);
        gridLayout1.setVgap(15);
        jpanel2.setBorder(BorderFactory.createEtchedBorder(Color.BLUE,Color.BLUE));
        jpanel1.setBorder(BorderFactory.createEtchedBorder());
        jpanel1.setLayout(null);

        label1.setBounds(0,25,100,25);
        label2.setBounds(0,50,100,25);
        label3.setBounds(0,75,100,25);
        input1.setBounds(100,25,100,25);
        input2.setBounds(100,50,100,25);
        input3.setBounds(100,75,100,25);
        labels.setBounds(0,120,100,25);
        resultat.setBounds(100,120,100,25);
        resultat.setEditable(false);

        jpanel1.add(label1,null);
        jpanel1.add(label2,null);
        jpanel1.add(label3,null);
        jpanel1.add(input1,null);
        jpanel1.add(input2,null);
        jpanel1.add(input3,null);
        jpanel1.add(labels,null);
        jpanel1.add(resultat,null);
        jpanel2.add(btnOK,null);
        jpanel2.add(btnRAZ,null);

        this.getContentPane().add(jpanel1,BorderLayout.CENTER);
        this.getContentPane().add(jpanel2,  BorderLayout.SOUTH);

        btnOK.addActionListener(e -> {

            temp1 = Integer.parseInt(input1.getText());
            temp2 = Integer.parseInt(input2.getText());
            temp3 = Integer.parseInt(input3.getText());
            temp4 = temp1 + temp2 + temp3;
            outpt.append("temp1 = " + temp1 + " temp2 = "+temp2+" temp3 = "+temp3+" res="+"\n");
            resultat.setText(Integer.toString(temp4));
        });
        btnRAZ.addActionListener(e -> {
            resultat.setText("");
            input1.setText("");
            input2.setText("");
            input3.setText("");
        });


    }
}