package starpatten;

public class star_pattern7 
{
    //******	
	//*****	
	//****
	//***
	//**
	//*
	
 public static void main(String[] args) 
  {
	 int star=6;	
	 for(int i=1; i<=6; i++) 
	 {
		 for(int j=1; j<=star; j++) 
		  {
			 System.out.print("*");
		  }
		 System.out.println();
		 star--;
     }
  }
}
