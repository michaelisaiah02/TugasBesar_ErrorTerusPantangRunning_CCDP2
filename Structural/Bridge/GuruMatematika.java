package Structural.Bridge;

public class GuruMatematika extends Guru {
    public GuruMatematika(Absensi absensi) {
        super(absensi);
    }

    @Override
    public void lakukanAbsensi() {
        absensi.absensi("Guru Matematika");
    }
}