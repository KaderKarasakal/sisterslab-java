
import java.util.Scanner;// Scanner class içe aktardık

public class Answer04 {// Answer04 dosyasında işlem yapıyoruz
    public static void main(String[] args) { // 'main' class olmazsa olmaz!
        Scanner scan = new Scanner(System.in);
// hesap makinesi yapıyoruz.
        System.out.println("please enter the first number: ");// ilk sayıyı aldık (double olarak)
        double firstDouble = scan.nextDouble();

        System.out.println("please enter the second number: ");// ikinci sayiyi aldık
        double secondDouble= scan.nextDouble();

        System.out.println("your first number is: " + firstDouble );
        System.out.println("your second number is: " + secondDouble);// 1. ve 2. sayı ekrana yazdirildi

        double sum = firstDouble + secondDouble;// iki sayinin toplamı ve ekrana yazımı
        System.out.println("sum of your numbers: " + sum);

        double subt; 
        if(firstDouble>=secondDouble){ // çıkarma işlemi için koşul yazdık 
            subt = firstDouble - secondDouble; // eğer birinci sayı büyükesit ise birinci sayidan çikariyoruz.

        } else{// diger durumlarda ikinci sayidan birinci sayiyi cikariyoruz
            subt = secondDouble - firstDouble;
        }
        System.out.println("subtraction of your numbers: " + subt);// farkı ekrana yazdırdık

        double multiple = firstDouble * secondDouble;// carpma islemi
        System.out.println("multiplication of your numbers: " + multiple);

        double div;
        if(firstDouble>= secondDouble){// bölme işlevi için koşul yazıyoruz (eğer birinci sayi büyükesit ise)
            div = firstDouble / secondDouble;// birinci sayiyi ikinci sayiya böldük

        }else{
            div = secondDouble / firstDouble;// diğer durumlarda ikinci sayiyi birirnci sayiya bölüyoruz.

        }
        System.out.println("division of your numbers: " + div);// bölümün sonucunu ekrana yazdırdık

    }
    
}
