import java.util.Scanner;

public class MaxInArr {
    static int printArr(int[] arr, int n) {
int k = arr.length; 
        if(n== arr.length) return 0;
      return  Math.max(  arr[n] ,  printArr(arr, n+1));


       
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size :");
        int n = sc.nextInt();
        System.out.println();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + i + " :");

            arr[i] = sc.nextInt();

        }
        System.out.println("===============");

        System.out.println(printArr(arr, 0));
    }

}
