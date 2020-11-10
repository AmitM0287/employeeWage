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

		if (attendence() == 1){
			System.out.println("Present");

		}else{
			System.out.println("Absent");
		}

	}

}

