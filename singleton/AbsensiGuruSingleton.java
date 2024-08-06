public class AbsensiGuruSingleton {
    private static AbsensiGuruSingleton instance;

    private AbsensiGuruSingleton() {
    }

    public static AbsensiGuruSingleton getInstance() {
        if (instance == null) {
            instance = new AbsensiGuruSingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Absensi Guru Singleton Instance");
    }
}
