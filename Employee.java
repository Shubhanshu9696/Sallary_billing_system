public class Employee{
    private int id;
    private String name;
    private Double salary;
    private EmployeeOprations employeeOprations;
    private Printing printing;
    Employee (int id,String name,Double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        employeeOprations=new EmployeeOprations(this.salary);
        printing= new Printing();


    }
    public EmployeeOprations getEmployeeOprations(){
        return employeeOprations;
    }
    public void setEmployeeOprations(EmployeeOprations employeeOprations){
        this.employeeOprations=employeeOprations;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Double getSalary(){
        return salary;
    }
    public void setSalary(Double salary){
        this.salary=salary;
    }

    public void print(){
        printing.printSalarySlip(this);
    }

}