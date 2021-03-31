package model;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

  private String name;
  private String cnp;
  private int age;
  private LivingAddress living;
  private String gender;

  public Person(String name, String cnp, int age, LivingAddress living, String gender) {
    this.name = name;
    this.age = age;
    this.living = living;
    if (isCnpValid(cnp)) {
      this.cnp = cnp;
    } else {
      System.out.println("CNP-ul nu este valid");
    }
    this.gender = gender;
  }

  public void setLivingAddress(String address) {
    this.living.setAddress(address);
  }

  public void setLivingCity(String city) {
    this.living.setCity(city);
  }

  public String getGender() {
    return gender;
  }

  public String returnCity() {
    return living.getCity().toLowerCase(Locale.ROOT);
  }

  public String getName() {
    return name;
  }

  public String getCnp() {
    return cnp;
  }

  public int getAge() {
    return age;
  }

  public LivingAddress getLiving() {
    return living;
  }

  private boolean isCnpValid(String cnp) {
    Pattern pattern = Pattern.compile(
        "^[1-9]\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])(0[1-9]|[1-4]\\d|5[0-2]|99)(00[1-9]|0[1-9]\\d|[1-9]\\d\\d)\\d$");
    Matcher matcher = pattern.matcher(cnp);
    return matcher.matches();
  }

  public String checkIfCNPIsValid(String cnp) {
    String result;
    if (isCnpValid(cnp)) {
      result = "valid";
    } else {
      result = "invalid";
    }
    return result;
  }

  @Override
  public String toString() {
    return "Person{" +
        "nume='" + name + '\'' +
        ", cnp='" + cnp + '\'' +
        ", varsta=" + age +
        ", domiciliu=" + living +
        '}';
  }

}
