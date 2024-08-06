public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher.Builder()
                                .setName("Michael Isaiah")
                                .setSubject("Matematika")
                                .setIsPresent(true)
                                .build();
        
        System.out.println(teacher);
    }
}
