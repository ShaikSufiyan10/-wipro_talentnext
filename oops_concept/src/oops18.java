import java.util.Optional;

public class oops18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Employee emp = null;

        Optional<Employee> optEmp = Optional.ofNullable(emp);

        try {
            Employee e = optEmp.orElseThrow(() -> new InvalidEmployeeException("Employee is null"));
            System.out.println("Employee: " + e.getName());
        } catch (InvalidEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}


	
