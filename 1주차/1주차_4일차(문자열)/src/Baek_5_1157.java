import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baek_5_1157{
    public static void main(String[] args) throws IOException 	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int []alpha= new int[26]; 
        String str= br.readLine();
        
        for(int i=0; i<str.length(); i++)
        {
            if('a' <=str.charAt(i) && str.charAt(i) <= 'z') alpha[str.charAt(i)-97]++;
            else alpha[str.charAt(i)-65]++;
        }
        int max = -21470000;
        char ch = ' ';
        for(int i=0;i<26;i++){
            if (alpha[i]>max){
                max = alpha[i];
                ch = (char) (i +65);
            }
            else if (alpha[i]==max) ch = '?';
            
        }

        System.out.print(ch);

        
}
}