
public class MainClass52 {
    public static void main(String[] args) {

        int[] Tab = {9, 4, 2, 12, 42};
        int taille;


        taille = Tab.length;
        Tri(Tab, taille);
        for (int i = 0; i < taille; i++) {
            System.out.println("Tab [ " + i + " ]=" + Tab[i]);
        }


    }

    public static void Tri(int[] tab, int size) {

        int i, j, index;

        for (i = 0; i < size; i++) {
            index = i;
            for (j = i; j < size; j++) {
                if (tab[index] > tab[j]) {
                    index = j;
                }
            }
            int min = tab[index];
            tab[index] = tab[i];
            tab[i] = min;
        }
    }
}