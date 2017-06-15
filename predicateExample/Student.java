
public class Student{
	
	private String name;
	private Gender gender;
	private int age;
	
	public Student(String name, Gender gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName(){
		return this.name;
	}
	
	public Gender gender(){
		return this.gender;
	}

	public int getAge(){
		return this.age;
	}

	public String toString(){
		return "Name="+this.name+";Gender="+this.gender+";Age="+this.age;
	}
}
