import java.util.Scanner;

public class Answer09 {
// seçilen sekil için alan hesaplama
  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("please select one of from 1(rectangle), 2(square), 3(triangle): ");// üç şekilden bir tanesi seçilecek
        int shape = scan.nextInt();// seçilen sayı okundu, int değişkenine atandı 

        switch(shape){//şekil
            case 1://dikdörtgen seçildiğinde
            System.out.println("please enter short length: ");// kısa kenar alındı
            double shortEdge = scan.nextDouble();
            System.out.println("please enter long edge: ");// uzun kenar alındı
            double longEdge = scan.nextDouble();
            System.out.println("the area of the rectangle: "+ (shortEdge + longEdge)*2);//alan hesabı yapıldı, ekrana yazdırıldı.
            break;// case 1 kırıldı (case 1'den çıktık)

            case 2://kare seçildiğinde
            System.out.println("please enter  side length of square: ");// karenin bir kenarı kullanıcıdan istendi
            double sideLength = scan.nextDouble();// double değişkenine atandı
            System.out.println("the area of your square: " + sideLength*sideLength);//alan hesabiyapıldı, sonuç ekrana yazdırıldı
            break;// case 2 kırıldı

            case 3: // üçgen seçildiğinde
            System.out.println("please enter  edge");// yüksekliğin indiği kenar istendi
            double edge = scan.nextDouble();//double değişkenine atandı
            System.out.println("please enter height of  your triangle: ");// üçgenin yüksekliği istendi
            double height = scan.nextDouble();//double değişkenine atandı
            System.out.println("the area of your triange: " + height*edge/2);// alan hsaplandı, sonuç ekrana yazdırıldı.
            break;// case 3 kırıldı.
        }
    }
    
}
