
public class Arrays {

	public static void main(String[] args) {
		 int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		 arrayprint(a);
		 
		 System.out.println();
		 
		 arrayswap(a);
		 
		 arrayprint(a);
	
	}
	
	public static void arrayprint(int[] a) {
		for (int x=0;x<a.length;x++)
			 System.out.print(a[x]+" " );
		
	}
	
	public static int[] arrayswap(int[] a) {
		 for(int x=0;x<a.length/2;x++) 
		 {
			 a[x]=a[x]+a[a.length-(x+1)]; 				 // x = x + y;  x now becomes 10 
			 a[a.length-(x+1)]=a[x]-a[a.length-(x+1)]; 		 //y = x - y; // y becomes 10 
			 a[x]=a[x]-a[a.length-(x+1)];  				 //x = x - y
		 }
		 return a;
	}
		 
		 
}



