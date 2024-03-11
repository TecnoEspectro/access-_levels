
package people;


public class Persona {
    private String name;
    private int age;
    private String lastname;
    private String fullname;

    public Persona(String name, String lastname, int age) {
        this.name = name;
        this.age = age;
        this.lastname = lastname;
        createFullname(name, lastname);
    }

    
private void createFullname(String name, String lastname) {
    this.fullname = name + " " + lastname;
}

    public String getFullname() {
        return fullname;
    }


    public int getAge() {
        return age;
    }

    
    
    
}
