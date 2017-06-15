import java.util.function.Predicate;

public class StudentPredicates{

	public Predicate<Student> isAdult(){
		return s -> s.getAge() >= 18;
	}

}
