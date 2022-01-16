package MainClass4;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class CustomDialog49 extends JDialog {

    JTextArea output;
    JScrollPane scrollPane;
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JButton btnOK = new JButton("GO");
    JButton btnRAZ = new JButton("INIT");
    JButton btnsuiv = new JButton("SUIVANT");

    GridLayout gridLayout1 = new GridLayout();
    GridLayout GridLayout2 = new GridLayout();
    JLabel labelpair = new JLabel("Taille du tableau pair");
    JTextField taillepair = new JTextField("");
    JLabel labelimpair = new JLabel("Taille du tableau impair");
    JTextField tailleimpair = new JTextField("");
    JLabel valeur = new JLabel("valeur ");
    JTextField input = new JTextField("");


    int[] tabpair;
    int[] tabimpair;
    int[] tabtemp = new int[7];

    int index = 0;
    int indexpair = 0;
    int indeximpair = 0;
    int taillepaire = 3;
    int tailleimpaire = 4;


    public CustomDialog49(Frame owner, String titre, Boolean modal) {
        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 500, 350);

        panel1.setLayout(new BorderLayout());
        panel2.setLayout(gridLayout1);
        panel3.setLayout(GridLayout2);
        gridLayout1.setRows(1);
        gridLayout1.setColumns(3);
        gridLayout1.setHgap(15);

        GridLayout2.setRows(4);
        GridLayout2.setColumns(2);
        GridLayout2.setHgap(0);
        GridLayout2.setVgap(5);

        panel2.setBorder(BorderFactory.createEtchedBorder());
        panel1.setBorder(BorderFactory.createEtchedBorder());
        panel3.setBorder(BorderFactory.createEtchedBorder());

        output = new JTextArea(10, 20);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);
        panel1.add(scrollPane, BorderLayout.NORTH);

        panel3.add(labelpair, null);
        panel3.add(taillepair, null);
        panel3.add(labelimpair, null);
        panel3.add(tailleimpair, null);
        panel3.add(valeur, null);
        panel3.add(input, null);


        panel2.add(btnOK, null);
        panel2.add(btnRAZ, null);
        panel2.add(btnsuiv, null);

        this.getContentPane().add(panel1, BorderLayout.CENTER);
        this.getContentPane().add(panel3, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);

        btnsuiv.addActionListener(e -> {

            String temp;
            int valeurtemp;
            //int[] tabtemp = new int[taillepaire + tailleimpaire];

            if (index < (taillepaire + tailleimpaire)) {
                temp = input.getText();
                valeurtemp = Integer.parseInt(temp);
                tabtemp[index] = valeurtemp;
                output.append("tab[" + index + "]=" + tabtemp[index] + "\n");
                valeur.setText("valeur " + (index + 2));
                index = index + 1;
                input.setText("");
            }

        });

        btnOK.addActionListener(e -> {

            int i;

            for ( i = 0; i< 7; i++) {

                if ((tabtemp[i] % 2) != 0) {
                    tabimpair[i] = tabtemp[i];
                } else {
                    tabpair[i] = tabtemp[i];
                }
            }
            output.append("tableau impaire = "+ "\n" );
           for ( i = 0; i< tailleimpaire; i++) {
                output.append("  " + tabimpair[i] );
            }
            output.append("tableau paire = "+ "\n" );
            for ( i = 0; i< taillepaire; i++) {
                output.append("  " + tabimpair[i] );
            }
       });
        btnRAZ.addActionListener(e -> {

            String temp;

            temp = taillepair.getText();
            taillepaire = Integer.parseInt(temp);
            tabpair = new int[taillepaire];

            temp = tailleimpair.getText();
            tailleimpaire = Integer.parseInt(temp);
            tabimpair = new int[tailleimpaire];

            valeur.setText("valeur 1");

            output.append("taille du tableau paire = " + taillepaire + "\n");
            output.append("taille du tableau impaire = " + tailleimpaire + "\n");
        });

    }
}