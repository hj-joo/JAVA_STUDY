import java.util.*;
public class Baek_4_14681 {
    public static void main(String[] args) 	{
        Scanner scanner = new Scanner(System.in);
        int A,B;
        A = scanner.nextInt();
        B = scanner.nextInt();
        if (A>0 && B>0)
        System.out.printf("1");
        else if (A<0 && B>0)
        System.out.printf("2");
        else if (A<0 && B<0)
        System.out.printf("3");
        else if (A>0 && B<0)
        System.out.printf("4");
}
}
