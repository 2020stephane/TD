import javax.swing.*;
import java.awt.*;

public class MainClass {

    static JFrame frame;
    static PaneCreate myPane;

    public static void main(String[] args) {
        frame = new JFrame("GRETA : PROGRAMMATION EN JAVA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuCreate demo = new MenuCreate();
        myPane = new PaneCreate();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setBounds(400,100,900,500);
        frame.setMinimumSize(new Dimension(900,500));
        frame.setResizable(false);

        frame.setContentPane(myPane.createPane());
        frame.setVisible(true);
    }


}

