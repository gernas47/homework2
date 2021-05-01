public class Main {

    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setId(1);
        course1.setName("Java-React");
        course1.setDetail("Nitelikli yazılımcı geliştirme");

        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demiroğ");
        instructor1.setEmail("engin@engin.com");
        instructor1.setBranch("Software developing");
        instructor1.setPassword("12345");

        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Gernas");
        student1.setLastName("Kilinc");
        student1.setEmail("gernas@gernas.com");
        student1.setPhoneNumber("00000000000");
        student1.setUserName("gernas47");
        student1.setPassword("abcde");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.logIn(instructor1);
        instructorManager.createCourse(course1);
        
        StudentManager studentManager = new StudentManager();
        studentManager.logIn(student1);
        studentManager.registerCourse(course1);



    }
}
