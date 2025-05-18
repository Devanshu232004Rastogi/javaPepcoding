import java.util.*;

class  PrintIncreasing {
    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }
        printDecreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
}
