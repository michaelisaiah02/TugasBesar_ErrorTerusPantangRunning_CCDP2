public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Michael Isaiah");
        AttendanceDisplay attendanceDisplay = new AttendanceDisplay(teacher.getName());
        NotificationService notificationService = new NotificationService(teacher.getName());

        teacher.addObserver(attendanceDisplay);
        teacher.addObserver(notificationService);

        teacher.setPresent(true);
        teacher.setPresent(false);
    }
}
