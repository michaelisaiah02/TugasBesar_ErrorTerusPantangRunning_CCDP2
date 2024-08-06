package StrategyMethod;

public class AbsensiKeluar implements AbsensiStrategy {
    @Override
    public void doAbsensi() {
        System.out.println("Absensi Keluar berhasil!");
    }
}