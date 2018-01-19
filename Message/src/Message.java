
public class Message 
{

	private int source, destination;
	private String content;
	
	
	public Message()
	{
		source = -1;
		destination = -1;
		content = "";	
	}
	
	public Message(int src, int dst, String cnt)
	{
		if (src >= 4000 && src <= 5000)
		{
			source = src;
		}
		else
		{
			source = -1;
		}

		if (dst >= 4000 && dst <= 5000)
		{
			destination = dst;
		}
		else
		{
			destination = -1;
		}
		
		content = cnt;	
	}
	
	public void sendMessage()
	{
		System.out.println("\n*********************************");
		System.out.println("From user: " + source);
		System.out.println("To user: " + destination);
		System.out.println("--------------------------------");
		System.out.println("Content: "+content);
		System.out.println("*********************************");
	}
	
	
	
	public void setSource(int src)
	{
		source = src;
	}
	
	public int getSource()
	{
		return source;
	}
	
	public void setDestination(int dst)
	{
		destination = dst;
	}
	
	public int getDestination1()
	{
		return destination;
	}
	
	public void setContent(String cnt)
	{
		content = cnt;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public int validateUser(int userN)
	{
		if(userN < 4000 && userN > 5000)
		{
			System.out.println("This number of user is out of range, please type something betweent 4000 and 5000.");
		}
		else
		{
			
		}
		return userN;
	}
	
	
}
