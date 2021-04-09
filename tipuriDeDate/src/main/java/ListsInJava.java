import java.util.ArrayList;
import java.util.List;

public class ListsInJava {

  public static void main(String[] args) {
    List<String> numeleElevilorDinClasaMea = new ArrayList<>();
    //numeleElevilorDinClasaMea?  ce tip de data? lista de String-uri
    //stefan ? ce tip de data este? String
    String cristi = "Cristi1";
    String stefan = "Cristi2";
    String marcel = "Cristi3";
    String aurel = "Cristi4";
    String vasile = "Cristi5";
    String dorel = "Cristi6";

    numeleElevilorDinClasaMea.add(cristi);
    numeleElevilorDinClasaMea.add(stefan);
    numeleElevilorDinClasaMea.add(marcel);
    numeleElevilorDinClasaMea.add(aurel);
    numeleElevilorDinClasaMea.add(vasile);
    numeleElevilorDinClasaMea.add(dorel);
    numeleElevilorDinClasaMea.add("frasinica");

    for(String dsadsadas: numeleElevilorDinClasaMea) {
      System.out.println(dsadsadas);
    }
  }

}
