package ProxyPattern;

public class ProxyTest {
    public static void main(String[] args) {
        Guru guru = new GuruProxy();
        guru.hadir();
    }
}
