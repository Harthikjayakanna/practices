package array;

public class merge {
public static void main(String[] args) {
	int arr1[]= {12,34,54,3,2,4};
	int arr2[]= {34,21,32,45,65,4};
	int index=0;
	int merge[]= new int [arr1.length+arr2.length];
	for(int i=0;i<=merge.length-1;i++) {
		if(i<=arr1.length-1) {
			merge[i]=arr1[i];
			
		}
		else {
			merge[i]=arr2[index];
			index++;
		}
	}
	for(int i=0;i<=merge.length-1;i++) {
	System.out.print(merge[i]+ " ");
}}
}
