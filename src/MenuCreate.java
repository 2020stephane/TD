import javax.swing.*;

public class MenuCreate {

    public JMenuBar createMenuBar() {

        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;

        MenuSelect action = new MenuSelect();

        menuBar = new JMenuBar();
        menuBar.setOpaque(true);

        menu = new JMenu("1 :programmation procédurale");
        menuBar.add(menu);

        menuItem = new JMenuItem("1.1 : Premieres manipulation de variables");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("1.2 : Calcul d'un prix");
        action.add(menuItem);
        menu.add(menuItem);

        menu.addSeparator();
        submenu = new JMenu("Echange de variables");
        menuItem = new JMenuItem("1.3 : Echange de 2 variables");
        action.add(menuItem);
        submenu.add(menuItem);
        menuItem = new JMenuItem("1.4 : Echange de 3 variables");
        action.add(menuItem);
        submenu.add(menuItem);
        menu.add(submenu);

        menu.addSeparator();
        submenu = new JMenu("Conversion de durées");
        menuItem = new JMenuItem("1.5 : heures, minutes, secondes en Secondes");
        action.add(menuItem);
        submenu.add(menuItem);
        menuItem = new JMenuItem("1.6 : Secondes en heures, minutes et secondes");
        action.add(menuItem);
        submenu.add(menuItem);
        menu.add(submenu);

        menu.addSeparator();
        menuItem = new JMenuItem("1.7 : NONE");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("1.8 : Operateur ternaire");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("1.9 : Test de signe");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("1.10 : Code ASCII");
        action.add(menuItem);
        menu.add(menuItem);

        menu = new JMenu("2 :Structures conditionnelles");
        menuBar.add(menu);

        menuItem = new JMenuItem("2.1 : nombre pair ou impaire");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("2.2 : Equation du 1er degre");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("2.3 : Montant d'une remise");
        action.add(menuItem);
        menu.add(menuItem);

        menu.addSeparator();
        submenu = new JMenu("le tri : entier et reel");
        menuItem = new JMenuItem("2.4 : Savoir si 3 entiers sont triés");
        action.add(menuItem);
        submenu.add(menuItem);
        menuItem = new JMenuItem("2.5 : Tri de trois réels");
        action.add(menuItem);
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JMenuItem("2.6 : NONE");
        action.add(menuItem);
        menu.add(menuItem);

        menu = new JMenu("3 :Structures conditionnelles et itératives");
        menuBar.add(menu);

        menuItem = new JMenuItem("3.1 : Somme d'entiers");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("3.2 : Somme des carrés des entiers");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("3.3 : affiche valeur impaire entre 0 et 10");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("3.4 : determiner parite des entiers");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("3.5 : Suite de nombres pairs");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("3.6 : Calcul d'interets");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("3.7 : table de multiplication");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("3.8 : affichage des nombres de 10 a 20 sauf 13");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("3.9 : De jolies étoiles");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("3.10 : Numerotage");
        action.add(menuItem);
        menu.add(menuItem);

        menu.addSeparator();
        submenu = new JMenu("Palindrome");
        menuItem = new JMenuItem("3.11 : Palindrome dans un mot");
        action.add(menuItem);
        submenu.add(menuItem);
        menuItem = new JMenuItem("3.12 : Palindrome sur un chiffre");
        action.add(menuItem);
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JMenuItem("3.13 : Afficher les initiales d'un nom");
        action.add(menuItem);
        menu.add(menuItem);

        menu = new JMenu("4 : Strucure de donnee");
        menuBar.add(menu);

        menu.addSeparator();
        submenu = new JMenu("Nombre de lettres");
        menuItem = new JMenuItem("4.1 : dans un texte");
        action.add(menuItem);
        submenu.add(menuItem);
        menuItem = new JMenuItem("4.2 : dans un tableau");
        action.add(menuItem);
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JMenuItem("4.3 : supprimer les lettres e dans un texte");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("4.4 : NONE");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("4.5 : NONE");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("4.6 : Valeur max d'un tableau");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("4.7 : Valeur max d'un tableau non defini");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("4.8 : ranger les nombres entiers");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("4.9 : gestion de la taille d'un tableau");
        action.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("4.10 : encore de jolies etoiles");
        action.add(menuItem);
        menu.add(menuItem);


        menu = new JMenu("5 :Sous-Programmes");
        menuBar.add(menu);

        return menuBar;
    }
}
