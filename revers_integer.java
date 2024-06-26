class revers_integer{
    public static void main(String[] args){
        int num = 12345;
        int rev = 0;

        while(num != 0){
            rev = rev * 10  + num % 10; //5..4..3..2..1
            num = num / 10; //1234..123..12..1
        }
        System.out.println("Reversed num is: " + rev);

    }
}