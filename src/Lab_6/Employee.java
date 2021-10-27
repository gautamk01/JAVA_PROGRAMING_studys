package Lab_6;

public abstract class Employee implements payable {
    public String firstName;
    public String lastName;
    public String socialSecurityNumber;

    //getter and setter
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String FirstName){
        this.firstName = FirstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getSSN(){
        return socialSecurityNumber;
    }
    public void setSSN(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public Employee(String fN,String LN,String ssn){
        setFirstName(fN);
        setLastName(LN);
        setSSN(ssn);
    }

    public void display(){
        System.out.println("Employee Detail");
        System.out.println("First Name : "+getFirstName());
        System.out.println("Last Name : "+getLastName());
        System.out.println("Social SecurityNumber : "+getSSN());
    }
}
