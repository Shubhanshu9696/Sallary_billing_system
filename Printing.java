public class Printing {
  MessageReader messageReader = new MessageReader();

  public void printSalarySlip(Employee employee) {
    System.out.println(messageReader.getMessage("id.label") + employee.getId());
    System.out.println(messageReader.getMessage("name.label") + employee.getName());
    System.out.println(messageReader.getMessage("salary.label") + employee.getSalary());
    System.out.println("Hra " + employee.getEmployeeOprations().hra());
    System.out.println("Da " + employee.getEmployeeOprations().da());
    System.out.println("Ta " + employee.getEmployeeOprations().ta());
    System.out.println("Ma " + employee.getEmployeeOprations().ma());
    System.out.println("PF " + employee.getEmployeeOprations().pf());
    System.out.println("GS " + employee.getEmployeeOprations().gs());
    System.out.println("Tax " + employee.getEmployeeOprations().tax());
    System.out.println("NS " + employee.getEmployeeOprations().ns());

  }
}
