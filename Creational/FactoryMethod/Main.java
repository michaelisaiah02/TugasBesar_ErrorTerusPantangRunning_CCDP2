public class Main {
    public static void main(String[] args) {
        AbsensiFactory absensiFactory = new AbsensiFactory();

        Absensi absensiMasuk = absensiFactory.createAbsensi("masuk");
        absensiMasuk.doAbsensi();

        Absensi absensiKeluar = absensiFactory.createAbsensi("keluar");
        absensiKeluar.doAbsensi();

        Absensi absensiIzin = absensiFactory.createAbsensi("izin");
        absensiIzin.doAbsensi();
    }
}