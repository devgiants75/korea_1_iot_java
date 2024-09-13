package chapter16;

// 학교 클래스
class School {
	private String name;
	
	public School(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// 내부 클래스 - 학생, 교사 클래스
	class Student {
		private String studentName;
		private int studentId;
		
		public Student(String studentName, int studentId) {
			this.studentName = studentName;
			this.studentId = studentId;
		}
		
		public void displayInfo() {
			System.out.println("학교 " + name);
			System.out.println("학생 이름 " + studentName);
			System.out.println("학생 ID " + studentId);
		}
	}
	class Teacher {
		private String teacherName;
		private String subject;
		
		public Teacher(String teacherName, String subject) {
			this.teacherName = teacherName;
			this.subject = subject;
		}
		
		public void displayInfo() {
			System.out.println("학교 " + name);
			System.out.println("교사 이름 " + teacherName);
			System.out.println("과목 " + subject);
		}
	}
	
	class Teacher {
		
	}
}

public class A_Inner02 {
	public static void main(String[] args) {
		
	}
}
