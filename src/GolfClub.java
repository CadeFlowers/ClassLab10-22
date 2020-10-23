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
	public int searchDistance(int x) 
	{
		if(distance == x) 
		{
			return this.distance;
		}
		else 
		{
		return 0; 
		}
	} 
	public void display() 
	{
		System.out.println("Name:" + name + "  Distance:" + distance);
	}
}
