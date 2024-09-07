package Saturday30;

import java.util.Random;

public class OTP {
	public static void main(String[] args) {
		Random ran=new Random();
		int otp=ran.nextInt(8999)+1000;
		System.out.println(otp);
	}

}
