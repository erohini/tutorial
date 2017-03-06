package enumeration;

public enum Student {
	Student1(11), Student2(10), Student3(13), Student4(9);
	 private int age;                 
	 
	 public int getAge() {
		return age;
	}

	Student(int age)
	 {
	  this.age= age;
	 }
}
