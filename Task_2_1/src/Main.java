import java.util.Scanner;
public class Main
{
    public static int bend(int d, int s)
    {
        if (s > d/2)
        {
            return -1;
        }
        return d - s;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int bendn = 0;
        int temp;
        if (((w > W) && (w > H))||((h > W) && (h > H))) //проверка на возможно реализации сгибов в целом по ширине и высоте
        {
            System.out.println(-1);
        }else
        {
            while ((W != w && H != h) || (W != w) || (H != h)) {
                if (w > h && W < H) {
                    temp = W;
                    W = H;
                    H = temp;
                }
                if (h > w && H < W) {
                    temp = W;
                    W = H;
                    H = temp;
                }
                if (W != w) {
                    if (bend(W, W - w) != -1) {
                        W = bend(W, W - w);
                        bendn++;
                    } else {
                        W = bend(W, (int) Math.floor(W / w));
                        bendn++;
                    }
                }
                if (H != h) {
                    if (bend(H, H - h) != -1) {
                        H = bend(H, H - h);
                        bendn++;
                    } else {
                        H = bend(H, (int) Math.floor(H / h));
                        bendn++;
                    }

                }
            }
            System.out.println(bendn);
        }
    }
}