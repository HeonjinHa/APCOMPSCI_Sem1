import java.util.*;
public class Toyota extends Car
{
	public Toyota(String coordinates)
	{
		super();
		this.move(Double.parseDouble(coordinates.split(",")[0]), Double.parseDouble(coordinates.split(",")[1]));
	}
}
