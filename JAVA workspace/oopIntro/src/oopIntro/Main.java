package oopIntro;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course("-Yaz�l�m Geli�tirici Yeti�tirici Kamp�(C#,ANGULAR)", "Engin Demiro�", 10, 21);// referans olu�turma
																													
		Course course2 = new Course("-Yaz�l�m Geli�tirici Yeti�tirici Kamp�(JAVA,React)", "Engin Demiro�", 50, 16);// referans	olu�turma																										// olu�turma

		Course course3 = new Course("-Programlamaya Giri� ��in Temel Kurs", "Engin Demiro�", 90, 6);// referans olu�turma

		Course[] courses = { course1, course2, course3 };
		
		System.out.println("Kurslar�m�z:");

		for (Course course : courses) {

			System.out.println(course.name);

		}
		//Method 1
		CourseManager courseManager = new CourseManager();

		courseManager.register(course1);

		courseManager.register(course2);

		courseManager.register(course3);
		
		//Method 2
		CommentManager commentManager = new CommentManager();
		
		commentManager.addComment();

	}

}
