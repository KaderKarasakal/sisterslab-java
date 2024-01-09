import java.util.Scanner; // imported Scanner class

public class Answer01 {
   
     
    public static void main(String[] args) {// main class

        Scanner scan = new Scanner(System.in);
        double taxRate = 0.30; // vergi oranı 0.30 olarak belirlendi
        System.out.println("Please enter a value (integer): "); //kullanıcıdan integer istendi
        int price = scan.nextInt(); 
        System.out.println("Price: " + price);// kullanıcının girdiği deger
        double priceWithTax = price + (price*taxRate);//kdv'li fiyat hesaplandi
        System.out.println("price with tax: " + priceWithTax);//vergili fiyat ekrana yazdirildi
        double tax = price*taxRate;//vergi oranına göre vergi değeri hesaplandı
        System.out.println("tax: " + tax);// vergi değeri yazdırıldı
        
    

    }

    
 }
    

         

    
    





    
        



    
    

