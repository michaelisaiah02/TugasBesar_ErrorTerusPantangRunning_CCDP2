class AttendanceDisplay implements Observer {
    private String teacherName;

    public AttendanceDisplay(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(boolean isPresent) {
        System.out.println("Tampilan Kehadiran: " + teacherName + " - " + (isPresent ? "Hadir" : "Tidak Hadir"));
    }
}
