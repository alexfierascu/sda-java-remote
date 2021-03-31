package model;

import java.util.Locale;

public class LivingAddress {

  private String address;
  private String city;

  public LivingAddress(String address, String city) {
    this.address = address.toLowerCase(Locale.ROOT);
    this.city = city.toLowerCase(Locale.ROOT);
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getAddress() {
    return address.toLowerCase(Locale.ROOT);
  }

  public String getCity() {
    return city.toLowerCase(Locale.ROOT);
  }

  @Override
  public String toString() {
    return "Domiciliu{" +
        "address='" + address + '\'' +
        ", city='" + city + '\'' +
        '}';
  }
}
