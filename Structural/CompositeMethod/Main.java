package CompositeMethod;

public class Main {
    public static void main(String[] args) {
        AbsensiIndividu guru1 = new AbsensiIndividu("Guru A");
        AbsensiIndividu guru2 = new AbsensiIndividu("Guru B");
        AbsensiIndividu guru3 = new AbsensiIndividu("Guru C");

        AbsensiGrup grup1 = new AbsensiGrup();
        grup1.add(guru1);
        grup1.add(guru2);

        AbsensiGrup grup2 = new AbsensiGrup();
        grup2.add(grup1);
        grup2.add(guru3);

        System.out.println("Absensi Grup 1:");
        grup1.doAbsensi();

        System.out.println("\nAbsensi Grup 2:");
        grup2.doAbsensi();
    }
}
