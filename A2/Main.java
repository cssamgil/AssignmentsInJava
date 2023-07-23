public class Main{
  public static void main(String[] args){
    Gradebook myGradebook = new Gradebook();
    Student s = new Student("Ann", "X", 87, 1234567);
    myGradebook.addStudent(s);
    s = new Student("Ann", "X", 91, 1234567);
    myGradebook.addStudent(s);
    s = new Student("Rose", "A", 98, 1234567);
    myGradebook.addStudent(s);
    s = new Student("John", "B", 12, 1234567);
    myGradebook.addStudent(s);
    s = new Student("Alice", "C", 0, 1234567);
    myGradebook.addStudent(s);
    s = new Student("Bob", "D", 67, 1234567);
    myGradebook.addStudent(s);
    s = new Student("Z", "E", 54, 1234567);
    myGradebook.addStudent(s);
    System.out.println(myGradebook.calculateAvg());
    System.out.println(myGradebook.findMedian());
    myGradebook.tabulateStudents();
    
  }
}