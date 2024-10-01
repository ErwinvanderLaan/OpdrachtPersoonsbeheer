package nl.ErwinvanderLaan;

// Stores the required information fields.
public class Person {
  String name;
  int age;
  String email;
  String city;
  int bsn;
  int phoneNumber;

  // Stores the class constructors.
  public Person(String name, int age, String email, String city, int bsn, int phoneNumber) {
    this.name = name;
    this.age = age;
    this.email = email;
    this.city = city;
    this.bsn = bsn;
    this.phoneNumber = phoneNumber;

  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", email='" + email + '\'' +
            ", city='" + city + '\'' +
            ", bsn=" + bsn +
            ", phoneNumber=" + phoneNumber +
            '}';
  }
}

