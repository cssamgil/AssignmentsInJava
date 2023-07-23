public class Student{
  private String firstName;
  private String lastName;
  private int score;
  private int pID;
  public String getInfo(){
    return firstName + "\t" + lastName + "\t" + score + "\t" + pID;
  }
  public String getFirstName(){return firstName;}
  public String getLastName(){return lastName;}
  public int getScore(){return score;}
  public int getPID(){return pID;}
  public Student(String firstName, String lastName, int score, int pID){
    this.firstName = firstName;
    this.lastName = lastName;
    this.score = score;
    this.pID = pID;
  }
}