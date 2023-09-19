import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int f1 = 0;
        int f2 = 1;    //0  //1 2  3  5  8  13
        while (true) {
            int fn = f1 + f2;
            if (fn > limit){
                break;
            }
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }
    }
}