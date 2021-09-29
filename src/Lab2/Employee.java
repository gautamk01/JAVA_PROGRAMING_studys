package Lab2;

public class Employee {
  private   long id;
  private String Name;
  private double salary;

  public Long get_id(){
      return  id;
  }
  public String get_name()
  {
      return Name;
  }
  public double get_salary(){
      return salary;
  }

     Employee()
    {
        id = 1002L;
        Name = "Gautam";
        salary = 4000d;
    }
    Employee(long id,String Name,double salary)
    {
        this.id = id;
        this.Name = Name;
        this.salary = salary;
    }

    public void raiseSalary(int x){
      this.salary= Math.round((get_salary()*(x/100f))+get_salary());
    }


    public static void main(String[] args) {
        Employee harry = new Employee(1200,"Hacker,Harry",55000);
        harry.raiseSalary(10);
        System.out.println(harry.get_salary());
    }
}
