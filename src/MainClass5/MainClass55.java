public class MainClass55 {
    public static void main(String[] args) {
       int a= 123;
       int b = 5;
       System.out.println("Maximum = " + Max(a, Cube(b)));
    }
    public static int Cube(int b) {

        int cube = b *b *b;
        return cube;
    }
    public static int Max(int a, int b) {

        int max;
        if (a > b){
            return a;
        } else return b;
   }
}