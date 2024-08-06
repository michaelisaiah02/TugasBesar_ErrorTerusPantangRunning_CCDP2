package template;

public abstract class AbsensiGuru {
    public final void absen() {
        hadir();
        tandaTangan();
    }

    abstract void hadir();

    private void tandaTangan() {
        System.out.println("Guru tanda tangan");
    }
}
