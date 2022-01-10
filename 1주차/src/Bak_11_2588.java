import java.util.*;
public class Bak_11_2588{
    public static void main(String[] args) 	{
        Scanner scanner = new Scanner(System.in);
        int A,B;
        A = scanner.nextInt();
        B = scanner.nextInt();
        System.out.println(A * (B%10));
        System.out.println(A * ((B/10)%10));
        System.out.println(A * (B/100));
        System.out.println(A * B);

    }
}