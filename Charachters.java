package Guvi;
import java.util.Scanner;
public class Charachters {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Number of characters");
System.out.println("Enter the line");
String a=s.nextLine();
int count=0;
for(int i=0;i<a.length();i++)
{
	if((a.charAt(i)>='a' && a.charAt(i)<='z') || (a.charAt(i)>='A' && a.charAt(i)<='Z'))
	{
		count++;
	}
}
System.out.println("Number of characters : "+count);
	}

}
