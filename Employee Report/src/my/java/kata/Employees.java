package my.java.kata;

import java.util.Collection;
import java.util.stream.Collectors;

public class Employees {
	private final Collection<Employee> employees;

	public Employees(Collection<Employee> employees) {
		this.employees = employees;
	}
	public Collection<String> getAdults() {
		return employees.stream()	
			.filter(Employee::isAdult)
			.map(Employee::getName)
			.sorted((first,second) -> second.compareTo(first))
			.map(String::toUpperCase)
			.collect(Collectors.toUnmodifiableList());
	}
}