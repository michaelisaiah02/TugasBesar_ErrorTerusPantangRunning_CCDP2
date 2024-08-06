public abstract class Guru {
    protected Absensi absensi;

    protected Guru(Absensi absensi) {
        this.absensi = absensi;
    }

    public abstract void lakukanAbsensi();
}
