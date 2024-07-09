
public class bölünensayılar {
  public static void main(String[] args) {
	//) 1 ile 100 arasındaki 3'e, 5'e ve her ikisine de bölünebilen sayıları yazdırın
	 int i;
	  for(i=1;i<=100;i++)
	  {
		  if(i % 3 == 0) {
			  System.out.println("3 ile bölünen"+i);
			  
		  }
			 
		  
	  }
	  
	  for(i=1; i<=100; i++) 
	  {
		  if(i % 5 == 0) {
			  System.out.println("5 ile bölünen"+i);
		  }
	  }
	  
	  
	  for(i=1;i<=100;i++)
	  {
		  
		 if(i % 3 == 0 && i % 5 == 0) {
			 System.out.println("3 ve 5 ile bölünen"+i);
			 
		 }
	 }
	  
	  
}
}
