package lab07_Inheritance_27211242264;
import java.util.*;
public class student extends person{
	private String class_status;
	final String status1 = "freshman";
	final String status2 = "sophomore";
	final String status3 = "junior";
	final String status4 = "senior";
	student(){}
	void input() {
		super.input();
		Scanner kb = new Scanner(System.in);
		System.out.println("Input your class status (freshman, sophomore, junior,or senior): "); 	class_status=kb.nextLine();
		kb.close();
	}
	void output() {
		super.output();
		System.out.println("Class status: " + class_status);
	}
	public static void main(String[] args) {
		student st = new student();
		st.input();
		st.output();
	}
}
