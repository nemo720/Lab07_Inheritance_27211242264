package lab07_Inheritance_27211242264;
import java.util.*;
class person {
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;
	public person() {}
	person(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Input your name: "); 	name=kb.nextLine();
		System.out.println("Input your address: "); 	address=kb.nextLine();
		System.out.println("Input your phone number: "); 	phoneNumber=kb.nextLine();
		System.out.println("Input your email address: "); 	emailAddress=kb.nextLine();
		kb.close();
	}
	void output() {
		System.out.println("Name: " + name + "\taddress: " + address + "\tphone number: " + phoneNumber + "\temail address: " + emailAddress);
	}
	public String toString() {	return "Name: " + name + "\taddress: " + address + "\tphone number: " + phoneNumber + "\temail address: " + emailAddress;}
	public void setName(String name) {	this.name=name;}
	public String setName() {	return name;}
	
	public void setAddress(String address) {	this.address=address;}
	public String setAddress() {	return address;}
	
	public void setPhoneNumber(String phoneNumber) {	this.phoneNumber=phoneNumber;}
	public String setPhoneNumber() {	return phoneNumber;}
	
	public void setEmailAddress(String emailAddress) {	this.emailAddress=emailAddress;}
	public String setEmailAddress() {	return emailAddress;}
}
