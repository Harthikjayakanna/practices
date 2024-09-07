package Leetcode;

public class GarbageCollections {
	static void Travel(String garbage[],int travel[]) {
		
//		int travel=0;
//		for(String garb : gar) {
//			int pickup=0;
//			for(int i=0;i<garb.length();i++) {
//				char ch=garb.charAt(i);
//				pickup++;
//				
//			}
//		}
		int n = garbage.length;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += 3 * travel[i];
        }
        for (String s : garbage) {
            ans += s.length();
        }
        for (int i = n - 1; i > 0; i--) {
            if (!garbage[i].contains("G")) {
                ans -= travel[i - 1];
            } else {
                break;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (!garbage[i].contains("P")) {
                ans -= travel[i - 1];
            } else {
                break;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (!garbage[i].contains("M")) {
                ans -= travel[i - 1];
            } else {
                break;
            }
        }
        System.out.println(ans);
	}
	public static void main(String[] args) {
		String garbage[]= {"G","P","MM"};
		int travel[]= {2,4};
		Travel(garbage,travel);
	}

}
