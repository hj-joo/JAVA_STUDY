import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Baek_13_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str = br.readLine()) != null)
        // 공백 입력시 종료
        {   

            String[] st = str.split(" ");
    
            int A = Integer.parseInt(st[0]);
            int B = Integer.parseInt(st[1]);
            System.out.println(A+B);}
 
    }
    
}
