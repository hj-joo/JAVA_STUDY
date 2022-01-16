import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baek_4_2675{
    public static void main(String[] args) throws IOException 	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A= Integer.parseInt(br.readLine());

        for (int i=0; i < A; i++)
        {
            String []st=br.readLine().split(" ");
            int B = Integer.parseInt(st[0]);
            String S = st[1];
            for(int j=0;j<S.length();j++){
                for(int k=0;k<B;k++){
                    System.out.print(S.charAt(j)); 
                }
            }
            System.out.println("");
        }

        
}
}