public class AbsensiCommand implements Command {
    private Guru guru;

    public AbsensiCommand(Guru guru) {
        this.guru = guru;
    }

    @Override
    public void execute() {
        guru.absensi();
    }
}