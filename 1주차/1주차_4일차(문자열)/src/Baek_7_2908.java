import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baek_7_2908{
    public static void main(String[] args) throws IOException 	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []str = br.readLine().split(" ");
        String A = new StringBuffer(str[0]).reverse().toString();
        String B = new StringBuffer(str[1]).reverse().toString();
    
        if (Integer.parseInt(String.join("",A))>Integer.parseInt(String.join("",B)))
        System.out.print(String.join("",A));

        else
        System.out.print(String.join("",B));
}
}