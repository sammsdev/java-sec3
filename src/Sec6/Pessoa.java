package Sec6;

public class Pessoa {

    private String firstName;
    private String lastName;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen (){
        return this.age > 12 && this.age < 20;

    }

    public String getFullName(){
        if(this.firstName == "")
            return  lastName;
        if(this.lastName == "")
            return firstName;
        return firstName + " " + lastName;
    }


}
