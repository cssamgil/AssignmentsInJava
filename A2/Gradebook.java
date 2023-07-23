import java.util.*;
public class Gradebook{
  private ArrayList<Student> list;
  //private Student[] list;
  public void addStudent(Student aStudent){
    list.add(aStudent);
    //list[currentSize] = aStudent;
    //currentSize++;
  }
  public Gradebook(){
    list = new ArrayList<Student>();
  }
  public void tabulateStudents(){
    /*for(int i = 0; i < list.size();i++)
      System.out.println(list.get(i).getFirstName()
                         + "\t" +
                         list.get(i).getLastName()
                         + "\t" + 
                         list.get(i).getScore()
                         + "\t" + 
                         list.get(i).getPID());*/
      //System.out.println(list.get(i).getInfo());
    for(Student s: list)
     System.out.println(s.getInfo());
  }
  public double calculateAvg(){
    if(list.size() == 0)
      return 0.0;
    double sum = 0;
    for(Student s: list)
      sum = sum + s.getScore();
    return sum / list.size();
  }
  public int findMedian(){
    if(list.size() == 0)
      return 0;
    int[] scoreList = new int[list.size()];
    int i = 0;
    for(Student s: list)
      scoreList[i++] = s.getScore();
    Arrays.sort(scoreList);
    return scoreList[list.size()/2];
  }
}