public class Guru {
    private String nama;

    public Guru(String nama) {
        this.nama = nama;
    }

    public void absensi() {
        System.out.println("Guru " + nama + " melakukan absensi.");
    }
}