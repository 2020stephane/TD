import MainClass4.*;
import MesClass1.*;
import MesClass2.*;
import MesClass3.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuSelect implements ActionListener {

    String newline = "\n";

    public void add(JMenuItem menuItem) {
        menuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem)(e.getSource());
        String s = "Action event detected." + newline + "    Event source: " + source.getText();
        PaneCreate.output.append(s + newline);
        String exemple = source.getText();
        exemple = exemple.substring(0,4);
        switch (exemple) {
            case ("1.1 ") -> {
                CustomDialog11 mywindow = new CustomDialog11();
                mywindow.setVisible(true);
            }
            case ("1.2 ") -> {
                CustomDialog12 mywindow12 = new CustomDialog12();
                mywindow12.setVisible(true);
            }
            case ("1.3 ") -> {
                CustomDialog13 mywindow13 = new CustomDialog13(MainClass.frame,
                        "Echange de variables", true);
                mywindow13.setVisible(true);
            }
            case ("1.4 ") -> {
                CustomDialog14 mywindow14 = new CustomDialog14(MainClass.frame,
                        "Echange de variables", true);
                mywindow14.setVisible(true);
            }
            case ("1.5 ") -> {
                CustomDialog15 mywindow15 = new CustomDialog15(MainClass.frame,
                        "heures, minutes, secondes en Secondes", true);
                mywindow15.setVisible(true);
            }
            case ("1.6 ") -> {
                CustomDialog16 mywindow16 = new CustomDialog16(MainClass.frame,
                        "Secondes en heures, minutes et secondes", true);
                mywindow16.setVisible(true);
            }
            case ("1.7 ") -> {
                CustomDialog17 mywindow17 = new CustomDialog17(MainClass.frame,
                        "Calculatrice", true);
                mywindow17.setVisible(true);
            }
            case ("1.8 ") -> {
                CustomDialog18 mywindow18 = new CustomDialog18(MainClass.frame,
                        "Operateur ternaire", true);
                mywindow18.setVisible(true);
            }
            case ("1.9 ") -> {
                CustomDialog19 mywindow19 = new CustomDialog19(MainClass.frame,
                        "Test de signe", true);
                mywindow19.setVisible(true);
            }
            case ("1.10") -> {
                CustomDialog110 mywindow110 = new CustomDialog110(MainClass.frame,
                        "Code ASCII", true);
                mywindow110.setVisible(true);
            }
            case ("2.1 ") -> {
                CustomDialog21 mywindow21 = new CustomDialog21(MainClass.frame,
                        "nombre pair ou impaire", true);
                mywindow21.setVisible(true);
            }
            case ("2.2 ") -> {
                CustomDialog22 mywindow22 = new CustomDialog22(MainClass.frame,
                        "Equation du 1er degre", true);
                mywindow22.setVisible(true);
            }
            case ("2.3 ") -> {
                CustomDialog23 mywindow23 = new CustomDialog23(MainClass.frame,
                        "Montant d'une remise", true);
                mywindow23.setVisible(true);
            }
            case ("2.4 ") -> {
                CustomDialog24 mywindow24 = new CustomDialog24(MainClass.frame,
                        "Tri de 3 entiers", true);
                mywindow24.setVisible(true);
            }
            case ("2.5 ") -> {
                CustomDialog25 mywindow25 = new CustomDialog25(MainClass.frame,
                        "Tri de 3 reels", true);
                mywindow25.setVisible(true);
            }
            case ("2.6 ") -> {
                CustomDialog26 mywindow26 = new CustomDialog26(MainClass.frame,
                        "Calculatrice", true);
                mywindow26.setVisible(true);
            }
            case ("3.1 ") -> {
                CustomDialog31 mywindow31 = new CustomDialog31(MainClass.frame,
                        "Somme d'entiers", true, PaneCreate.output);
                mywindow31.setVisible(true);
            }
            case ("3.2 ") -> {
                CustomDialog32 mywindow32 = new CustomDialog32(MainClass.frame,
                        "Somme des carrés des entiers", true);
                mywindow32.setVisible(true);
            }
            case ("3.3 ") -> {
                CustomDialog33 mywindow33 = new CustomDialog33(MainClass.frame,
                        "affiche valeur impaire entre 0 et 10", true);
                mywindow33.setVisible(true);
            }
            case ("3.4 ") -> {
                CustomDialog34 mywindow34 = new CustomDialog34(MainClass.frame,
                        "determiner parite des entiers", true);
                mywindow34.setVisible(true);
            }
            case ("3.5 ") -> {
                CustomDialog35 mywindow35 = new CustomDialog35(MainClass.frame,
                        "Suite de nombres pairs", true);
                mywindow35.setVisible(true);
            }
            case ("3.6 ") -> {
                CustomDialog36 mywindow36 = new CustomDialog36(MainClass.frame,
                        "Calcul d'interets", true);
                mywindow36.setVisible(true);
            }
            case ("3.7 ") -> {
                CustomDialog37 mywindow37 = new CustomDialog37(MainClass.frame,
                        "table de multiplication", true);
                mywindow37.setVisible(true);
            }
            case ("3.8 ") -> {
                CustomDialog38 mywindow38 = new CustomDialog38(MainClass.frame,
                        "affichage des nombres de 10 a 20 sauf 13", true);
                mywindow38.setVisible(true);
            }
            case ("3.9 ") -> {
                CustomDialog39 mywindow39 = new CustomDialog39(MainClass.frame,
                        "De jolies étoiles", true);
                mywindow39.setVisible(true);
            }
            case ("3.10") -> {
                CustomDialog310 mywindow310 = new CustomDialog310(MainClass.frame,
                        "Numerotage", true);
                mywindow310.setVisible(true);
            }
            case ("3.11") -> {
                CustomDialog311 mywindow311 = new CustomDialog311(MainClass.frame,
                        "Palindrome dans un mot", true);
                mywindow311.setVisible(true);
            }
            case ("3.12") -> {
                CustomDialog312 mywindow312 = new CustomDialog312(MainClass.frame,
                        "Palindrome sur un chiffre", true);
                mywindow312.setVisible(true);
            }
            case ("3.13") -> {
                CustomDialog313 mywindow313 = new CustomDialog313(MainClass.frame,
                        "Afficher les initiales d'un nom", true);
                mywindow313.setVisible(true);
            }
            case ("4.1 ") -> {
                CustomDialog41 mywindow41 = new CustomDialog41(MainClass.frame,
                        "Nombre de lettre e dans un texte", true);
                mywindow41.setVisible(true);
            }
            case ("4.2 ") -> {
                CustomDialog42 mywindow42 = new CustomDialog42(MainClass.frame,
                        "Nombre de lettre dans un tableau", true);
                mywindow42.setVisible(true);
            }
            case ("4.3 ") -> {
                CustomDialog43 mywindow43 = new CustomDialog43(MainClass.frame,
                        "supprimer une lettre dans un texte", true);
                mywindow43.setVisible(true);
            }

            case ("4.6 ") -> {
                CustomDialog46 mywindow46 = new CustomDialog46(MainClass.frame,
                        "Recuperer valeur max d'un tableau", true);
                mywindow46.setVisible(true);
            }
            case ("4.7 ") -> {
                CustomDialog47 mywindow47 = new CustomDialog47(MainClass.frame,
                        "Recuperer valeur max d'un tableau", true);
                mywindow47.setVisible(true);
            }
            case ("4.8 ") -> {
                CustomDialog48 mywindow48 = new CustomDialog48(MainClass.frame,
                        "ranger les nombres entiers", true);
                mywindow48.setVisible(true);
            }
            case ("4.9 ") -> {
                CustomDialog49 mywindow49 = new CustomDialog49(MainClass.frame,
                        "gestion de la taille d'un tableau", true);
                mywindow49.setVisible(true);
            }
            case ("4.10") -> {
                CustomDialog410 mywindow410 = new CustomDialog410(MainClass.frame,
                        "encore de jolies etoiles", true);
                mywindow410.setVisible(true);
            }

        default -> {  }
        }
    }
}