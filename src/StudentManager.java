public class StudentManager extends UserManager {

    @Override
    public void logIn(User user) {
        System.out.println("Öğrenci olarak giriş yapıldı: " + user.getFirstName() + " " + user.getLastName());
    }

    public void registerCourse(Course course){
        System.out.println("Terikler! " + course.getName() + " adlı kursa başarılı bir şekilde kayıt oldunuz");
    }
}
