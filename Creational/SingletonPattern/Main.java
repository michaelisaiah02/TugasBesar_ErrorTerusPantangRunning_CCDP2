public class Main {
    public static void main(String[] args) {
        // Get the only object available
        AbsensiGuruSingleton instance1 = AbsensiGuruSingleton.getInstance();
        AbsensiGuruSingleton instance2 = AbsensiGuruSingleton.getInstance();

        // Show message
        instance1.showMessage();

        // Check if both instances are the same
        if (instance1 == instance2) {
            System.out.println("Both instances are the same");
        } else {
            System.out.println("Instances are different");
        }
    }
}
