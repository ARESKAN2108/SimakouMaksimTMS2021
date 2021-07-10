package come.home.military;

import come.home.registry.PersonRegistry;

import java.util.List;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public List<String> getAllConscripts() {
        return personRegistry.getAllСonscripts();
    }

    public int countConscriptsOfCity(String city) {
        return personRegistry.countConscriptsOfCity(city);
    }

    public int countConscriptsByAge(int minAge, int maxAge) {
        return personRegistry.countConscriptsByAge(minAge, maxAge);
    }

    public int getConscriptsByName(String name) {
        return personRegistry.getConscriptsByName(name);
    }
}
