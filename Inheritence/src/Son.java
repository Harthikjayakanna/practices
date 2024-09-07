class Son extends Father {
	 String firstname; 
	 String school;

	@Override
	public String toString() {
		return "Son [firstname=" + firstname + ", school=" + school + ", name=" + name + ", age=" + age + ", address="
				+ address + "]";
	}

	public static void main(String[] args) {
		Father s = new Son();
		s.setAge(45);
		Son son=new Son();
		son.setAge(34);
		System.out.println(son.getAge());
		son.setName("Jerold");
		son.setName("Durai");
		System.out.println(son.getName());
		System.out.println(son);

	}

}
