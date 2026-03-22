import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int day   = sc.nextInt();

        switch (day) {
            case 1:
                System.err.println("Monday");    
                break;
            case 2:
                System.err.println("Tuesday");
            default:
                throw new AssertionError();
        }
    }
}