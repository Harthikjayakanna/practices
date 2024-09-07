package array;

public class insert {
public static void main(String[] args) {
	int arr[]= {12,23,43,45,76,8,90};
	int index=0;
	int data=24;
	int in=2;
	int net[]=new int [arr.length +1];
	
	for(int i=0;i<=arr.length-1;i++) {
		if(i==in) {
			net[i]=data;
		}
		else
		{
			net[i]=arr[index];
			index++;
		}
	}
	for(int i=0;i<=net.length-1;i++) {
		System.out.println(net[i]);
	}
}
}
