import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ObjectINtSeparation {
	public static void main(String[] args) {
		Object ab[]= {"Jerold",12,19,15,12,34,35,23,"23",false,0b101};
		ArrayList<Integer> abc=new ArrayList<Integer>();
		for(int i=0;i<ab.length;i++) {
			if(ab[i] instanceof Integer) {
				abc.add((Integer) ab[i]);
			}
		}
		for(int a:abc) {
			int count=0;
			for(int b:abc) {
				if(a==b)
					count++;
			}
			if(count==1)
				System.out.print(a+" ");
		}
		}

}
