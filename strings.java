public class strings {
    public static void main(String[] args) {

        String name = "java";
        name.toUpperCase();
        System.out.println(name);//output will be "java"
        // if we want be change string small to CAPITLA like name = "JAVA" the code should be update below:
        name = name.toUpperCase();
        System.out.println(name);
        //toUpperCase to toLoweCase conversion
        String name1 = "KRUSHNA";
        name1 = name1.toLowerCase();
        System.out.println(name1); //output will be small letter like:"krushna"


        // if we want string.length then code should be below:
        String a = "my name is krushna";
        //below both code are valid
        int len = a.length();
        System.out.println(len); // output will be "18"
        System.out.println(a.length()); // output will be "18"

        // if we want character index position of string then code should be below:
        String n = "computer";
        System.out.println(n.charAt(2)); //output will be "m"

        //if we want indexOf string then code should be below:
        String s = "i am learning java";
        int i = s.indexOf("ning");
        System.out.println(i);  //9
        int k = s.indexOf("Abc");
        System.out.println(k);// output come in "-"value
        int j = s.lastIndexOf("learn");
        System.out.println(j);  //5

        //to check contains in given string
        boolean b = s.contains("earning");
        System.out.println(b); //truee

        //substring

        String j1 = "Learning code";
        String r1 = j1.substring(1); // "earning code";
        String r2 = j1.substring(1, 8); // "earning"
        System.out.println(r1);
        System.out.println(r2);
    }
}
