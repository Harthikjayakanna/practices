package Pattern;

public class right_tri_0_1 {
public static void main(String[] args) {
	int n=5; int num=1; char ch='a';
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j<=i) {
//				System.out.print(num);
				ch++;
				if(j%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
		}
//		if(num==1) {
//			num--;
//		}
//		else {
//			num++;
//		}
		System.out.println(" ");
	}
}
}
