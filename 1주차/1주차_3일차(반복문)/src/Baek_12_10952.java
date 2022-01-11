import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Baek_12_10952{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {   
            String st = br.readLine();
            String[] str = st.split(" ");
    
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);

            if (A ==0 && B==0)
            break;
    
            System.out.println(A+B);}
 
    }
    
}
