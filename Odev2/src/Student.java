
public class Student extends User{
	private int studentId;
	private double studentLevel;
	//studentLevel = ��rencinin kamplar� bitirme y�zdesi
	
	public Student(int studentId, double studentLevel) {
		super();
		this.studentId = studentId;
		this.studentLevel = studentLevel;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public double getStudentLevel() {
		return studentLevel;
	}

	public void setStudentLevel(double studentLevel) {
		this.studentLevel = studentLevel;
	}
}
