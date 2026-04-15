package advstream;
import java.util.*;
import java.util.stream.Collectors;


class Employee {
    @Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", department="
				+ department + "]";
	}
	int id;
    String name;
    double salary;
    int age;
    String department;

    public Employee(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
}
public class practice{

	public static void main(String[]args) {

ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
        new Employee(101, "Amit", 50000, 25, "IT"),
        new Employee(102, "Neha", 60000, 28, "HR"),
        new Employee(103, "Ravi", 45000, 24, "IT"),
        new Employee(104, "Karan", 70000, 30, "Finance"),
        new Employee(105, "Pooja", 55000, 27, "HR"),
        new Employee(106, "Rohit", 80000, 32, "IT"),
        new Employee(107, "Simran", 65000, 29, "Finance"),
        new Employee(108, "Amit", 50000, 25, "IT")
));
Optional<Employee> minSalaryEmp = empList.stream().min((a, b) ->(int)(a.getSalary() -b.getSalary()));	
minSalaryEmp.ifPresent(emp -> System.out.println("Min Salary Employee: " 
    + emp.getName() + " - " + emp.getSalary()));

Optional<Employee> maxSalaryEmp = empList.stream().max((a, b) ->(int)(a.getSalary() -b.getSalary()));	
maxSalaryEmp.ifPresent(emp -> System.out.println("Max Salary Employee: " 
    + emp.getName() + " - " + emp.getSalary()));


Optional<Employee> secondHighestEmp = empList.stream().sorted(Comparator.comparing(Employee::getSalary).
		reversed()).skip(1).findFirst();
secondHighestEmp.ifPresent(emp -> System.out.println("Second Highest Salary Employee: " 
+ emp.getName() + " - " + emp.getSalary()));

Optional<Employee> secondLowestEmp = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst();
secondLowestEmp.ifPresent(emp -> System.out.println("Second Lowest Salary Employee: " 
+ emp.getName() + " - " + emp.getSalary()));



System.out.println("Top 3 Highest Salary Employees");
List<Employee> top3Highest = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
.limit(3).collect(Collectors.toList());
top3Highest.forEach(emp ->
System.out.println(emp.getName() + " - " + emp.getSalary()));

System.out.println("Top 3 Lowest Salary Employees");
List<Employee> top3Lowest = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).distinct()
.limit(3).collect(Collectors.toList());
top3Lowest.forEach(emp ->
System.out.println(emp.getName() + " - " + emp.getSalary()));

System.out.println("Disticnt Employess by names");
empList.stream().sorted(Comparator.comparing(Employee::getSalary)).distinct().
collect(Collectors.toMap(Employee::getName,e->e,(e1,e2)->e1)).values()
.forEach(System.out::println);


Employee result=empList.stream().filter((e)->e.getDepartment().equals("IT")).min(Comparator.comparing(Employee::getSalary)).get();
System.out.println("Minimum salary emplyee of IT DEPARTMENT"+result);

Employee resultt=empList.stream().filter((e)->e.getDepartment().equals("IT")).max(Comparator.comparing(Employee::getSalary)).get();
System.out.println("Maximum salary emplyee of IT DEPARTMENT"+resultt);


Employee result3=empList.stream().filter((e)->e.getAge()>25).min(Comparator.comparing(Employee::getSalary)).get();
System.out.println("Minimum salary emplyee age is >25"+result3);

Employee result4=empList.stream().filter((e)->e.getAge()<30).max(Comparator.comparing(Employee::getSalary)).get();
System.out.println("Maxmimum salary emplyee age is <30,"+result4);

System.out.println("first 5 employees");
empList.stream().limit(5).forEach(System.out::println);


System.out.println("employees after first 3 skip");
empList.stream().skip(3).forEach(System.out::println);

System.out.println("top 2 youngest employee");
empList.stream().sorted(Comparator.comparing(Employee::getAge)).limit(2).forEach(System.out::println);


System.out.println("top 2 skip 2 youngest employee");
empList.stream().sorted(Comparator.comparing(Employee::getAge)).skip(2).limit(2).forEach(System.out::println);

System.out.println("top 3 highest salary from IT");
empList.stream().filter(e->e.getDepartment().equals("IT")).sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);


System.out.println("First 5 distinct employees");
empList.stream().sorted(Comparator.comparing(Employee::getSalary)).distinct().limit(5).
collect(Collectors.toMap(Employee::getName,e->e,(e1,e2)->e1)).values()
.forEach(System.out::println);


}}
