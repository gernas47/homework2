public class InstructorManager extends UserManager {

    @Override
    public void logIn(User user) {
        System.out.println("Eğitmen olarak giriş yapıldı: " + user.getFirstName() + " " + user.getLastName());
    }

    public void createCourse(Course course){
        System.out.println("Tebrikler! " + course.getName() + " adlı kurs oluşturdunuz.");
    }
}
