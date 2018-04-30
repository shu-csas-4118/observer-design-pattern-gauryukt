package ObserverPatternDemo;

public class Courses {
	private String CourseName;
	 private int CourseNumber;
	 private int Credits;
	 private String Professor;
	 
   public Courses(String coursename, int coursenumber, int credits, String prof) {
	   CourseName = coursename;
	   CourseNumber = coursenumber;
	   Credits = credits;
	   Professor = prof;
   }
   public String getCourseName() {
	   return CourseName;
   }
   public void setCourseName(String CourseName) {
       this.CourseName = CourseName;
   }
   
   public int getCourseNumber() {
       return CourseNumber;
   }
   public void setCourseNumber(int courseNumber) {
       this.CourseNumber = courseNumber;
   }
   public int getCredits() {
       return Credits;
   }
   public void setCredits(int credits) {
       this.Credits = credits;
   }
   public String getProfessor() {
       return Professor;
   }

   public void setProfessor(String professor) {
       this.Professor = professor;
   }
public int indexOf(Courses courses) {
	// TODO Auto-generated method stub
	return 0;
}
public void add(Courses courses) {
	// TODO Auto-generated method stub
	
}
public void remove(Courses courses) {
	// TODO Auto-generated method stub
	
}
   
   
}
