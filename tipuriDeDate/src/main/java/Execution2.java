import model.Dog;
import model.Student;

public class Execution2 {

  public static void main(String[] args) {
    Dog[] dogs = new Dog[3];
    //dog  - numele array-ului
    //dogs - ce tip de data este? array de Dog

    Student st1 = new Student();
    Student st2 = new Student();

    Student[] students = new Student[3];
    //students  - numele array-ului
    //students - ce tip de data este? array de Student



    //primul element din array -ul de Student este: students[0]
    //al doilea element din array -ul de Student este: students[1]

    //students[0] ? ce tip de data este? ? v1: este de tip Student
    //students[0] ? ce tip de data este? ? v2: este de tip array Student

    //imi creez un array de Student
    Student[] studentsArray = new Student[3];

    //adaug la array un obiect nou de tip Student
    studentsArray[0] = new Student();

    //imi creez un obiect de tip Student
    Student x2 = new Student();

    //adaug la array obiectul creat precedent
    studentsArray[1] = x2;


  }

}
