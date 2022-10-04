package bilgeAdamBoost4Marathon2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import bilgeAdamBoost4Marathon2.PartTimeWorker;
import bilgeAdamBoost4Marathon2.FullTimeWorker;

public class EmployeeManagement extends Employee {

	Employee cnt = new Employee();
	List<Employee> employeeList = new ArrayList<>();

	public void personCreation(String name, String surname, double salary, Date startDate, Date terminationDate,
			String employementType, double workingHours) {

		int year = startDate.getYear();

		if (employementType == "Full Time") {
			employeeList.add(new FullTimeWorker(name, surname, salary, cnt.idConnector(year, cnt.counter), startDate,
					terminationDate, employementType));
		}

		else if (employementType == "Part Time") {

			employeeList.add(new PartTimeWorker(name, surname, salary * workingHours,
					cnt.idConnector(year, cnt.counter), startDate, terminationDate, employementType, workingHours));
		}

		else {
			System.err.println("Please type employement type as: -Full Time- or -Part Time-");
		}

	}

	public void displayList() {
		employeeList.stream().forEach(d -> System.out.println(d));
	}

	public void sortingByName() {
		Collections.sort(employeeList, (d1, d2) -> d1.getName().compareTo(d2.getName()));
		employeeList.stream().forEach(l -> System.out.println(l));

	}

	public void sortingById() {
		Collections.sort(employeeList, (d1, d2) -> d1.getPersonelId().compareTo(d2.getPersonelId()));
		employeeList.stream().forEach(l -> System.out.println(l));

	}

	public void sortingByDate() {
		Collections.sort(employeeList, (d1, d2) -> d1.getEnrollmentYear().compareTo(d2.getEnrollmentYear()));
		employeeList.stream().forEach(l -> System.out.println(l));
	}

	public void salaryPay() {

		employeeList.stream().forEach(d -> System.out.println(d.getSalary() + " Amount is paid"));

	}

}
