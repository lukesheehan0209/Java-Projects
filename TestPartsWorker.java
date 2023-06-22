// TestPartsWorker class
public class TestPartsWorker {
    public static void main(String[] args) {
        PartsWorker worker1 = new PartsWorker("John", "Doe", "123-45-6789", 5.0, 20, 50.0, 25);

        System.out.printf("%s%nEarnings: €%.2f%n%n", worker1, worker1.earnings());

        PartsWorker worker2 = new PartsWorker("Jane", "Smith", "987-65-4321", 4.0, 30, 40.0, 20);

        System.out.printf("%s%nEarnings: €%.2f%n%n", worker2, worker2.earnings());
    }
}