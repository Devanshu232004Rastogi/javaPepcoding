
import java.util.Scanner;




 class PrintDecreasingIncresing {
    

static void pd(int n){


    if(n==0){
        return;
    }
    System.out.println(n);
    pd(n-1);
    System.out.println(n);

    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc .nextInt();
    pd(n);
    }
}


