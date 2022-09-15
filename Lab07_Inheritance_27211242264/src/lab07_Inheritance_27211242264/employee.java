package lab07_Inheritance_27211242264;
import java.util.*;
public class employee extends person{
	private String office;
	private double salary;
	private int date_hired;
	employee(){}
	public employee(String office, double salary, int date_hired) {
		this.office = office;
		this.salary = salary;
		this.date_hired = date_hired;
	}
	void input() {
		super.input();
		Scanner kb = new Scanner(System.in);
		System.out.println("Input your office: "); 	office=kb.nextLine();
		System.out.println("Input your salary: "); 	salary=kb.nextDouble();
		System.out.println("Input your date hired: "); 	date_hired=kb.nextInt();
		kb.close();
	}
	void output() {
		super.output();
		System.out.println("Office: " + office + "\tsalary: " + salary + "\tdate hired: " + date_hired);
	}
	public static void main(String[] args) {
		employee em = new employee();
		em.input();
		em.output();
	}
}
