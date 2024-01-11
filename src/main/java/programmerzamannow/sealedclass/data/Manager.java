package programmerzamannow.sealedclass.data;

public non-sealed class Manager extends Employee{

  private String department;

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }
}
