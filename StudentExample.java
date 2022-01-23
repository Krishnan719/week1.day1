package assignments.week1.day1;

public class StudentExample {
	String name="Krishnan";
	short rollNo=29;

	public void college() {
		String name="Rajan";
		System.out.println(name);
	}

	public static void main(String[] args) {
		StudentExample example = new StudentExample();
		example.college();
		String name2 = example.name;
		System.out.println(name2);
		short rollNo2 = example.rollNo;
		System.out.println(rollNo2);
	}
}
