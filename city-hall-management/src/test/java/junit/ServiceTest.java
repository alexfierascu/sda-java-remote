package junit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import model.LivingAddress;
import model.Person;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import service.Platform;

public class ServiceTest {


  @Test
  @Disabled
  public void checkThatAPersonCanBeAdded() {
    String nume = "MIHAI";
    String cnp = "1900731330675";
    int varsta = 32;
    LivingAddress adresa = new LivingAddress("Strada Cucu", "Iasi");
    String gen = "Masculin";
    Person person = new Person(nume, cnp, varsta, adresa, gen);
    Platform platform = new Platform();
    platform.personsAdd(person);
    //todo
    //assertTrue(Arrays.asList(platform).contains(person1)); ?? why is not working :((
    // assertThat(platform, hasItem(person1));
    //assertThat(hasItemInArray(person1));
  }

  @Test
  public void checkThatAPersonCanBeFound() {
    String nume1 = "MIHAI";
    String cnp1 = "1900731330675";
    int varsta1 = 32;
    LivingAddress adresa1 = new LivingAddress("Strada Cucu", "Iasi");
    String gen1 = "Masculin";
    Person person1 = new Person(nume1, cnp1, varsta1, adresa1, gen1);
    Platform platform = new Platform();
    platform.personsAdd(person1);
    Person person = platform.personFind("MIHAI");
    assertNotNull(person);
  }

  @Test
  public void checkThatAPersonCannotBeFoundWhenNotAddedToThePlatform() {
    Platform platform = new Platform();
    Person person = platform.personFind("MIHAI");
    assertNull(person);
  }

  @Test
  public void checkThatAPersonCannotBeFoundWhenSearchedByADifferentName() {
    String nume1 = "MIHAI";
    String cnp1 = "1900731330675";
    int varsta1 = 32;
    LivingAddress adresa1 = new LivingAddress("Strada Cucu", "Iasi");
    String gen1 = "Masculin";
    Person person1 = new Person(nume1, cnp1, varsta1, adresa1, gen1);
    Platform platform = new Platform();
    platform.personsAdd(person1);
    Person person = platform.personFind("MIHAITZA");
    assertNull(person);
  }
}
