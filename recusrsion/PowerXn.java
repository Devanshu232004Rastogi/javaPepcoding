
import java.util.Scanner;

public class PowerXn {


    static int power(int x , int n){


        if( n ==0){
            return 1;
        }
        int pow = power(x, n-1);
        int powx = x*pow;
        return powx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(x , n));
    } 
}
