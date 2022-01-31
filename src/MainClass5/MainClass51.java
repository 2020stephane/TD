import java.util.Arrays;

public class MainClass51 {
    public static void main(String[] args) {

        int[] Tab = {9, 4, 2, 12, 42};
        int valmin;

        valmin = Min(Tab);
        System.out.println("la plus petite valeur est :" + valmin);


    }

    public static int Min(int[] tab) {

        int min;
        Arrays.sort(tab);
        min = tab[0];
        return min;
    }
}

