class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}

class Attendance {
    public void markAttendance(Teacher teacher, boolean isPresent) {
        System.out.println("Mencatat kehadiran untuk " + teacher.getName() + ": " + (isPresent ? "Hadir" : "Tidak Hadir"));
    }
}

class Notification {
    public void sendNotification(Teacher teacher, boolean isPresent) {
        System.out.println("Mengirim Notifikasi: " + teacher.getName() + " - " + (isPresent ? "Hadir" : " Tidak Hadir"));
    }
}

public class AttendanceFacade {
    private Attendance attendance;
    private Notification notification;

    public AttendanceFacade() {
        attendance = new Attendance();
        notification = new Notification();
    }

    public void markAndNotify(Teacher teacher, boolean isPresent) {
        attendance.markAttendance(teacher, isPresent);
        notification.sendNotification(teacher, isPresent);
    }
}
