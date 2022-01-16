package MesClass3;

import javax.swing.*;
import java.awt.*;

public class CustomDialog38 extends JDialog {

    JTextArea output;
    JScrollPane scrollPane;
    int i;


    public CustomDialog38(Frame owner,String titre,Boolean modal) {
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

        for (i=10; i<=20; i++) {
            if (i == 13)  { continue;}
            output.append(" chiffre = " + i  + "\n");
        }
    }
}
