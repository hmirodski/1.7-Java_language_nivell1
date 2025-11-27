public class OnSiteWorker extends Worker {

    private static double petrol;
    
    public OnSiteWorker(String name, String surname, double hourPrice) {
        super(name, surname, hourPrice);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (getHourPrice() * hoursWorked) + petrol;
    }

    public static double getPetrol() {
        return petrol;
    }

    public static void setPetrol(double petrol) {
        OnSiteWorker.petrol = petrol;
    }

    @Deprecated
    public double calculateSalaryOld(int hoursWorked) {
        return getHourPrice() * hoursWorked;
    }

    @Override
    public String toString() {
        return "OnSiteWorker{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", hourPrice=" + getHourPrice() +
                ", petrol=" + petrol +
                '}';
    }





}
