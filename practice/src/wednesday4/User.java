package wednesday4;

import java.util.ArrayList;
import java.util.List;

public class User {
         String name;
         int age;
		public User(String name, int age) {
			this.name = name;
			this.age = age;
		}
        public static void main(String[] args) {
			User u1=new User("jerold",34);
			User u2=new User("Raja",23);
			ArrayList<User> al=new ArrayList<User>();
			al.add(u1);al.add(u2);
			String ame=" ";
			
			for(User u:al) {
				ame+=u.name+" ";
			}
			System.out.println(ame);
		} 
}
