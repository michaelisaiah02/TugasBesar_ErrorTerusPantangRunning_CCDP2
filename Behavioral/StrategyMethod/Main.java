package strategymethod;

public class Main {
    public static void main(String[] args) {
        AbsensiContext context = new AbsensiContext();

        context.setStrategy(new AbsensiMasuk());
        context.executeAbsensi();

        context.setStrategy(new AbsensiKeluar());
        context.executeAbsensi();

        context.setStrategy(new AbsensiIzin());
        context.executeAbsensi();
    }
}
