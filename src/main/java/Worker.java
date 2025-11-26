import java.util.Objects;

public class Worker {
    private String name;
    private String surname;
    private int age;

    public Worker(String name, String surname, int age) {
        this.name = Objects.requireNonNull(name);
        this.surname = Objects.requireNonNull(surname);
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Worker worker)) return false;
        return age == worker.age && Objects.equals(name, worker.name) && Objects.equals(surname, worker.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
