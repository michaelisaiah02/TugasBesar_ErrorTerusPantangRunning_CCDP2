public class Main {
    public static void main(String[] args) {
        Absensi absensiOnline = new AbsensiOnline();
        Absensi absensiOffline = new AbsensiOffline();

        Guru guru1 = new GuruMatematika(absensiOnline);
        Guru guru2 = new GuruMatematika(absensiOffline);

        guru1.lakukanAbsensi();
        guru2.lakukanAbsensi();
    }
}