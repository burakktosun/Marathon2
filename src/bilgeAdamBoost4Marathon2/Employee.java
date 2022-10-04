package bilgeAdamBoost4Marathon2;

import java.util.Date;

public class Employee {

	String name;
	String surname;
	double salary;
	String personelId;
	int idPart1;
	int idPart2;
	Date hiringDate;
	Date terminationYear;

	int counter = 1;

	public int idNumberGenerator(int i) {
		i = i + 1;
		this.counter = i;
		return i;
	}

	public String idConnector(int year, int counter) {
		String id;

		if (counter <= 9) {
			id = year + "-" + "000" + counter;
			idNumberGenerator(counter);
		} else if (counter > 9 && counter <= 99) {
			id = year + "-" + "00" + counter;
			idNumberGenerator(counter);
		} else if (counter > 99 && counter <= 999) {
			id = year + "-" + "0" + counter;
			idNumberGenerator(counter);
		} else if (counter > 999 && counter <= 9999) {
			id = year + "-" + counter;
		} else {
			counter = 1;
			idNumberGenerator(counter);
			System.err.format("Manager id number exceeds 9999. It will be restarted from " + "%04d%n", counter);
			System.out.println("Personel info saving process counter is restarted!");
			id = null;
		}

		return id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		salary = salary;
	}

	public String getPersonelId() {
		return personelId;
	}

	public void setPersonelId(String personelId) {
		personelId = personelId;
	}

	public int getIdPart1() {
		return idPart1;
	}

	public void setIdPart1(int idPart1) {
		idPart1 = idPart1;
	}

	public int getIdPart2() {
		return idPart2;
	}

	public void setIdPart2(int idPart2) {
		idPart2 = idPart2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		surname = surname;
	}

	public Date getEnrollmentYear() {
		return hiringDate;
	}

	public void setEnrollmentYear(Date enrollmentYear) {
		hiringDate = enrollmentYear;
	}

	public Date getTerminationYear() {
		return terminationYear;
	}

	public void setTerminationYear(Date terminationYear) {
		terminationYear = terminationYear;
	}

	@Override

	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", personelId=" + personelId + "]";
	}

	public Employee() {
		super();
	}

	public Employee(String name, String surname, double salary, String personelId, Date hiringDate,
			Date terminationYear) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.personelId = personelId;
		this.idPart1 = idPart1;
		this.idPart2 = idPart2;
		this.hiringDate = hiringDate;
		this.terminationYear = terminationYear;
	}

}
