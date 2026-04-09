// Day 86 : Encapsulation Example

class Student {
    // private data (hidden)
    private String name;
    private int age;

    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter method
    public int getAge() {
        return age;
    }

    // setter method with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class Day_86 {
    public static void main(String[] args) {
        Student s = new Student();

        // setting values using setter
        s.setName("Himanshu");
        s.setAge(20);

        // getting values using getter
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}