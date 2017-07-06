# azhagan
import java.io.*;
import java.util.*;
public class Factorial
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,fact=1,n;
    System.out.println("Enter an integer");
    n=Integer.parseInt(br.readLine());
    for(i=1;i<=n;i++)
    {
      fact=fact*i;
    }
    System.out.println("Fatorial of the number is:"+fact);
  }
}
