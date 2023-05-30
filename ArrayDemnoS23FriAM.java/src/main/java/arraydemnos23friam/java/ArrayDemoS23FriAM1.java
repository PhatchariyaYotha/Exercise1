package arraydemnos23friam.java;

import java.util.Scanner;



public class ArrayDemoS23FriAM1 {

    public static void main(String[] args) {
       System.out.println("Enter a word");
       Scanner input = new Scanner(System.in);
       String myWord = input.nextLine();
       
       char[] myLetters =new char[myWord.length()];
       
       for(int i = 0;i<myLetters.length;i++){
           myLetters[i] = myWord.charAt(i);
           System.out.print(myLetters[i]);
       }//end of for loop
       System.out.println();
       System.out.println("printing in reverse");
       //printing in reverse
       
       for(int i =myLetters.length-1;i>=0;i--){
           System.out.print(myLetters[i]);
       }//end of for
    }//end of main
    
}//end of class

