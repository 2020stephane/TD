import javax.swing.*;
import java.awt.*;

public class PaneCreate {

    static JTextArea output;
    JScrollPane scrollPane;

    public Container createPane() {

        ImageIcon logo = createImageIcon("images/greta.png");
        JLabel myLabel = new JLabel(logo, JLabel.CENTER);
        ImageIcon logo2 = createImageIcon("images/moon1.jpg");
        JLabel myLabel2 = new JLabel(logo2, JLabel.CENTER);
        JLabel myLabel3 = new JLabel(logo2, JLabel.CENTER);
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(false);
        output = new JTextArea(10, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);
        assert logo2 != null;
        MainClass.frame.setIconImage(logo2.getImage());
        contentPane.add(scrollPane, BorderLayout.NORTH);
        contentPane.add(myLabel, BorderLayout.CENTER);
        contentPane.add(myLabel2, BorderLayout.EAST);
        contentPane.add(myLabel3, BorderLayout.WEST);
        return contentPane;
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = MainClass.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
