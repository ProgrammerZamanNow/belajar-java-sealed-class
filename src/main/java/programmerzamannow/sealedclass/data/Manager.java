package programmerzamannow.sealedclass.data;

public final class Manager extends Employee{

  private String department;

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }
}
