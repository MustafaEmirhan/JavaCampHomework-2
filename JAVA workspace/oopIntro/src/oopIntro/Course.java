package oopIntro;

public class Course {
	
	public Course(String name,String teacherName,int whatPercentIsComplete,int courseLength) {
		this.name=name;
		this.teacherName=teacherName;
		this.whatPercentIsComplete=whatPercentIsComplete;
		this.courseLength=courseLength;
	}
	
	
	
	String name;// kursun ismi
	String teacherName;// kursun ��retmeninin ismi
	int whatPercentIsComplete;// kursu bitirme y�zdesi
	int courseLength;// kurs s�resi

}
