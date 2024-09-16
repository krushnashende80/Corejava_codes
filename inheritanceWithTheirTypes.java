// - in Java there are 5 types of Inheritance
// 1) Single Level Inheritance
// 2) Multi Level Inheritance
// 3) Hierarchical Inheritance
// 4) Multiple Inheritance
// 5) Hybrid Inheritance
// but in Java we usually Use only first three below their Examples-

// 1) Single Level Inheritance:
class A {

    void name() {
        System.out.println("A : My Name is Krushna");
    }
}

class B extends A{  // if we say the simple defination of single level inheritance
                    // is to extend parent class data into child class
    void surName(){
        System.out.println("B : My Surname is Shende");

    }
    public static void main(String[] args){
        A a = new A();
        a.name();
      //a.surName(); in single level inheritance i can't call parent class into child class

        B b = new B();
        b.name(); // this is possible because we extend A class into B class
        b.surName();
    }
}

// 2) Multilevel Inheritance:
class A{

    void country(){
        System.out.println("A : India");
    }
}
class B extends A{

    void state(){
        System.out.println("B : Maharashtra");
    }
}
class C extends B{

    void city(){
        System.out.println("C : Pune");
    }

public static void main(String[] args) {
    A obj1 = new A();
    obj1.country(); //output = India

    B obj2 = new B();
    obj2.country();//output = India
    obj2.state(); //output = Maharashtra

    C obj3 = new C();
    obj3.country();//output = India
    obj3.state();  //output = Maharashtra
    obj3.city();  //output = Pune
// extend class A and class B data into class C using "extends" keyword and we can
//  say this is multilevel inheritance in simple language
}
}
//
// 3) Hierarchical Inheritance
 class A{

    void carName(){
        System.out.println("A: Range Rover");
    }

}
class B extends A{

    void carModel(){
        System.out.println("B: Range Rover SV LWB 4.4");
    }

}
class C extends A{
    void  carPrice(){
        System.out.println("C: 4,17 Crore");
    }
public static void main(String[] args) {
    A obj1 = new A();
    obj1.carName();

    B obj2 = new B();
    obj2.carName();
    obj2.carModel();

    C obj3 = new C();
    obj3.carPrice();
    obj3.carName();
    //obj3.carModel(); ->//this method is show error because we not we can't call
    // class "B" into "obj3"
    // the short summary of Hierarchical Inheritance is we can
    // create multiple child class but their parent class should be one.
}
}

