import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    //making a mini project
    public static void main(String[] args) {
        int x = (int)((10*Math.random()));
        // x lies from 1 - 10 ;
        int rand_num;
        Scanner sc = new Scanner(System.in);
        do {
            rand_num = sc.nextInt();
            if(rand_num == x)
            {
                break;
            }
            else if ( rand_num > x)
            {
                System.out.print("guess a number smaller than this : ");
            }
            else
            {
                System.out.print("guess a number greater than this ");
            }
        }while(rand_num<=10 && rand_num >=0);
        System.out.print(x);
        System.out.println(" : you guessed it correctly congratulations!");





    }
}