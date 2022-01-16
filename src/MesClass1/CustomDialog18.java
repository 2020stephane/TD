package MesClass1;

import javax.swing.*;
import java.awt.*;

public class CustomDialog18 extends JDialog {

    JPanel jPanel = new JPanel();
    JLabel resultat1 = new JLabel("z = (a>b ? a : b) + (a<=b ? a :b)");
    JLabel resultat2 = new JLabel("z = a + b");

    public CustomDialog18(Frame owner,String titre,Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 150);

        resultat1.setBounds(new Rectangle(75, 10, 200, 17));
        resultat2.setBounds(new Rectangle(125, 60, 50, 17));
        jPanel.setLayout(null);
        jPanel.add(resultat1, null);
        jPanel.add(resultat2, null);
        this.getContentPane().add(jPanel,  BorderLayout.CENTER);
    }
}