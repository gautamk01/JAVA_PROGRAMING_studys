package lab_5.Q_1;

public class person {
    private String Name;
    private int age;
    public person(String Name,int age){
       this.Name = Name;
       this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + Name + "\nAge: " + age;
    }
};


