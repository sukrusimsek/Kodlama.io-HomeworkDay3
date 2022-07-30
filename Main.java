
public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		userManager.add();
		
		Instructor instructor = new Instructor();
		instructor.hocaName = "Engin Hoca";
		
		Student student = new Student();
		student.name = "Şükrü Şimşek";
		
		StudentManager studentManager = new StudentManager();
		studentManager.addHomework(student);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addLessonCourse(instructor);

	}

}
