package ObserverPatternDemo;

public class IdNumberObserver implements IObserver {
	
	public IdNumberObserver() {}
	
	public void update(Student s) {
		System.out.println("Student's id number is " + s.getIdNumber());
	}

}
