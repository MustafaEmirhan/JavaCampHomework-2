package oopIntro;

public class Course {
	
	public Course(String name,String teacherName,int whatPercentIsComplete,int courseLength) {
		this.name=name;
		this.teacherName=teacherName;
		this.whatPercentIsComplete=whatPercentIsComplete;
		this.courseLength=courseLength;
	}
	
	
	
	String name;// kursun ismi
	String teacherName;// kursun öðretmeninin ismi
	int whatPercentIsComplete;// kursu bitirme yüzdesi
	int courseLength;// kurs süresi

}
