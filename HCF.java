public class HCF {
    public static void main(String[] args) {
        int num1 = 23,num2 = 52;

        int hcf = getHCF(num1,num2);
        System.out.println(" THE HCF IS " + hcf);

        int lcm = (num1 * num2) / hcf;
        System.out.println(" The LCM number is " + lcm);

    }
    public static int getHCF(int num1, int num2) {
        return num2 == 0 ? num1 : getHCF(num2 , num1 % num2);
    }
}
