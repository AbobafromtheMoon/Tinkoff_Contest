import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();

        int[] a = new int[l];
        int[] b = new int[r];

        int s = 0, s1 = 0, counter = 0;

        for (int i = 0; i < l; i++)
            a[i] = scanner.nextInt();

        for (int i = 0; i < r; i++)
            b[i] = scanner.nextInt();

        for (int i = 0; i < w; i++)
        {
            while (s < w)
            {
                s += a[i];
            }
            if (s >= w)
            {
                counter++;
                break;
            }
        }
        for (int i = 0; i < w; i++)
        {
            while (s1 < w)
            {
                s1 += b[i];
            }
            if (s1 >= w)
            {
                counter++;
                break;
            }
        }
        if ((s + s1) > w) counter++;
        System.out.println(counter);
    }
}