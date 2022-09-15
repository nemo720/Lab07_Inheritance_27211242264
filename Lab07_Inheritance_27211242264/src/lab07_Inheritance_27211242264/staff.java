package lab07_Inheritance_27211242264;

import java.util.Scanner;

public class staff extends employee{
	private String title;
	public staff() {}
	public staff(String title) {
		this.title = title;
	}
	void input() {
		super.input();
		Scanner kb = new Scanner(System.in);
		System.out.println("Input your title: "); 	title=kb.nextLine();
		kb.close();
	}
	void output() {
		super.output();
		System.out.println("Title: " + title);
	}
	public static void main(String[] args) {
		staff s = new staff();
		s.input();
		s.output();
	}
}
