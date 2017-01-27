import static java.lang.Math.*;
public class User 
{
	private String firstName,lastName, avatar;
	private int userID;

	public User()
	{
		firstName ="";
		lastName ="";
		avatar = "";
		userID = (int)(Math.random() * 10000000) + 1;
	}
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "";
		userID = (int)(Math.random() * 10000000) + 1;
	}
	public User(String fN, String lN, String avt)
	{
		firstName = fN;
		lastName = lN;
		avatar = avt;
		userID = (int)(Math.random() * 10000000) + 1;
	}
	public String getfirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public String getavatar()
	{
		return avatar;
	}
	public int getID()
	{
		return userID;
	}
	public String toString()
	{
		return "Customer Info:\nFirst Name: " + firstName +"\nLast Name: " +lastName+"\nAvatar : " + avatar +"\nUser ID: " +userID;
	}
}