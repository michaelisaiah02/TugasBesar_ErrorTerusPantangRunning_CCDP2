public class Main {
    public static void main(String[] args) {
        Guru guru1 = new Guru("Budi");
        Guru guru2 = new Guru("Siti");

        Command absensiCommand1 = new AbsensiCommand(guru1);
        Command absensiCommand2 = new AbsensiCommand(guru2);

        Invoker invoker = new Invoker();

        invoker.setCommand(absensiCommand1);
        invoker.executeCommand();

        invoker.setCommand(absensiCommand2);
        invoker.executeCommand();
    }
}
