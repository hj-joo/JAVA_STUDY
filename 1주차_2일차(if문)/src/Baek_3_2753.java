import java.util.*;
public class Main {
    public static void main(String[] args) 	{
        Scanner scanner = new Scanner(System.in);
        int A;
        A = scanner.nextInt();
        if((A%4==0) && (A%100!=0  || A%400==0))
        System.out.printf("1");
        else
        System.out.printf("0");

}
}