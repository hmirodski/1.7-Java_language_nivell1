public class Principal {
    public static void main(String[] args) {
        OnSiteWorker onSite = new OnSiteWorker("On site", "On site", 10);
        OnLineWorker onLine = new OnLineWorker("On line", "On line", 10);
        Worker worker = new Worker("Worker", "Worker", 10);

        System.out.println("Worker: " + worker.calculateSalary(10));
        System.out.println("Onsite worker: " + onSite.calculateSalary(10));
        System.out.println("Online worker: " + onLine.calculateSalary(10));
    }
}
