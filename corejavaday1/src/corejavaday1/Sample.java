package corejavaday1;
import java.util.*;
public class Sample
{
public static void main(String[] agrs)
{
    Scanner s=new Scanner(System.in);
    int a,b,c;
    System.out.println("enter the a and b values:");
    a=s.nextInt();
    b=s.nextInt();
    c=a+b;
    System.out.println("Addition of a="+a+" and b="+b+" is:"+c);
}
}