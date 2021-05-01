
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,60);
		student1.setId(2);
		student1.setFirstName("Ekin");
		student1.setLastName("U�");
		student1.setEmail("ekinucc2004@gmail.com");
		
		
		Instructor instructor1 = new Instructor(1);
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.setEmail("engindemirog@gmail.com");
		
		Course course1 = new Course(1, "C#&Angular.jpg", "C#&Angular", "Engin Demiro�");
		Course course2 = new Course(2, "Java&React.jpg", "Java&React", "Engin Demiro�");
		
		Course[] courses = {
			course1,
			course2
		};
		
		InstructorManager instructorManager = new InstructorManager();
		for (Course course : courses) {
			instructorManager.addCourse(course);
		}
		
		StudentManager studentManager = new StudentManager();
		for (Course course : courses) {
			studentManager.joinCourse(course);
		}
		
		
		
	}
	

}
