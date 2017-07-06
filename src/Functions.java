import java.net.InetAddress;
import java.net.UnknownHostException;

public class Functions{

   public static void main(String[] args){

	InetAddress ip;
	try {

		ip = InetAddress.getLocalHost();
		String thisip = ip.getHostAddress();
		String[] tempoctet = {"","","",""};
		System.out.println("Current IP address : " + thisip);
		int cur = 0;
		for(int i=0; i<thisip.length();i++){
			if(thisip.charAt(i) != '.'){
				tempoctet[cur] += thisip.charAt(i);
			}
			else{
				cur++;
			}
		}
		cur = 0;
		
		int[] octet = new int[4];
		for(int i = 0; i<tempoctet.length; i++){
			octet[i] = Integer.parseInt(tempoctet[i]);
		}
		
		printarray(octet);
		
		
	} catch (UnknownHostException e) {
		e.printStackTrace();
	}
   }// end main
   
   public static void printarray(int[] arr){
	   for(int i = 0; i < arr.length; i++){
		   System.out.println(arr[i]);
	   }
   }
   
   public static char getClass(int[] arr){
	   int firstoctet = arr[0];
	   //--------------neeed to write this function------------
   }

}