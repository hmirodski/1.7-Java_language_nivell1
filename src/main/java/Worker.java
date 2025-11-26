import java.util.Objects;

public class Worker {
    private String name;
    private String surname;
    private double hourPrice;

    public Worker(String name, String surname, double hourPrice) {
        this.name = Objects.requireNonNull(name);
        this.surname = Objects.requireNonNull(surname);
        if (hourPrice < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.hourPrice = hourPrice;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Worker worker)) return false;
        return hourPrice == worker.hourPrice && Objects.equals(name, worker.name) && Objects.equals(surname, worker.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, hourPrice);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hourPrice=" + hourPrice +
                '}';
    }
}
