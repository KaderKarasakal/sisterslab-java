import java.util.Scanner;

public class Answer08 {
    
     
    public static void main(String[] args) {
// kullanıcıdan iki double numara aldık
        Scanner  scan = new Scanner(System.in);
        System.out.println("please enter your first number: ");
        double first = scan.nextDouble();

        System.out.println("please enter your second number: ");
        double second = scan.nextDouble();

        System.out.println("please select  one from in 1,2,3,4: ");// kullanıcıdan 4 işlemden birini seçmesini istedik

        int operation = scan.nextInt();// seçilen işlem okundu
        
        switch(operation){
            case 1://toplama işlemi için
            System.out.println("sum of your numbers: " + (first + second));
            break;// break komutu case'den çıkmak için kullanılır.

            case 2: // çıkarma işlemi
            System.out.println("subtraction of your numbers: "+(first - second));
            break;

            case 3:// çarpma işemi
            System.out.println("multiplication of your numbers: " + (first*second));
            break;

            case 4: // bölme işlemi
            System.out.println("division of your numbers: "+ (first/ second));
            break;

        }
       
    }
  
  
}
