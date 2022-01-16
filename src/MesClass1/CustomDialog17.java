package MesClass1;

import javax.swing.*;
import java.awt.*;

public class CustomDialog17 extends JDialog {


    public CustomDialog17(Frame owner,String titre,Boolean modal) {

        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 200);


    }
}