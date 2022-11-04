package programme_26_encapsulation;

public class Encapsulate {
    // private variables declared and this can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;
    // Set method for name to access private variable name

    public void setName(String name) {
        this.name = name;
    }
    // get method for name to access private variable name

    public String getName() {
        return name;
    }
    // set method for rollNo to access private variable rollNo

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    //get method for rollNo to access private variable rollNo

    public int getRollNo() {
        return rollNo;
    }
    //get method for age to access private variable age

    public int getAge() {
        return age;
    }
    //get method for age to access private variable age

    public void setAge(int age) {
        this.age = age;
    }
}
