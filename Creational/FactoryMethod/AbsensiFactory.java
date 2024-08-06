public class AbsensiFactory {
    public Absensi createAbsensi(String jenisAbsensi) {
        if (jenisAbsensi == null || jenisAbsensi.isEmpty())
            return null;
        switch (jenisAbsensi) {
            case "masuk":
                return new AbsensiMasuk();
            case "keluar":
                return new AbsensiKeluar();
            case "izin":
                return new AbsensiIzin();
            default:
                throw new IllegalArgumentException("Jenis absensi tidak dikenal: " + jenisAbsensi);
        }
    }
}