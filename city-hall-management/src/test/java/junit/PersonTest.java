package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import model.LivingAddress;
import model.Person;
import org.junit.jupiter.api.Test;

public class PersonTest {

  @Test
  public void shoudCheckValidCnp() {
    String nume = "MIHAI";
    String cnp = "1900731330675";
    int varsta = 32;
    LivingAddress adresa = new LivingAddress("Strada Cucu", "Iasi");
    String gen = "Masculin";
    Person person1 = new Person(nume, cnp, varsta, adresa, gen);
    String actualMessege = person1.checkIfCNPIsValid(cnp);
    String expectedMessege = "valid";
    assertEquals(actualMessege, expectedMessege);
  }

  @Test
  public void shoudCheckInvalidCnpWithTwelveNumbers() {
    String nume = "MIHAI";
    String cnp = "190073133067";
    int varsta = 32;
    LivingAddress adresa = new LivingAddress("Strada Cucu", "Iasi");
    String gen = "Masculin";
    Person person1 = new Person(nume, cnp, varsta, adresa, gen);
    String actualMessege = person1.checkIfCNPIsValid(cnp);
    String expectedMessege = "invalid";
    assertEquals(actualMessege, expectedMessege);
  }

  @Test
  public void shoudCheckInvalidCnpWithOneNumber() {
    String nume = "MIHAI";
    String cnp = "1";
    int varsta = 32;
    LivingAddress adresa = new LivingAddress("Strada Cucu", "Iasi");
    String gen = "Masculin";
    Person person1 = new Person(nume, cnp, varsta, adresa, gen);
    String actualMessege = person1.checkIfCNPIsValid(cnp);
    String expectedMessege = "invalid";
    assertEquals(actualMessege, expectedMessege);
  }
}
