package service;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import model.Person;

public class Platform {

  private Person[] personArray;
  int freeIndex;

  public Platform() {
    personArray = new Person[5];
    freeIndex = 0;
  }

  public void elementsDisplay() {
    for (Person person : personArray
    ) {
      System.out.println(person);
    }
  }

  public void personsAdd(Person person) {
    if (freeIndex < personArray.length) {
      personArray[freeIndex] = person;
      freeIndex++;
    } else {
      System.out.println("No more space in the platform");
    }
  }

  public Person personFind(String name) {
    if (personArray.length == 0 || personArray == null) {
      return null;
    }
    for (int i = 0; i < personArray.length; i++) {
      if (personArray[i] == null) {
        return null;
      } else {
        if (personArray[i].getName().contains(name)) {
          return personArray[i];
        } else {
          return null;
        }
      }
    }
    return null;
  }

  public int personsUnder18() {
    int counter = 0;
    for (Person persone : personArray) {
      if (persone.getAge() >= 18) {
        counter++;
      }
    }
    return counter;
  }

  public Person[] personsArrayByAge(int age) {
    int size = personsUnder18();
    Person[] persons = new Person[personArray.length];
    for (int i = 0; i < personArray.length; i++) {
      if (personArray[i].getAge() >= age) {
        persons[i] = personArray[i];
      }
    }
    return persons;
  }

  public int numberOfPersonsLivingInCity(String oras) {
    int contor = 0;
    for (int i = 0; i < personArray.length; i++) {
      if (personArray[i].getLiving().getCity().contains(oras.toLowerCase(Locale.ROOT))) {
        contor++;
      }
    }
    return contor;
  }

  //
  public String numberOfPersonsByGender(String sex) {
    int contorFeminin = 0;
    int contorMasculin = 0;
    for (int i = 0; i < personArray.length; i++) {
      if (personArray[i].getGender().equals(sex.toLowerCase(Locale.ROOT))) {
        contorFeminin++;
      } else {
        contorMasculin++;
      }
    }
    String contor = contorFeminin + " persoane de sex feminin si " + contorMasculin
        + " persoane de sex masculin";
    return contor;
  }

  public void editPerson(Person persoana) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Indtrodu noua adresa: ");
    String newAddress = scanner.nextLine();
    System.out.println("Introdu noul oras: ");
    String newCity = scanner.nextLine();
    for (int i = 0; i < personArray.length; i++) {
      if (personArray[i] == persoana) {
        if (newAddress.length() > 2) {
          personArray[i].setLivingAddress(newAddress);
        } else if (newCity.length() > 2) {
          personArray[i].setLivingCity(newCity);
        }
      }
    }
  }

  @Override
  public String toString() {
    return "Platform{" +
        "personArray=" + Arrays.toString(personArray) +
        '}';
  }
}
