package lab07_Inheritance_27211242264;

import java.util.Scanner;

public class faculty extends employee{
	private int office_hours;
	private int rank;
	public faculty(){};
	public faculty(int office_hours, int rank) {
		this.office_hours = office_hours;
		this.rank = rank;
	}
	void input() {
		super.input();
		Scanner kb = new Scanner(System.in);
		System.out.println("Input your office hours: "); 	office_hours=kb.nextInt();
		System.out.println("Input your rank: "); 	rank=kb.nextInt();
		kb.close();
	}
	void output() {
		super.output();
		System.out.println(office_hours + "\t" + rank);
	}
	public static void main(String[] args) {
		faculty f = new faculty();
		f.input();
		f.output();
	}

}
