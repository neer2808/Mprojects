import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Student {
  private int rollno;  // instance variable
  private String name;
  int marks[]; // declaration

  public Student() {
    Scanner s = new Scanner(System.in);
    rollno = s.nextInt();
    s.nextLine();
    name = s.nextLine();
    marks = new int[5];
    for (int i = 0; i < marks.length; i++) {
      marks[i] = s.nextInt();
    }
  }

  public static void display() {

    Student arr1[] = new Student[2];
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = new Student();
    }

    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i].rollno);
      System.out.println(arr1[i].name);
      for (int j = 0; j < arr1[i].marks.length; j++) {
        System.out.println(arr1[i].marks[j]);
      }
    }
  }
}
public class Demo1 {
  public static void main(String[] args) {
   Student.display();
  }

}
