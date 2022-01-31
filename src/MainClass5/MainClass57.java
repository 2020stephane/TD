package MainClass5;

public class MainClass57 {

    public static void main(String[] args) {


    }

    public static void conversion(int duree) {

        int total;
        int nbrh = 0, nbrm = 0, nbrs = 0;

        total = duree;
        if (total > 3600 && total < (2600 * 24)) {
            nbrh = total / 3600;
            total = total % 3600;
            nbrm = total / 60;
            nbrs = total % 60;
        } else if (total > 60) {
            nbrm = total / 60;
            nbrs = total % 60;
        }
        if (total < 60) nbrs = total;
        System.out.println(nbrh + " heures " + nbrm + " minute " + nbrs + " secondes");
    }

    public static void conversion(int seconde, int minute) {

    }

    public static int hmstoseconde(int heure, int minute, int seconde) {

        int total;
        int nbrh = 0, nbrm = 0, nbrs = 0;

        total = (heure * 3600) + minute * 60 + seconde;
        return total;
    }
}
