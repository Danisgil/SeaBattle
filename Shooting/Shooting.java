import java.util.Scanner;

public class Shooting {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        int[][][] mape = new int[3][10][10];
        System.out.println("Enter z");
        int z = se.nextInt();
            if (z => 3)
                System.out.println("Too far, captain");
            else
                System.out.println("Enter x");
        int x = se.nextInt();
            if (x => 10)
            	System.out.println("Too far, captain");
        else
            	System.out.println("Enter y");
        int y = se.nextInt();
            if (y => 10)
                System.out.println("Too far, captain"));
        else
            	mape[z][x][y] = 1;

    }
}