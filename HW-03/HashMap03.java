import java.util.HashMap;
import java.util.Scanner;

public class HashMap03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> playerSet = new HashMap<>();
        
        while(true){
        System.out.println("1:add player and/or score");
        System.out.println("2:view the player's score");
        System.out.println("3: exit");

        int number = scan.nextInt();
        scan.nextLine();
        
            switch(number){
                case 1:
                    System.out.println("please enter the player's name:");
                    String name = scan.nextLine();
                    System.out.println("please enter the score: ");
                    int score = scan.nextInt();
                    playerSet.put(name, score);
                    break;
                
                case 2: 
                    System.out.println("enter the name to view the score: ");
                    name = scan.nextLine();
                    System.out.println("score of " + name +": "+ playerSet.get(name));
                    if (name.equals(null)){
                        System.out.println("player not found!!!");
                        break;
                    }
                    break;
                case 3: 
                   System.out.println("exiting!!!");
            }
        }
    }    
    
    

        



 }
    

