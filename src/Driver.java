import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		GolfClub A = new GolfClub("Putter", 20);
		A.display();
		GolfBag myBag = new GolfBag("input.dat");
		System.out.println(myBag);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in distance:");
		String answer = input.nextLine();
		input.close();
		System.out.println(answer);
		//GolfClub answer = myBag.findBestClub(input);
	}
}