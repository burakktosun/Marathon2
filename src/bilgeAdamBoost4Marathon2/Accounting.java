package bilgeAdamBoost4Marathon2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bilgeAdamBoost4Marathon2.EmployeeManagement;
import bilgeAdamBoost4Marathon2.PartTimeWorker;
import bilgeAdamBoost4Marathon2.FullTimeWorker;

public class Accounting {

	EmployeeManagement e = new EmployeeManagement();
	FullTimeWorker f = new FullTimeWorker();
	PartTimeWorker p = new PartTimeWorker();

	public void sortingById() {
		Collections.sort(e.employeeList, (d1, d2) -> d1.getPersonelId().compareTo(d2.getPersonelId()));
		e.employeeList.stream().forEach(l -> System.out.println(l));
	}

	public void salaryCalculation() {

		if (e.employeeList.stream().filter(l -> l.salary >= 6000) != null) {

			e.employeeList.stream().filter(l -> l.salary >= 6000)
					.forEach(d -> System.out.println(d.getSalary() * 1.25 + " is the gross salary for" + d.getName()));
		}

		else {
			e.employeeList.stream().filter((l -> l.getSalary() < 6000))
					.forEach(d -> System.out.println(d.getSalary() * 1.08 + " is the gross salary for " + d.getName()));
		}
	}

	public void workHoursList() {
		e.employeeList.stream().filter((l -> l.getSalary() < 6000))
				.forEach(d -> System.out.println(p.getWorkingHours() + " is the working hours for " + d.getName()));
	}

}
