package ObserverPatternDemo;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Student student = new Student("Yukti", "Gaur", 123456, "yukti.gaur@student.shu.edu");
		
		Courses ENG1 = new Courses("SoftwareENgineering", 4117, 3, "Thomas Marlowe");
		Courses ENG2 = new Courses("SoftwareENgineering", 4117, 3, "Garett Chang");
		
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		CoursesObserver coursesObserver = new CoursesObserver();
		EmailObserver emailObserver = new EmailObserver();
		
		student.attachObserver("idNumber",idObserver);
		student.attachObserver("firstName",firstNameObserver);
		student.attachObserver("courses",coursesObserver);
		student.attachObserver("email",emailObserver);
		
		student.setFirstName("Yukti");
		student.setIdNumber(543210);
		student.setEmail("yukti.gaur@student.shu.edu");
		student.addCourses(ENG1);
		student.addCourses(ENG2);
		student.removeCourse(ENG1);
		
	}

}
