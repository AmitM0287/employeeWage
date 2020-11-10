import java.util.Random;

public class EmployeeWage {
	static Random random = new Random();

	static int attendence() {

		int attendence = random.nextInt(2);

		if (attendence == 1) {
			return 1; // Present
		} else {
			return 0; // Absent
		}

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int wageHour = 20;
		int fullDay = 8;
		int halfDay = 4;
		int totalWage = 0;
		int dailyWage = 0;

	}

}

