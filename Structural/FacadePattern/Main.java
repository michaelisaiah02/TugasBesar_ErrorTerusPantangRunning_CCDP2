public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Michael Isaiah", "Bahasa Indonesia");
        AttendanceFacade attendanceFacade = new AttendanceFacade();
        
        attendanceFacade.markAndNotify(teacher, true);
    }
}
