package come.home.persons;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Person {
    public static final String MALE = "Male";
    public static final String FEMALE = "Female";

    private Address address;
    private String name;
    private int age;
    private String sex;


    public Person(Address address, String name, int age, String sex) {
        this.address = address;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
