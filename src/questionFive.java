import java.io.*;

public class questionFive {


    public static void printStars(int n) {
        int a, b;

        //print stars with this for loop

        for (a = 1; a < n; a++) {


                for (b = 1; b <= a; b++) {
                    System.out.print("* ");
                }
                //end line after each row
            System.out.println();
            }
    }
    //main function

    public static void main(String[] args) {
        int n=6;
        printStars(n);
    }
}

