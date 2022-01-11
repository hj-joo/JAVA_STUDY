import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Baek_14_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        str = br.readLine();
        int n,A,B,temp;
        n = Integer.parseInt(str);
        temp = n;
        int count=0;
        while(true)
        {   
            A = temp / 10;
            B = temp % 10;
            temp = B * 10 + (A+B) % 10;
            count++;
            
            if (n == temp) break;
            
        }
        System.out.println(count);
        br.close();
    }
    
}
