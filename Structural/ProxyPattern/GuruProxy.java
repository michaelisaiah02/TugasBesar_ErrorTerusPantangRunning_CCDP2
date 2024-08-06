public class GuruProxy implements Guru {
    private GuruTetap guruTetap;

    @Override
    public void hadir() {
        if (guruTetap == null) {
            guruTetap = new GuruTetap();
        }
        System.out.println("Proxy: Melakukan beberapa hal sebelum guru hadir.");
        guruTetap.hadir();
        System.out.println("Proxy: Melakukan beberapa hal setelah guru hadir.");
    }
}
