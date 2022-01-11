import java.util.*;

public class Baek_9_2438 {
    public static void main(String[] args) 	{
        Scanner scanner = new Scanner(System.in);
        int A;
        A = scanner.nextInt();
        for(int i=1;i<=A;i++){
            for(int j=0;j<i;j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
}
}
