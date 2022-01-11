import java.util.*;
public class Baek_5_2884 {
    public static void main(String[] args) 	{
        Scanner scanner = new Scanner(System.in);
        int A,B;
        A = scanner.nextInt();
        B = scanner.nextInt();
    if (B<45)
        {
            if(A!=0)
            {A -=1;
                B = B + 15;}
            else
                {
                    A = 23;
                    B = B + 15;
                }

        }

    else
    {

                B = B - 45;
            
    }

    System.out.println(A+" "+B);

}
}
