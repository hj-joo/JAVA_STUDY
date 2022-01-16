import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Baek_3_10809{
    public static void main(String[] args) throws IOException 	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []alpha= new int[26]; 
        // Arrays.fill 함수를 통해 -1로 모두 초기화
        Arrays.fill(alpha,-1);
        String str= br.readLine();
        
        for(int i=0; i<str.length(); i++)
        {
            //charAt()을 통해 아스키코드로 바꿔줌
            int a = str.charAt(i)-97;
            if(alpha[a]==-1) alpha[a] = i;
        }

        for(int result: alpha)
            System.out.print(result + " ");
        
}
}