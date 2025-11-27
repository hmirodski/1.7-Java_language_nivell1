public class OnLineWorker extends Worker {
    private static final double internetFee = 30;


    public OnLineWorker(String name, String surname, double hourPrice) {
        super(name, surname, hourPrice);
    }

    public int calculateSalary(double hourPrice, int hours) {
        return hours * hourPrice + internetFee;
    }



}
