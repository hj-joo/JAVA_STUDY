import java.util.*;
public class Baek_1_1330{
    public static void main(String[] args) 	{
        Scanner scanner = new Scanner(System.in);
        int A,B;
        A = scanner.nextInt();
        B = scanner.nextInt();
        if (A > B)
            System.out.println(">");
        else if(A<B)
            System.out.println("<");
        else
            System.out.println("==");

    }
}