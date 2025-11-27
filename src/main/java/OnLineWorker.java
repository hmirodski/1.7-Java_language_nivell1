public class OnLineWorker extends Worker {
    private static final double INTERNET_FEE = 30.0;


    public OnLineWorker(String name, String surname, double hourPrice) {
        super(name, surname, hourPrice);
    }


    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + INTERNET_FEE;
    }

    @Deprecated
    public double calculateSalaryOld(int hoursWorked) {
        return getHourPrice() * hoursWorked;
    }





}
