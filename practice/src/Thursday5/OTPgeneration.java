package Thursday5;

import java.util.Random;

public class OTPgeneration {
	public static void main(String[] args) {
		Random random=new Random();
		int max=9999;
		int min=1000;
		int otp=random.nextInt(max-min)+min;
		System.out.println(otp);
	}

}
