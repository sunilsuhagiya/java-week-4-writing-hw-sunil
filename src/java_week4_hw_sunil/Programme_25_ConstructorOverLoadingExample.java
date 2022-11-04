package java_week4_hw_sunil;
// Java program to overload constructors
public class Programme_25_ConstructorOverLoadingExample {
    int id;
    String name;
    int age;
    // Creating two arg constructor
    Programme_25_ConstructorOverLoadingExample(int i, String n){
        id = 1;
        name = n;
    }
    // Creating three arg constructor
    Programme_25_ConstructorOverLoadingExample(int i, String n, int a){
        id = 1;
        name = n;
        age = a;
    }
    public void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Programme_25_ConstructorOverLoadingExample s1 = new Programme_25_ConstructorOverLoadingExample(111, "Sunil");
        Programme_25_ConstructorOverLoadingExample s2 = new Programme_25_ConstructorOverLoadingExample(222, "Sunil" , 35);
        s1.display();
        s2.display();
    }
}
