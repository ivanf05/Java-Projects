import java.util.*;
class classlessAddressing{
	
	public static void main(String args[]){
		//Address 12.24.76.8/8
		//In Binary
		String address[] = {"0","0","0","0","1","1","0","0","0","0","0",
				"1","1","0","0","0","0","1","0","0","1","1","0","0","0","0","0","0","1","0","0","0"};
		//Prefix length
		int n = 8; 
		//Total amount of Addresses
		int total = (int) Math.pow(2, 32-n);
		System.out.println("Total Number of Addresses: "+ total);
		//Sets rightmost bits of address to 0's
		//First Address
		for(int i = 0; i<address.length;i++){
			if(i >= n){
				address[i]= "0";
			}
			
		}
		System.out.println("First Address");
		for(int i = 0; i<address.length;i++){
			System.out.print(address[i]);
		}
		System.out.println("");
		//Sets rightmost bits of address to 1's
		//Last Address
		for(int i = 0; i<address.length;i++){
			if(i >= n){
				address[i]= "1";
			}	
		}
		System.out.println("Last Address");
		for(int i = 0; i<address.length;i++){
			System.out.print(address[i]);
		}
	}
}