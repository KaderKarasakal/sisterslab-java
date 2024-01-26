import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap01 {


    public static void main(String args[]){

        HashMap< String , Integer> studentGrade = new HashMap<>();
        Scanner scan= new Scanner(System.in);

        while(true){

            System.out.println("please enter a student's name: (Type exit to finish) ");
            String name = scan.nextLine();

            if(name.equals("exit")){
                System.out.println("exiting...");
                break;
            }
            System.out.println("please enter the grade of student: ");
            int grade = scan.nextInt();
            scan.nextLine(); //Remember!!!

            studentGrade.put(name,grade);
        }

        System.out.println("student-grade list: ");
        for(Map.Entry<String, Integer> entry : studentGrade.entrySet()){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }
    } 
    
}
