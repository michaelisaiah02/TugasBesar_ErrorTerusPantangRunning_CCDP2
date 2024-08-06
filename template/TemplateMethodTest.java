package template;

public class TemplateMethodTest {
    public static void main(String[] args) {
        AbsensiGuru guruTetap = new GuruTetap();
        guruTetap.absen();

        System.out.println();

        AbsensiGuru guruHonorer = new GuruHonorer();
        guruHonorer.absen();
    }
}
