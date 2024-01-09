import java.util.Scanner; // imported Scanner class



public class Answer02{  // Answer02 clas'da işlem yapılıyor

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        System.out.println("please enter a value: ");
        int money = scan.nextInt(); // para değeri integer olarak alındı

        if (money>=0 && money<=1000){ //eğer para 1000 ile 0 arasında ise %10 kdv uygulandı
            double rate = 0.10; 
            System.out.println("your price with %10 tax: " + (money + money*rate)); // kdvli fiyat hesaplandı

        }else if (money>1000) {// eğer değer 1000'den büyük ise %22 kdv uygulandı

            double yourRate = 0.22;
            System.out.println("your price with %22 tax: " + (money + money*yourRate));// kdvli fiyat hesaplandı
         
        } else{// eğer bu sınırların dışında yani negatif bir değer girildiyse limit dışında olduğu belirtildi.
            System.out.println("The value you entered is outside the limits");
        }

        
    
}


}