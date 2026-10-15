import java.util.Scanner;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println(0);
            sc.close();
            return;
        }

        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[count - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }

        System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
