import java.util.*;

public class Baek_11_10871 {
    public static void main(String[] args) 	{
        Scanner scanner = new Scanner(System.in);
        int A,B,C;
        A = scanner.nextInt();
        B = scanner.nextInt();

        for(int i=1;i<=A;i++){
            C = scanner.nextInt();
            if (C<B)
            System.out.printf(C + " ");
            
        }
}
}
