package bilgeAdamBoost4Marathon2;

import java.util.Date;

public class FullTimeWorker extends Employee {

	String employementType;

	@Override
	public int idNumberGenerator(int i) {
		// TODO Auto-generated method stub
		return super.idNumberGenerator(i);
	}

	@Override
	public String idConnector(int year, int counter) {
		// TODO Auto-generated method stub
		return super.idConnector(year, counter);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary();
	}

	@Override
	public void setSalary(double salary) {
		// TODO Auto-generated method stub
		super.setSalary(salary);
	}

	@Override
	public String getPersonelId() {
		// TODO Auto-generated method stub
		return super.getPersonelId();
	}

	@Override
	public void setPersonelId(String personelId) {
		// TODO Auto-generated method stub
		super.setPersonelId(personelId);
	}

	@Override
	public int getIdPart1() {
		// TODO Auto-generated method stub
		return super.getIdPart1();
	}

	@Override
	public void setIdPart1(int idPart1) {
		// TODO Auto-generated method stub
		super.setIdPart1(idPart1);
	}

	@Override
	public int getIdPart2() {
		// TODO Auto-generated method stub
		return super.getIdPart2();
	}

	@Override
	public void setIdPart2(int idPart2) {
		// TODO Auto-generated method stub
		super.setIdPart2(idPart2);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return super.getSurname();
	}

	@Override
	public void setSurname(String surname) {
		// TODO Auto-generated method stub
		super.setSurname(surname);
	}

	@Override
	public Date getEnrollmentYear() {
		// TODO Auto-generated method stub
		return super.getEnrollmentYear();
	}

	@Override
	public void setEnrollmentYear(Date enrollmentYear) {
		// TODO Auto-generated method stub
		super.setEnrollmentYear(enrollmentYear);
	}

	@Override
	public Date getTerminationYear() {
		// TODO Auto-generated method stub
		return super.getTerminationYear();
	}

	@Override
	public void setTerminationYear(Date terminationYear) {
		// TODO Auto-generated method stub
		super.setTerminationYear(terminationYear);
	}

	public String getEmployementType() {
		return employementType;
	}

	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}

	public FullTimeWorker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullTimeWorker(String name, String surname, double salary, String personelId, Date hiringDate,
			Date terminationYear, String employementType) {
		super(name, surname, salary, personelId, hiringDate, terminationYear);
		employementType = this.employementType;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FullTimeWorker [ name=" + name + ", surname=" + surname + ", salary=" + salary + ", personelId="
				+ personelId + ", hiringDate=" + hiringDate + "]";
	}

}
