package chapter9_inheritance;

public class Employee extends Person{
    public Employee(){
        super("Marwa");
        System.out.println("In Employee default constructor");
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String employeeId;
    private String title;
}
