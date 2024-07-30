public class Swap_number_without_temp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a + b; //a = 15
        b = a - b; //b = 5
        a = a - b;

        System.out.println("a= " + a );
        System.out.println("b= " + b);
    }
}
