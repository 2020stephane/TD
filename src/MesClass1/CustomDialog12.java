package MesClass1;

import javax.swing.*;
import java.util.Objects;

public class CustomDialog12 extends JDialog {

    private final JTextField prixHT = new JTextField();
    private final JTextField taux = new JTextField();
    private final JLabel prixTTC = new JLabel("  ");
    private final JTextField nbrA = new JTextField();
    private final JLabel totalTTC = new JLabel("  ");

    public CustomDialog12() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(600, 300, 500, 200);
        this.setTitle("Calcul d'un prix");

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.LINE_AXIS));
        panel1.add(new JLabel(" Prix unitaire HT "));
        panel1.add(prixHT);
        panel1.add(new JLabel("   Taux de TVA "));
        panel1.add(taux);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.LINE_AXIS));
        panel2.add(new JLabel("Prix unitaire TTC "));
        panel2.add(prixTTC);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.LINE_AXIS));
        panel3.add(new JLabel("Nombre d'article "));
        panel3.add(nbrA);

        JPanel panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.LINE_AXIS));
        panel4.add(new JLabel("Montant total TTC "));
        panel4.add(totalTTC);

        JPanel panelCR = new JPanel();
        JButton calcul = new JButton("CALCUL");
        JButton raz = new JButton("RAZ");
        panelCR.setLayout(new BoxLayout(panelCR, BoxLayout.LINE_AXIS));
        panelCR.add(calcul);
        panelCR.add(raz);

        JPanel panelF = new JPanel();
        panelF.setLayout(new BoxLayout(panelF, BoxLayout.PAGE_AXIS));
        panelF.add(panel1);
        panelF.add(panel3);
        panelF.add(panel2);
        panelF.add(panel4);
        panelF.add(panelCR);

        this.getContentPane().add(panelF);
        this.setVisible(true);
        calcul.addActionListener(e -> {
            double temp1;
            double temp2;

            if (!Objects.equals(prixHT.getText(), "") && !Objects.equals(taux.getText(), "")) {
                temp1 = Double.parseDouble(prixHT.getText());
                temp2 = Double.parseDouble(taux.getText());
                temp1 = temp1 + (temp1 * (temp2 / 100));
                prixTTC.setText(Double.toString(temp1));
                temp2 = Double.parseDouble(nbrA.getText());
                temp1 = temp1 * temp2;
                totalTTC.setText(Double.toString(temp1));
            }
        });
        raz.addActionListener(e -> {
            prixTTC.setText("");
            taux.setText("");
            prixHT.setText("");
            nbrA.setText("");
            totalTTC.setText("");

        });
    }
}
