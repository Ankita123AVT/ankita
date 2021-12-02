package starpatten;

public class Star_pattern5 
{         
	        //*
	        //**	
			//***	
			//****	
	public static void main(String[] args) 
	{
		int star=1;
		//1<=4   
		for(int i=1; i<=4; i++) 
		{            //1<=1   2
			for(int j=1; j<=star; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star++;     
		}
			
	}		
	
}

