package MesClass3;

import javax.swing.*;
import java.awt.*;

public class CustomDialog310 extends JDialog {

    JTextArea output;
    JScrollPane scrollPane;



    public CustomDialog310(Frame owner,String titre,Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 250);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);
        output = new JTextArea(10, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);
        panel.add(scrollPane, BorderLayout.NORTH);
        this.getContentPane().add(panel,BorderLayout.CENTER);

        int i;
        int somme = 0;

        for (i=1; i<10000; i++) {
            somme = somme + String.valueOf(i).length();
        }
            output.append(" le nombre de chiffre est " + somme  + "\n");

    }
}
