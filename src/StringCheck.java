import java.util.*;
public class StringCheck {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String input=sc.next();
        if(checkAllAlphabets(input)){
            System.out.println("All Alphabets are present");
        }
        else{
            System.out.println("All Alphabets are not present");
        }
    }
    static boolean checkAllAlphabets(String input){
        input=input.toLowerCase();
        if(input.length()<26){
            return false;
        }
        int count=0;
        char alphabets[]=input.toCharArray();
        Arrays.sort(alphabets);
        char ch='a';
        for(int i=0;i<alphabets.length;i++){
            if(alphabets[i]==ch){
                count++;
                ch++;
            }
            else if(alphabets[i] > ch){
                return false;
            }
        }
        if(count==26)
            return true;
        else
            return false;
    }
}
//Time complexity=O(n)
//Space complexity=O(n)