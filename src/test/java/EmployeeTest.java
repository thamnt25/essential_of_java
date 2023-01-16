import org.example.Employee;
import org.example.EmployeeUtils;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EmployeeTest {
    private EmployeeUtils employeeUtils = new EmployeeUtils();
    @Test
    public void employeeFullName() {
        Employee employee = new Employee();
        employee.setFirstName("Jemero");
        employee.setLastName("Nguyen");
        String actual = employeeUtils.getFullName(employee);
        assertThat(actual).isEqualTo("Jemero Nguyen");
    }
    @Test
    public void getManagerLastName() {
        Employee employee1 = new Employee();
        employee1.setFirstName("Jemero");
        employee1.setLastName("Nguyen");
        Employee employee2 = new Employee();
        employee2.setManager(employee1);
        String actualName = employeeUtils.getManagerLastName(employee2);
        assertThat(actualName).isEqualTo("Nguyen");

    }
}
