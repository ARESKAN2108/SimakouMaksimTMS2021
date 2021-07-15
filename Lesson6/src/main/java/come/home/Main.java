package come.home;

import come.home.military.MilitaryOffice;
import come.home.persons.Address;
import come.home.persons.Person;
import come.home.registry.PersonRegistry;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //создаем список людей и добавляем их в список регистратуры
        Address mishaAddress = new Address("Беларусь", "Гомель");
        Person misha = new Person(mishaAddress, "Миша", 16, Person.MALE);

        Address nikolayAddress = new Address("Беларусь", "Минск");
        Person nikolay = new Person(nikolayAddress, "Николай", 23, Person.MALE);

        Address maksAddress = new Address("Беларусь", "Гродно");
        Person maks = new Person(maksAddress, "Максим", 24, Person.MALE);

        Address victorAddress = new Address("Беларусь", "Брест");
        Person victor = new Person(victorAddress, "Виктор", 18, Person.MALE);

        Address nastyaAddress = new Address("Беларусь", "Витебск");
        Person nastya = new Person(nastyaAddress, "Настя", 22, Person.FEMALE);

        Address kostyaAddress = new Address("Беларусь", "Могилев");
        Person kostya = new Person(kostyaAddress, "Костя", 23, Person.MALE);

        Address alexandrAddress = new Address("Беларусь", "Минск");
        Person alexandr = new Person(alexandrAddress, "Александр", 26, Person.MALE);

        Person[] conscripts = {misha, nikolay, maks, victor, nastya, kostya, alexandr};
        PersonRegistry personRegistry = new PersonRegistry(conscripts);

        //создаем объект военкомат и делаем запрос на годных людей в данный момент у регистратуры
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        System.out.print("Имена годных призывников от 18 до 27 лет: ");
        System.out.println(militaryOffice.getAllConscripts());

        // Запрос количества призывников в данном городе
        System.out.println(militaryOffice.countConscriptsOfCity("Минск"));

        // запрос количества призывников от 25 до 27 лет
        System.out.println(militaryOffice.countConscriptsByAge(25, 27));

        // запрос количества призывников по имени
        System.out.println(militaryOffice.getConscriptsByName("Александр"));

    }
}
