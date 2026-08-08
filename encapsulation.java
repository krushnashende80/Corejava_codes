package helloEclipse.java;

public class encapsulation {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public static void main(String[] args) {

        encapsulation e = new encapsulation();

        e.setName("Krushna Shende");
        e.setAge(22);

        // print using getters
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
    }
}
