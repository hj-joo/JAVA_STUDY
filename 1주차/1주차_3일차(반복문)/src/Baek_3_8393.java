import java.util.*; 
public class Baek_3_8393 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int A,B=0;
        A = sc.nextInt();
        for(int i=1;i<=A;i++){
            B = i+ B;
        }
        System.out.println(B);
    }
    
}
