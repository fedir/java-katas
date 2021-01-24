package my.java.kata;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class EmployeeReportTest {
	private Employees employees = employees(
			employee("Max", 17),
			employee("Sepp", 18),
			employee("Nina", 15),
			employee("Mike", 51)

	);

	private Employees employees(Employee... employees) {
		return new Employees(Arrays.asList(employees));
	}

	private Employee employee(String name, int age) {
		return new Employee (name, age);
	}
	@Test
	void shouldGetAdultsEmployees() {
	
		Collection<String> employeesExpected = Arrays.asList("SEPP", "MIKE");
		Assert.assertEquals(employeesExpected, employees.getAdults());
	}

}