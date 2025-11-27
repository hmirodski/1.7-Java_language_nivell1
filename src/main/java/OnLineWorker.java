public class OnLineWorker extends Worker {
    private static final double internetFee = 30;


    public OnLineWorker(String name, String surname, double hourPrice) {
        super(name, surname, hourPrice);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + internetFee;
    }

    @Deprecated
    public double calculateSalaryOld(int hoursWorked) {
        return getHourPrice() * hoursWorked;
    }





}
