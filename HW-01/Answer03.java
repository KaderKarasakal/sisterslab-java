import java.util.Scanner;

public class Answer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your grade: ");// kullanıcıdan notunu girmesi istendi
        int grade = scan.nextInt();// not integer olarak grade değişkenine atandı

        if(grade>=90 && grade<=100){// eğer not 100 ve 90 arasında ise
            System.out.println("your grade is AA, congratulations!");// harf notu AA

        }else if(grade<90 && grade>=80){// eğer bot 90 ve 80 aralığimda ise
            System.out.println("your grade is BA, great!");// harf notu BA...

        }else if(grade<80 && grade>=70){
            System.out.println("your grade is BB, good job!");

        }else if(grade<70 && grade>=60){
            System.out.println("your grade is CB, nice! ");

        }else if (grade<60 && grade>= 50){
            System.out.println("your grade is CC, you passed!");

        }else{//yukarıdaki şartları sağlamıyorsa 
            System.out.println("your grade is FF, unsuccessful!!!");// harf notu FF, kaldı.
        }

        
    }
    
    
    
}
