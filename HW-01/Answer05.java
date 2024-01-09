import java.util.Scanner;
public class Answer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a integer: ");// kullanıcıdan sayı istedik
        int number = scan.nextInt(); // sayıyı okuduk

        if(number%2==0){// eğer sayının 2 le blümünden kalan 0 ise(2'ye göre mod) sayı çifttir
            System.out.println("your number is  even!");

        }else{// diğer durumlarda sayı tektir.
            System.out.println("your number is odd!");
        }
        
    }
}
