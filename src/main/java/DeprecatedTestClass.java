public class DeprecatedTestClass {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OnSiteWorker w1 = new OnSiteWorker("USER1", "TEST1", 10);
        OnLineWorker w2 = new OnLineWorker("USER2", "TEST2", 10);

        System.out.println(w1.calculateSalaryOld(10));
        System.out.println(w2.calculateSalaryOld(10));
    }
}
