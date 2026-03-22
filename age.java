// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        
        
        int marks = s.nextInt();
        
        
        if(marks<25){
            System.out.println("F:");
        }
        if(marks >=25 && marks >=44){
            System.out.println("E");
        }
        if(marks >=45 && marks >=49){
            System.out.println("D");
        }
        if(marks >=50 && marks >=59){
            System.out.println("C");
        }
        if(marks >=60 && marks >=79){
            System.out.println("B");
        }
        if(marks >=80 && marks >=100){
            System.out.println("A");
        }
        else{
            System.err.println("fail");
        }
        }
        
    }
