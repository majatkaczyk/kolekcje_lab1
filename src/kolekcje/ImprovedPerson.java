package kolekcje;
import java.util.ArrayList;
import java.util.Objects;

public class ImprovedPerson extends Person{
    public ImprovedPerson(String first_name, String last_name, int birthYear) throws PersonException {
        super(first_name, last_name, birthYear);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImprovedPerson person = (ImprovedPerson) o;
        return getBirthYear() == person.getBirthYear() && getFirstName().equals(person.getFirstName()) && getLastName().equals(person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getBirthYear());
    }
}








