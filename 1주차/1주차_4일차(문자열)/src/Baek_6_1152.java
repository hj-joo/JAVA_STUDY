import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baek_6_1152{
    public static void main(String[] args) throws IOException 	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine()," ");
        System.out.print(str.countTokens());
}
}