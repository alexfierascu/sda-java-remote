public class ArraysInJava {

  public static void main(String[] args) {
    String[] numeleElevilorDinClasa = new String[6];

    String cristi = "Cristi";
    String stefan = "Cristi";
    String marcel = "Cristi";
    String aurel = "Cristi";
    String vasile = "Cristi";
    String dorel = "Cristi";
    numeleElevilorDinClasa[0] = cristi;
    numeleElevilorDinClasa[1] = stefan;
    numeleElevilorDinClasa[2] = marcel;
    numeleElevilorDinClasa[3] = aurel;
    numeleElevilorDinClasa[4] = vasile;
    numeleElevilorDinClasa[5] = dorel;

    for(int i=0;i<numeleElevilorDinClasa.length;i++) {
      System.out.println(numeleElevilorDinClasa[i]);
    }
  }

}
