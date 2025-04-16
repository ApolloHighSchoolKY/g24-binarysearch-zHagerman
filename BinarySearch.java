import java.util.Arrays;

public class BinarySearch
{
	
	public static int binarySearch(int[] ray, int item)
	{
		
		int bottom = 0;
		int top  = ray.length-1;
		int middle = ray[(bottom + top)/2];
		
		while(bottom <= top)
		{
		middle = ray[(bottom + top)/2];
		if(middle < item)
		{
			bottom = ((bottom + top)/2)+1;
			
		}
		else if(middle > item)
		{
			top = ((bottom + top)/2)-1;
			
		}
		else if(middle == item)
		{
			return (bottom + top)/2;
		}
		}
		return -1;
	}
}
