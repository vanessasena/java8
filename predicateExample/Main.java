import java.util.ArrayList;
import java.util.Arrays;

public class Main{

	public static void main(String[] args){

		Student s1 = new Student("Sarah", Gender.FEMALE, 16);
		Student s2 = new Student("Peter", Gender.MALE, 20);
		Student s3 = new Student("Emma", Gender.FEMALE, 19);
		Student s4 = new Student("Amanda", Gender.FEMALE, 20);
		Student s5 = new Student("John", Gender.MALE, 16);

		ArrayList<Student> students = new ArrayList<>();
		students.addAll(Arrays.asList(new Student[]{s1, s2, s3, s4, s5}));

		StudentPredicates predicates = new StudentPredicates();
		students.stream().filter(predicates.isAdult()).forEach(s->System.out.println(s));
	}
}
