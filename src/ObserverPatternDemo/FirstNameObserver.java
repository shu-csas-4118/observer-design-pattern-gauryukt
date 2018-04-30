package ObserverPatternDemo;

public class FirstNameObserver implements IObserver {
	
	public FirstNameObserver() {}
	
	public void update(Student s) {		
		System.out.println("Student's first name is " + s.getFirstName());
	}
}
