import java.util.Scanner;// Scanner sınıfı içeri aktardık



public class Answer07 {
    public static void main(String[] args) {// main class unutma!!!
        
    
    Scanner scan = new Scanner(System.in);

    System.out.println("please enter a number between 1 and 3: ");// 1ie 3 arasında bir sayı seç
    int condition = scan.nextInt();//okuduğumuz sayıyı condition değişkenine atadık.

    switch(condition){
        case 1:
        System.out.println("today is sunny!");
        break;// case 1'i kırıyoruz(yoksa diğer case'ler de ekrana yazdırılıyor) unutma!!
        case 2:
        System.out.println("today is rainy!");
        break;
        case 3: 
        System.out.println("today is snowy!");
        break;
    }

   


    } 
}
