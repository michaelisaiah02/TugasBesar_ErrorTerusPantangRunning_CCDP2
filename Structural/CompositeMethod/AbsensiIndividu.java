package compositemethod;

public class AbsensiIndividu implements AbsensiComponent {
    private String namaGuru;

    public AbsensiIndividu(String namaGuru) {
        this.namaGuru = namaGuru;
    }

    @Override
    public void doAbsensi() {
        System.out.println("Absensi untuk guru: " + namaGuru);
    }
}
