import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Double[]> satisTakip = new HashMap<>();
        
        satisTakip.put("Tuba",new Double[]{100.0,35.5,12.70});
        satisTakip.put("Kader",new Double[]{89.0,45.9,23.5,67.8});
        satisTakip.put("Burak", new Double[]{112.8,34.5});
        satisTakip.put("Pelin",new Double[]{90.6,47.6,1.43,6.9});
        satisTakip.put("Lale", new Double[]{79.9,19.0,41.7});
        
        Double maxSatis = 0.0;
        String maxKisi = null;
        for (Map.Entry<String, Double[]> entry: satisTakip.entrySet() ) {
            String key = entry.getKey();
            Double[] values = entry.getValue();
            Double toplam = 0.0;

            for (Double value : values) {
                toplam += value;  
            }
            System.out.println(key + ": "+ toplam);
            
            if(toplam> maxSatis){
                maxSatis = toplam;
                maxKisi = key;
               
            }
                
        }
            
        System.out.println("max satis yapan kisi: "+maxKisi+"\nmax satis miktari: "+ maxSatis);
            

    }
    
}
