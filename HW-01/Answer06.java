import java.util.Scanner;

public class Answer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// sırasıyla 3 tane sayı aldık
        System.out.println("please enter first number: ");
        int number1 = scan.nextInt();

        System.out.println("please enter second number: ");
        int number2 = scan.nextInt();

        System.out.println("please enter third number: ");
        int number3 = scan.nextInt();

        if(number1>= number2 && number2>= number3){

            System.out.println("from smallest to largest: " + number3 +"<"+ number2 +"<"+ number1);  

            if(number3> number2){
                System.out.println("from smallest to largest: " + number2 + "<"+number3 +"<"+ number1);
            }
        }if(number2 >= number1 && number1>= number3){

        System.out.println("from smallest to largest: " + number3+ "<" + number1 +"<"+ number2);

        if (number1< number1){
            System.out.println("from smallest to largest: " + number1+"<"+ number3 + "<"+number2);

        }
        }if (number3>= number2 && number2>= number1){
            System.out.println("from smallest to largest: " + number1+"<"+ number2+ "<" +number3);
            if(number1>number2){
                System.out.println("from smallest to largest: "  + number2 +"<"+number1+"<"+ number3);
            }
        }

    }  
       
}

