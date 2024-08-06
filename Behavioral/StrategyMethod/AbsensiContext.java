public class AbsensiContext {
    private AbsensiStrategy strategy;

    public void setStrategy(AbsensiStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeAbsensi() {
        strategy.doAbsensi();
    }
}
