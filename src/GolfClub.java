public class GolfClub 
{
	private String name;
	private int distance;
	
	public GolfClub(String name, int distance) 
	{
		this.name = name;
		this.distance = distance;	
	}
	public GolfClub(String s) 
	{
		String[] parts = s.split(":");
		this.name = parts[0];
		this.distance = Integer.parseInt(parts[1]);		
	}
	public searchDistance(string x) 
	{
		return this.distance.indexOf(x)
	}
	public void display() 
	{
		System.out.println("Name:" + name + "  Distance:" + distance);
	}
}
