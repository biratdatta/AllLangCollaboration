 

// Program to convert celcius to fahrenheit
import java.util.Scanner;
public class celcius
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the temperature in celcius");
int c = sc.nextInt();
int f = (c*9/5)+32;

System.out.println("The temperature in fahrenheit is "+f);
}
}



// Language: java