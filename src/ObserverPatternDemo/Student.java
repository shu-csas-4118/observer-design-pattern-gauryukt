package ObserverPatternDemo;

import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ObserverManager observers;
	private ArrayList<Courses> courses = new ArrayList<>();
	
	public Student(String firstName, String lastName, int idNumber, String email)
			{
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
		this.observers = new ObserverManager();
	}
	
	public Student() {
		this.observers = new ObserverManager();
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		notifyAllObservers("firstName");
	}
	

	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		notifyAllObservers("idNumber");
	}	
	


	public void setEmail(String email) {
		this.email = email;
		notifyAllObservers("email");
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void attachObserver(String Type, IObserver observer) {
		this.observers.addIObserver(Type, observer);
	}
	
	public void addCourses(Courses courses) {
		  if (courses.indexOf(courses) < 0) {
	            courses.add(courses);
	            notifyAllObservers("courses");
	        }
	    }
	public void removeCourse(Courses courses) {
	    if (courses.indexOf(courses) > -1) {
            courses.remove(courses);
            notifyAllObservers("courses");
        }
    }
	public ArrayList<Courses> getCourses(){
		 return this.courses;
	}
	
	
	
	public void notifyAllObservers(String Type) {
		observers.notifyAllObservers(Type, this);
		}
	}
	
	
