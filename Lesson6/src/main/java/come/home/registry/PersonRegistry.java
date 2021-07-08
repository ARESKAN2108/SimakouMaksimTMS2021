package come.home.registry;

import come.home.persons.Person;
import java.util.ArrayList;
import java.util.List;


public class PersonRegistry {
    //PersonRegistry содержит список людей (Person), которые могут быть призваны в армию
    private Person[] conscripts;

    public PersonRegistry(Person[] conscripts) {
        this.conscripts = conscripts;
    }

    public Object[] getPeopleAll() {
        List<String> peopleList = new ArrayList<>();
        for (Person person : conscripts) {
           // Address personsAddress = person.getAddress();
            if (person.getAge() >= 18 && person.getAge() <= 27){
                if (person.getSex().equals("Male")){
                    peopleList.add(person.getName());
                }
            }
        }
        return peopleList.toArray();
    }
//        Домашка: 6 урок
//        Необходимо написать военкомат.
//        1) Создаем класс военкомат MilitaryOffice
//        2) Создать в классе MilitaryOffice конструктор, который принимает PersonRegistry
//        3) PersonRegistry содержит список людей (Person), которые могут быть призваны в армию
//        4) Создать класс Person, который будет содержать следующие поля имя, возраст, пол, адрес(страна, город)
//
//        Военкомат должен уметь:
//        a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
//        T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
//        (годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
//        б) вывести количество годных призывников в городе Минске.
//        в) вывести количество призывников от 25 до 27 лет
//        г) вывести количество призывников у которых имя Александр.
//
//        5) Создать класс Main, наполнить PersonRegistry людьми, по желанию можно создавать людей через консоль
}
