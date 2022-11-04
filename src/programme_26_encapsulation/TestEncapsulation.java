package programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // Setting values of variables
        obj.setName("Sunil");
        obj.setAge(35);
        obj.setRollNo(21);
        // Displaying values of variables
        System.out.println("Prime's name :  " + obj.getName());
        System.out.println("Prime's age :  " + obj.getAge());
        System.out.println("Prime's rollNo :  " + obj.getRollNo());
        // Direct access of rollno is not possible due to encapsulation
        //System.out.println("Prime's rollNo: " + obj.geekName);
    }
}
