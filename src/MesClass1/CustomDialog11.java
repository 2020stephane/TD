package MesClass1;

import javax.swing.*;
import java.util.Objects;

public class CustomDialog11 extends JDialog  {

    private final JTextField valeur1 = new JTextField();
    private final JTextField valeur2 = new JTextField();
    private final JTextField resultat = new JTextField();

    public CustomDialog11() {
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setBounds(600,300,500,200);
        this.setTitle("Manipulation de variables");
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.LINE_AXIS));
        panel1.add(new JLabel("Valeur1 = "));
        panel1.add(valeur1);
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.LINE_AXIS));
        panel2.add(new JLabel("Valeur2 = "));
        panel2.add(valeur2);
        JPanel panel3= new JPanel();
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.LINE_AXIS));
        panel3.add(new JLabel("valeur4 = "));
        panel3.add(resultat);
        JPanel panel4= new JPanel();
        panel4.setLayout(new BoxLayout(panel4,BoxLayout.LINE_AXIS));
        JButton calcul = new JButton("CALCUL");
        panel4.add(calcul);
        JButton raz = new JButton("RAZ");
        panel4.add(raz);
        JPanel panel5= new JPanel();
        panel5.setLayout(new BoxLayout(panel5,BoxLayout.PAGE_AXIS));
        panel5.add(panel1);
        panel5.add(panel2);
        panel5.add(panel3);
        panel5.add(panel4);
        this.getContentPane().add(panel5);
        this.setVisible(true);
        calcul.addActionListener(e -> {
            int temp1 ;
            int temp2 ;

            if (!Objects.equals(valeur1.getText(), "") && !Objects.equals(valeur2.getText(), "")) {
                temp1 = Integer.parseInt(valeur1.getText());
                temp2 = Integer.parseInt(valeur2.getText());
                temp1 = temp1 + temp2;
                resultat.setText(Integer.toString(temp1));
            }
        });
        raz.addActionListener(e -> {
            resultat.setText("");
            valeur1.setText("");
            valeur2.setText("");
        });
    }

}
