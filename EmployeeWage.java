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

		System.out.println("Day No." + "	    " + "Daily Wage" + "      " + "Total Wage");
		for (int i = 1; i <= 30; i++) {
			int n = attendence();
			if (n == 1) {
				int t = random.nextInt(2);

				if (t == 1) {
					dailyWage = fullDay * wageHour;
				} else {
					dailyWage = halfDay * wageHour;
				}
			} else {
				dailyWage = 0;
			}
			totalWage = totalWage + dailyWage;

			System.out.println("Day " + i + "		" + dailyWage + "		" + totalWage);
		}
	}

}

