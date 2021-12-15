package java16.baitapnop.buoi3oop.oop.object;

import java.util.Scanner;

public class Student {
	/* Properties */
	private String studentName;
	private int studentCode;
	private float mathMark;
	private float physicsMark;
	private float chemistryMark;
	private float averageMark;
	private String classification;

	/* Getter, setter methods */
	public String getStudentName() {

		return studentName;
	}

	public void setStudentName(String studentName) {
		if (studentName.isEmpty()) {
			System.out.println("Vui lòng không để trống tên ");
			return;
		}
		this.studentName = studentName;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		if (studentCode < 0) {
			System.out.println("Vui lòng nhập mã hợp lệ");
			return;
		}
		this.studentCode = studentCode;
	}

	public float getMathMark() {
		return mathMark;
	}

	public void setMathMark(float mathMark) {
		if (mathMark < 0 || mathMark > 10) {
			System.out.println("Vui lòng nhập trong thang điểm từ 0-10");
			return;
		}
		this.mathMark = mathMark;
	}

	public float getPhysicsMark() {
		return physicsMark;
	}

	public void setPhysicsMark(float physicsMark) {
		if (physicsMark < 0 || physicsMark > 10) {
			System.out.println("Vui lòng nhập trong thang điểm từ 0-10");
			return;
		}
		this.physicsMark = physicsMark;
	}

	public float getChemistryMark() {
		return chemistryMark;
	}

	public void setChemistryMark(float chemistryMark) {
		if (chemistryMark < 0 || chemistryMark > 10) {
			System.out.println("Vui lòng nhập trong thang điểm từ 0-10");
			return;
		}
		this.chemistryMark = chemistryMark;
	}

	public float getAverageMark() {
		return averageMark;
	}

	public String getClassification() {
		return classification;
	}

	/* Constructors methods */
	public Student() {

	}

	/**
	 * 
	 * @param studentName
	 * @param studentCode
	 * @param mathMark
	 * @param physicsMark
	 * @param chemistryMark
	 * @return thông tin sinh viên
	 */
	public Student(String studentName, int studentCode, float mathMark, float physicsMark, float chemistryMark) {
		this.studentName = studentName;
		this.studentCode = studentCode;
		this.mathMark = mathMark;
		this.physicsMark = physicsMark;
		this.chemistryMark = chemistryMark;
	}

	/* Input, output methods */
	public void input(Scanner scan) {
		String studentName;
		int studentCode;
		float mathMark;
		float physicsMark;
		float chemistryMark;
		System.out.println("Nhập thông tin sinh viên");
		do {
			System.out.print("Họ và tên: ");
			studentName = scan.nextLine();
			setStudentName(studentName);
		} while (studentName.isEmpty());
		do {
			System.out.print("Mã sinh viên: ");
			studentCode = Integer.parseInt(scan.nextLine());
			setStudentCode(studentCode);
		} while (studentCode < 0);
		do {
			System.out.print("Điểm toán: ");
			mathMark = Float.parseFloat(scan.nextLine());
			setMathMark(mathMark);
		} while (mathMark < 0 || mathMark > 10);
		do {
			System.out.print("Điểm lý: ");
			physicsMark = Float.parseFloat(scan.nextLine());
			setPhysicsMark(physicsMark);
		} while (physicsMark < 0 || physicsMark > 10);
		do {
			System.out.print("Điểm hóa: ");
			chemistryMark = Float.parseFloat(scan.nextLine());
			setChemistryMark(chemistryMark);
		} while (chemistryMark < 0 || chemistryMark > 10);
	}

	public void output() {
		System.out.print("Tên: " + this.studentName);
		System.out.print("\t Mã: " + this.studentCode);
		System.out.print("\t Toán: " + this.mathMark);
		System.out.print("\t Lý: " + this.physicsMark);
		System.out.print("\t Hóa: " + this.chemistryMark);
		System.out.print("\t ĐTB: " + this.averageMark);
		System.out.print("\t Xếp loại: " + this.classification);
	}

	/* Business methods */
	public void calculateAverageMark() {
		this.averageMark = (this.mathMark + this.physicsMark + this.chemistryMark) / 3;
	}

	public void doClassification() {
		if (this.averageMark >= 9) {
			this.classification = "Xuất sắc";
		} else if (this.averageMark >= 8) {
			this.classification = "Giỏi";
		} else if (this.averageMark >= 7) {
			this.classification = "Khá";
		} else if (this.averageMark >= 6) {
			this.classification = "Trung bình khá";
		} else if (this.averageMark >= 5) {
			this.classification = "Trung bình";
		} else {
			this.classification = "Yếu";
		}
	}
}