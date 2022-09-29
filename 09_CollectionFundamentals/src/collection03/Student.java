package collection03;

import java.util.Objects;

public class Student {
	private int studentId;
	private String studentName;
	private double studentScore;

	public Student(int studentId, String studentName, double studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}

	@Override
	public int hashCode() {
		return studentId * 21;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return studentId == other.studentId && Objects.equals(studentName, other.studentName)
//				&& Double.doubleToLongBits(studentScore) == Double.doubleToLongBits(other.studentScore);
//	}
//	
	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj;
		if (this.studentId == st.studentId && this.studentName.equals(st.studentName)
				&& this.studentScore == st.studentScore) {
			return true;
		}
		return false;
	}
}
