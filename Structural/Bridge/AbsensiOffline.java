package Structural.Bridge;

public class AbsensiOffline implements Absensi {
    @Override
    public void absensi(String namaGuru) {
        System.out.println("Absensi offline untuk guru: " + namaGuru);
    }
}