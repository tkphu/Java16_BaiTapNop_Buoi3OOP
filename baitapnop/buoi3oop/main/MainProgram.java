package java16.baitapnop.buoi3oop.main;

import java.util.Scanner;

import java16.baitapnop.buoi3oop.oop.object.Student;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		student.input(scan);
		student.calculateAverageMark();
		student.doClassification();
		student.output();
	}

}
