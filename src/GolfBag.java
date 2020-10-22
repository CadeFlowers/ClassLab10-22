import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GolfBag 
{
	private ArrayList<GolfClub> GolfBag;
	
	public GolfBag() 
	{
		this.GolfBag = new ArrayList<GolfClub>();
	}
	
	public GolfBag(String filename) 
	{
		this();
		try 
		{
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
			while(input.hasNext()) 
			{
				this.GolfBag.add(new GolfClub(input.nextLine()));
			}
			input.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
