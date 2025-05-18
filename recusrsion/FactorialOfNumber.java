
import java.util.Scanner;

public record FactorialOfNumber() {

    static int FacPrinter(int n) {
        if (n == 1)
            return 1;
        int res;

        res = n * FacPrinter(n - 1);

        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(
                FacPrinter(n));
    }
}
