package MesClass3;

import javax.swing.*;
import java.awt.*;

public class CustomDialog35 extends JDialog {

    JTextArea output;
    JScrollPane scrollPane;
    JLabel label1 = new JLabel("Borne superieur =");
    JLabel label2 = new JLabel("Borne inferieur =");
    JTextField input1 = new JTextField("");
    JTextField input2 = new JTextField("");
    JPanel jpanel1 = new JPanel();
    JPanel jpanel2 = new JPanel();
    JPanel jpanel3 = new JPanel();
    JButton btnOK = new JButton("GO");
    JButton btnRAZ = new JButton("RAZ");
    GridLayout gridLayout1 = new GridLayout();
    GridLayout GridLayout2 = new GridLayout();
    int i;

    public CustomDialog35(Frame owner, String titre, Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 250);

        jpanel1.setLayout(new BorderLayout());
        jpanel2.setLayout(gridLayout1);
        jpanel3.setLayout(GridLayout2);
        gridLayout1.setRows(1);
        gridLayout1.setColumns(2);
        gridLayout1.setHgap(15);
        GridLayout2.setRows(2);
        GridLayout2.setColumns(2);
        GridLayout2.setHgap(0);
        GridLayout2.setVgap(15);

        jpanel2.setBorder(BorderFactory.createEtchedBorder());
        jpanel1.setBorder(BorderFactory.createEtchedBorder());
        jpanel3.setBorder(BorderFactory.createEtchedBorder());

        output = new JTextArea(5, 20);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);
        jpanel1.add(scrollPane, BorderLayout.NORTH);

        /*label1.setBounds(0,120,150,25);
        label2.setBounds(0,150,150,25);
        input1.setBounds(135,120,50,25);
        input2.setBounds(135,150,50,25);*/

        jpanel3.add(label2,null);
        jpanel3.add(input2,null);

        jpanel3.add(label1,null);
        jpanel3.add(input1,null);

        jpanel2.add(btnOK,null);
        jpanel2.add(btnRAZ,null);

        this.getContentPane().add(jpanel1, BorderLayout.NORTH);
        this.getContentPane().add(jpanel3, BorderLayout.CENTER);
        this.getContentPane().add(jpanel2, BorderLayout.SOUTH);

        btnOK.addActionListener(e -> {
            int borns,borni;

            borns = Integer.parseInt(input1.getText());
            borni = Integer.parseInt(input2.getText());

            for (i = borni +1; i < borns; i++) {
                if ((i % 2) == 0) {
                    output.append(i + " est paire " + "\n");
                }
            }
        });
        btnRAZ.addActionListener(e -> {
            input1.setText("");
            input2.setText("");
        });
    }
}