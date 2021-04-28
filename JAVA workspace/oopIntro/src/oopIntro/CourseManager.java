package oopIntro;

public class CourseManager {
	//iþ yapan class
	public void register(Course course) {
		
		System.out.println(course.name+" kaydýnýz alýndý!");
		System.out.println("Öðretmeniniz "+course.teacherName);
		System.out.println("Kursunuz "+course.courseLength+" dersttir.");
	}
}
