public class Main {
    public static void main(String[] args) {
        Guru guru1 = new Guru("Budi", "123456");
        Guru guru2 = guru1.clone();

        guru2.setNama("Siti");
        guru2.setNip("654321");

        System.out.println(guru1);
        System.out.println(guru2);
    }
}
