package bilgeAdamBoost4Marathon2;

import bilgeAdamBoost4Marathon2.EmployeeManagement;
import bilgeAdamBoost4Marathon2.PartTimeWorker;
import bilgeAdamBoost4Marathon2.Employee;

import java.util.Date;
import java.util.Scanner;

import bilgeAdamBoost4Marathon2.Accounting;
import bilgeAdamBoost4Marathon2.FullTimeWorker;

public class MenuTest {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		boolean cont = true;
		EmployeeManagement emp = new EmployeeManagement();
		Accounting acc = new Accounting();

		emp.personCreation("Marek", "Hamsik", 9000, new Date(2021, 6, 10), null, "Full Time", 45);
		emp.personCreation("Hasan", "Kacan", 1500, new Date(2018, 9, 1), new Date(2022, 5, 10), "Full Time",45);
		emp.personCreation("Murat", "Turan", 7500, new Date(2008, 1, 1), new Date(2015, 6, 6), "Full Time",45);
		emp.personCreation("Barak", "Obama", 10000, new Date(2021, 10, 10), null, "Full Time", 45);
		emp.personCreation("Burak", "Tosun", 9500, new Date(2015, 3, 4), null, "Full Time", 45);
		emp.personCreation("Micheal", "Ballack", 8500, new Date(2018, 7, 11), new Date(2021, 2, 3), "Full Time",45);
		emp.personCreation("Jaja", "Coelho", 1300, new Date(2018, 7, 11), null, "Full Time",45);
		emp.personCreation("Jonny", "Bravo", 350, new Date(2014, 3, 6), null, "Part Time", 18);
		emp.personCreation("Mahmut", "Trezegeut", 400, new Date(2022, 2, 2), null, "Part Time", 20);
		emp.personCreation("Paulo", "Pristine", 450, new Date(2015, 7, 9), new Date(2020, 5, 5), "Part Time", 25);
		
				
		while (cont) {
			System.out.println("\n#########################################################");
			System.out.println("################## Company Management System #################");
			System.out.println("#########################################################");
			System.out.println("################## Press 1 to Display Employers #################");
			System.out.println("################## Press 2 to Calculate Employer Salary #################");
			System.out.println("################## Press 3 to Show Working Hours #################");
			System.out.println("################## Press 4 to Sort List By Hiring Date #################");
			System.out.println("################## Press 5 to Sort List By Name #################");
			System.out.println("################## Press 6 to Sort List By ID #################");
			System.out.println("################## Press 7 to Pay Salaries #################");
			System.out.println("#########################################################");

			int choice = a.nextInt();

			switch (choice) {

			case 1:

				emp.displayList();
				break;

			case 2:

				acc.salaryCalculation();

				break;

			case 3:

				acc.workHoursList();

				break;

			case 4:

				emp.sortingByDate();

				break;

			case 5:
				emp.sortingByName();

				break;

			case 6:

				emp.sortingById();

				break;

			case 7:

				emp.salaryPay();

				break;
			case 0:
				cont = false;
			default:
				System.out.println("Hatalı giriş yaptınız, yeniden deneyin.");
			}
		}
	}
}
