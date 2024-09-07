package Thursday11;

public class Diamond {
	public static void main(String[] args) {
		int n=9;
		int mid=n/2+1;
		int space=n/2;
		int star=1;
		for(int i=1;i<=n;i++) {
			int center=star/2+1;
			int h=1;
			for(int j=0;j<=space;j++) {
			    System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				
			    if(center>h) {
			    	System.out.print(center--);
			    }
			    else {
			    	System.out.print(center++);
			    	h++;
			    }
			    
			}
			System.out.println(" ");
			if(i<mid) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
			}
		}
	}

}
