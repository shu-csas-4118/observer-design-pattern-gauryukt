package ObserverPatternDemo;

public class EmailObserver implements IObserver{
   public EmailObserver() {}
   public void update(Student s) {
       System.out.println("The student's email address is " + s.getEmail());
   }
}
