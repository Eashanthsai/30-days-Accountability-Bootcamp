import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int current = arr[0];
        int maximum = arr[0];

        for (int i = 1; i < n; i++) {
            if (current + arr[i] > arr[i]) {
                current = current + arr[i];
            } else {
                current = arr[i];
            }

            if (current > maximum) {
                maximum = current;
            }
        }

        System.out.println(maximum);
        sc.close();
    }
}
