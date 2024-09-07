package Leetcode;

public class LCMofArray {
	static void lcmofarray(int []arr) {
		int lcm=1;
		int diviser=2;
		while(true) {
			int counter=0;
			boolean divisible=false;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0)
				{
					System.out.println("Lcm is 0");
					return;
				}
				else if(arr[i]<0)
					arr[i]*=-1;
				if(arr[i]==1)
					counter++;
				
				//checking condition
				if(arr[i]%diviser==0) {
					arr[i]/=diviser;
					divisible=true;
				}		
			}//for loop
			
			if(divisible)
				lcm*=diviser;
			else
				diviser++;
			if(counter==arr.length) {
				System.out.println("LCM is "+lcm);
				return;
			}		
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,3,5,20};
		lcmofarray(arr);
	}

}
