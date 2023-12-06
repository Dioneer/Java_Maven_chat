package reflection;

public class Employee {
    public int id;
    public String name;
    public String department;
    private double salary;
    public Employee(){};

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    private void changeDepartment(String newDep){
        this.department = newDep;
        System.out.println("New department is: " +newDep);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void increaseSalary(){
        this.salary*=2;
    }
}
