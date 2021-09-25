package largest;

import org.testng.annotations.Test;

@Test
public class Largest {
	
	
	
	int arr[] = {2,3,66,4,77,8,70};
	int g = 0;
	int s = 0;
	
	{
	
	for(int i = 0 ; i<arr.length; i++)
	{
		if(g<arr[i])
		{
			s = g;
			g=arr[i];
		}
		if(g>arr[i] && s<arr[i])
		{
			s = arr[i];
		}
	}

	System.out.println("++++++++++++++++++"+s +" "+g);
		}
	
}



