//paremeter constructor;

class Student{
    String name;
    String school;
    int age;
    int id;

    Student(String name,String school,int age,int id) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.id = id;
    }

       public void s(){
        System.out.println("Student Details");
       }

        public void studentInfo(){
            System.out.println("name : " + name);
            System.out.println("school : " + school);
            System.out.println("age : " + age);
            System.out.println("id : " + id);

        }
    public static void main(String[] args) {
        Student s1 = new Student("krunal", "CBSC school", 15, 21);

        s1.s();
        s1.studentInfo();

    }
}

//Non-paremeter constructor;

class Car{
    String name;
    String model;
    int price;

    public void carDetails(){
        System.out.println("!! Car Details Below !!");

    }
    void carName(){
        System.out.println("name : " + name);

    }
    void carModel(){
        System.out.println("model : " + model);

    }
    void carPrice(){
        System.out.println("price : " + price);
    }
}
 class OPPS{
    public static void main(String[] args){
        Car c = new Car();
        c.name = "farari";
        c.model = "Ferrari 500 F2";
        c.price = 20000000;

        c.carDetails();
        c.carName();
        c.carModel();
        c.carPrice();
    }
 }

 // Copy constructor

class Car{
    String name;
    String model;
    int price;

    //original constructor
    Car(String name , String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;

    }
    //copy constructor
    Car(Car other){
        this.name = other.name;
        this.model = other.model;
        this.price = other.price;

    }
    public void carDetails(){
        System.out.println("! Car Details Below !");
    }
    public void carName(){
        System.out.println("Name: " +name);
    }
    public void carModel(){
        System.out.println("Model: " +model);
    }
    public void carPrice(){
        System.out.println("Price: " +price);
    }

    public static void main(String []args){
        Car c1 = new Car("farari","Ferrari 500 F2",20000000);
                System.out.println("original constructor");
        c1.carDetails();
        c1.carName();
        c1.carModel();
        c1.carPrice();

        Car c2 = new Car(c1);
        System.out.println("new constructor");
        c2.carName();
        c2.carModel();
        c2.carPrice();



    }
}