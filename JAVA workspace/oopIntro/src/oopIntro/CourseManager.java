package oopIntro;

public class CourseManager {
	//i� yapan class
	public void register(Course course) {
		
		System.out.println(course.name+" kayd�n�z al�nd�!");
		System.out.println("��retmeniniz "+course.teacherName);
		System.out.println("Kursunuz "+course.courseLength+" dersttir.");
	}
}
