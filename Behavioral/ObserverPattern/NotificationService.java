class NotificationService implements Observer {
    private String teacherName;

    public NotificationService(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(boolean isPresent) {
        System.out.println("Layanan Pemberitahuannnnnnnnnnn: " + teacherName + " - " + (isPresent ? "Hadir" : "Tidak Hadir"));
    }
}
