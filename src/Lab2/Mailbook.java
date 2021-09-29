package Lab2;

public class Mailbook {
    String name;
    String street_add;
    String City;
    String state;
    int ZIP;
    void add(String name,String street_add,String city,String state,int ZIP){
        this.name=name;
        this.street_add=street_add;
        this.City=city;
        this.state=state;
        this.ZIP=ZIP;
    };
    void printer()
    {
        System.out.println("Name : "+name+" || Street_add : "+street_add+" || City : "+City+" || State : "+state+" || Zip : "+ZIP);

    }

}
