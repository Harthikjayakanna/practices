package Pattern;

public class diamondnum {
public static void main(String[] args) {
	int n=9, star=1,space=n/2;
	
	for(int i=1;i<=n;i++) {
		for(int sp=1;sp<=space;sp++) {
			System.out.print(" ");
		}
		int s=star/2;
		for(int st=1;st<=star;st++) {
			System.out.print(s);
			if(st<=star/2)// 0; 1<=0 F s++ 1;
				// star/2 = 1; 1<=1 T s-- 0; 2<=1 F s++ 1;
				// star/2=2; 
				s--;
			else
				s++;
		}
		if(i<(n/2)+1) {
			star+=2;
			space--;
			s--;
		}
		else {
			star-=2;
			space++;
			s++;
		}
		System.out.println(" ");
	}
}
}
