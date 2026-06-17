import java.util.*;

public class Character_string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        String res="";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c != '-' && c != '_'){
                res = res + c;
            } else {
                if(i + 1 < str.length()){
                    char next = Character.toUpperCase(str.charAt(i + 1));
                    res = res + next;
                    i++; 
                }
            }
        }
        System.out.println("Result: " + res);
        

    }
}