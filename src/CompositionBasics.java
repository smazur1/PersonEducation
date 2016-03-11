import java.util.ArrayList;
import java.util.Scanner;

//CompositionBasics.java
public class CompositionBasics {




	public static void main(String[] args) {

		ArrayList<Education> schools;
		String school;
		int years;
		String str;

		Scanner keyboard = new Scanner(System.in);



		Person bobby = new Person();


		Job job = new Job();
		job.setId(10);
		job.setSalary(2000);
		job.setRole("Programmer");
		bobby.setJob(job);

		System.out.println("Enter school name or (0) to exit");
		school = keyboard.next();

		while  (!school.equals("0")) {

			System.out.println("Enter years at school");
			years = keyboard.nextInt();

			bobby.addSchool(school, years);
			System.out.println("Enter school name or (0) to exit");
			school = keyboard.next();
		}

		for (Education e : bobby.getSchools()) {

			System.out.println( " bobby was here" + bobby.getSchools() ); 

		}
		System.out.println();
		System.out.println(bobby.getSalary());
		System.out.println();
		System.out.println(bobby.toString());

	}
}