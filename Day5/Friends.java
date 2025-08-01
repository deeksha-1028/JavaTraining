package programs;

public class Friends {
	String name;
	String place;
	int age;

	Friends(String n, String p, int a) {
		this.name = n;
		this.place = p;
		this.age = a;
	}

	Friends(String n, int a) {
		this.name = n;
		this.place = "Bangalore";
		this.age = a;
	}

	void displayFriend() {
		System.out.println(name + " " + place + " " + age + " ");
	}

	public static void main(String[] args) {
		Friends f1 = new Friends("Deeksha", "Chikkamagalore", 21);
		Friends f2 = new Friends("Chandana", "Bangalore", 21);
		f1.displayFriend();
		f2.displayFriend();
	}

}