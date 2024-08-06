package strategymethod;

public class AbsensiIzin implements AbsensiStrategy {
    @Override
    public void doAbsensi() {
        System.out.println("Absensi Izin berhasil!");
    }
}
