public class MainClass54 {
    public static void main(String[] args) {

        int nbrsec;
        nbrsec = hmstoseconde(2,48,32);
        System.out.println("nombre de seconde = " + nbrsec);
    }
    public static int hmstoseconde(int heure,int minute,int seconde) {

        int total;
        int nbrh = 0, nbrm = 0, nbrs = 0;

        total = (heure *3600) + minute * 60 + seconde;
        return total;
    }
}