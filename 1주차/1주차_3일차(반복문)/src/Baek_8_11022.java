import java.util.*;
public class Baek_8_11022 {
    public static void main(String[] args) 	{
        Scanner scanner = new Scanner(System.in);
        int A,B,C;
        C = scanner.nextInt();
        for(int i=1;i<=C;i++){
                A = scanner.nextInt();
                B = scanner.nextInt();

                System.out.println("Case #" +i + ": "+ A+" + "+B+" = "+(A + B)); 
        }
}
}
