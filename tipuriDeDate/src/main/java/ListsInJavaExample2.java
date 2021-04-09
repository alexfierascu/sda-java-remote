import java.util.ArrayList;
import java.util.List;
import model.Student;

public class ListsInJavaExample2 {

  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();
    Student student4 = new Student();
    student1.setNumeStudent("Popescu");
    student2.setNumeStudent("Leordescu");
    student3.setNumeStudent("Patrunjalescu");
    student4.setNumeStudent("Conopidescu");

    List<String> numeleElevilorDinClasaMea = new ArrayList<>();
    //List<tip_de_data> numele_listei = new tipul_de_lista<>()

    List<Student> eleviiEminenti = new ArrayList<>();
    eleviiEminenti.add(student1);
    eleviiEminenti.add(student2);
    eleviiEminenti.add(student3);
    eleviiEminenti.add(student4);

    for (Student eminent : eleviiEminenti) {
      System.out.println(eminent.getNumeStudent());
    }
  }

}
