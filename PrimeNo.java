import java.util.Scanner;
class PrimeNo{
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        if(num > 1){
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(num + " is prime number");
            }else{
                System.out.println(num + " is not prime number");
            }
        }else{
            System.out.println(num +" is not prime number");
        }
    }
}