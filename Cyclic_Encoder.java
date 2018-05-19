import java.util.*;
class Encoder{
	public int a0,a1,a2,a3;
	public int r0,r1,r2;
	public int codeword[]= new int[7];
	//constructor
	Encoder(int a0,int a1,int a2,int a3){
		this.a0=a0;
		this.a1=a1;
		this.a2=a2;
		this.a3=a3;	
	}
	//takes dataword with dividers and preforms divison
	public void generatorEncoder(int a0,int a1,int a2,int a3,int r0,int r1,int r2){
		a0=this.a0;
		a1=this.a1;
		a2=this.a2;
		a3=this.a3;
		this.r0=0;
		this.r1=0;
		this.r2=0;
		int q1,q2,q3,q4;
		
		q1=0;
		q2=0;
		q3=0;
		q4=0;
		int quotients[]={q1,q2,q3,q4};
		// Two copies of dataword one use for divison
		//other is for codeword
		int divisorArray[]={a0,a1,a2,a3};
		int originalCodeword[]={a0,a1,a2,a3};
		//will divided of of these arrays based if loop iteration is even or odd
		int divisor1[] = {1,0,1,1};
		int divisor2 []= {0,0,0,0};
		int j=0;
		while(j !=4){
			System.out.println("Step "+(j+1));
			//quotient is set for index of dataword/divison result 
			quotients[j] = divisorArray[0];
			System.out.println("Quotient "+quotients[j]);
			for(int i = 0;i<3;i++){
				// if j is even the current bits are divided by 1011
				// odd the current bits are divided by 0000
				if(j%2==0){
					System.out.println("First Num: "+divisorArray[i+1]);
					System.out.println("Second Num: "+divisor1[i+1]);
					if(divisorArray[i+1]==0 && divisor1[i+1]==0){
						divisorArray[i]=0;
						System.out.println("XOR value: "+divisorArray[i]);
					}
					//If bits are 1 & 1 than xor result is 0
					else if(divisorArray[i+1]==1 && divisor1[i+1]==1){
						divisorArray[i]=0;
						System.out.println("XOR value: "+divisorArray[i]);
					}
					//If bits are differnet than xor result is 1
					else{
						divisorArray[i]=1;
						System.out.println("XOR value: "+divisorArray[i]);
					}
					
				}	
				else{
					//does same thing but with 0000 divison
					System.out.println("First "+divisorArray[i+1]);
					System.out.println("Second "+divisor2[i+1]);
					if(divisorArray[i+1]==0 && divisor2[i+1]==0){
						divisorArray[i]=0;
						System.out.println("XOR value: "+divisorArray[i]);
					}else if(divisorArray[i+1]==1 && divisor2[i+1]==1){
						divisorArray[i]=0;
						System.out.println("XOR value: "+divisorArray[i]);
					}
					else{
						divisorArray[i]=1;
						System.out.println("XOR value: "+divisorArray[i]);
					}
				}
				
			}
			
		
			j++;
			// prints divison result
			System.out.print("Division Result: ");
			for(int e=0;e<3;e++){
				System.out.print(divisorArray[e]);
			}
			System.out.println();
			System.out.println();
			//carries down zero everytime
			divisorArray[3]=0;
		}
		//Remainder is final divsion result
		System.out.println("Remainder: ");
		for(int e=0;e<3;e++){
			System.out.print(divisorArray[e]);
		}
		System.out.println();
		//Appends orginal dataword to remaineder
		//which is dataword
		for(int e=0;e<=3;e++){
			codeword[e]= originalCodeword[e];
		}
		for(int e=0;e<3;e++){
			
			codeword[e+4]= divisorArray[e];
		}
		System.out.println();
	}
	public void printCodeword(){
		//prints codeword
		System.out.println("Codeword: ");
		for(int e=0;e<7;e++){
			System.out.print(codeword[e]);
		}
		
	}
}
class Cyclic_Codes{
	
	public static void main(String args[]){
		//passes dataword onto encoder
		Encoder e = new Encoder(1,0,0,1);
		//passes dataword to encoder with dividers
		e.generatorEncoder(1,0,0,1,0,0,0);
		//prints encoder codeword
		e.printCodeword();
	
	}
	
	
}