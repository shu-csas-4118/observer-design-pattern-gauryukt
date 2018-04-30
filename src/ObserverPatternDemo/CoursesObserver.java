package ObserverPatternDemo;

import java.util.ArrayList;

public class CoursesObserver implements IObserver {
	
	public CoursesObserver() {}
		
		public void printCourses(Courses courses) {
			  System.out.println("Course name:   " + courses.getCourseName());
		        System.out.println("Course number: " + courses.getCourseNumber());
		        System.out.println("Course credits:" + courses.getCredits());
		        System.out.println("Professor:     " + courses.getProfessor());
		        System.out.println();
		    }
		public void printCourses(ArrayList<Courses> courses) {
	        for (Courses course: courses)
	            printCourses(course);
	    }
		 public void update(Student s) {
		        System.out.println("The student has the following courses:");
		        printCourses(s.getCourses());
		    }

}



