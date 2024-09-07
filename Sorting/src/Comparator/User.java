package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class User {
	public int age;
	public String name,email;

	public User(String name, int age,String email) {
		this.name = name;
		this.age = age;
		this.email =email;
	}

	@Override
	public String toString() {
		return "User age = " + age + ", name=" + name + ", email =" + email + " ";
	}

	
}
