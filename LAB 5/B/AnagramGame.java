import java.util.*;
import java.lang.*;

public class AnagramGame{
    public static void main(String[] words){
        // for(int i = 0;i < words.length;i++){
        //     System.out.println(words[i]);
        // }
        String[] word = [
            "Ask",	
            "Apple",	
            "Away",	
            "Alright",
            "Ate",	
            "Ball",	
            "Bat",	
            "Basket",	
            "Bag",                 
            "Book",                 
            "Cat",                 
            "Come",                 
            "Catch",                 
            "Call",                 
            "Create",                 
            "Dog",                 
            "Dumb",                 
            "Die",                 
            "Dance",                
            "Develop",                 
            "Eager",                 
            "Elephant",                 
            "Eat",                 
            "Easy",                 
            "Egg",                 
            "Fun",                 
            "Find",                 
            "Face",                 
            "Fear",                 
            "Fish",                 
            "Goat",                 
            "Game",                 
            "Good",                 
            "Great",                 
            "Giraffe",
            "Hello",
            "Horse",
            "Height",
            "His",
            "Hair",
            "Ice",
            "Ice",
            "Is",
            "If",
            "In",
            "Jelly",
            "Joy",
            "Jug",
            "Joker",
            "Jam",
            "Kite",
            "Keep",
            "Kind",
            "Know",
            "King",
            "Look",
            "Learn",
            "Light",
            "Little",
            "Laugh",
            "Man",
            "Magic",
            "Move",
            "Mom",
            "Make",
            "No",
            "Never",
            "New",
            "Nice",
            "Nigh"
        ]

        int n = ( 1 + (word.length * Math.random()) );

        int length = word[n].length;

        System.out.println("Word has " + length + " Char.");
        System.out.println("You have 10 try.");
        String userWord = new String();
        Scanner sc = new Scanner(System.in);
        int count;
        for(int i = 0;i < 10;i++){
            System.out.println("Try - " + (i + 1));
            System.out.println("Enter Your Word : ");
            userWord = sc.next();
            count = 0;
            if(userWord.length == length){
                for(int j = 0;j < length;j++){
                    if(userWord.charAt(j)){}
                }
            }
            else{
                System.out.println("length is not equal.");
            }
        }
    }
}

