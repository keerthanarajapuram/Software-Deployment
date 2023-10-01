// Author: Keerthana Rajapuram
import java.util.Scanner;
public class LetterGrade{
    public static void main(String[] args) {
        char LetterGrade;
        System.out.println("Keerthana Rajapuram");
        System.out.println("Please enter your grade :");
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
//if grade >= 95 , set the letterGrade to A+
if(grade >= 95){
System.out.println("Your letter grade is A+");
}
           
 // if grade >= 90 , set the letterGrade to A
else if(grade >= 90){
System.out.println("Your letter grade is A");
}
 
 // if grade >= 85 , set the letterGrade to B+
 else if(grade >= 85){
System.out.println("Your letter grade is B+");
}
        
// if grade >= 80 , set the letterGrade to B
else if(grade >= 80){
System.out.println("Your letter grade is B");
}

 // if grade >= 75 , set the letterGrade to C+
 else if(grade >= 75){
System.out.println("Your letter grade is C+");
}
              
 // if grade >= 70 , set the letterGrade to C
else if(grade >= 70){
System.out.println("Your letter grade is C");
}

 // if grade >= 65 , set the letterGrade to D+
 else if(grade >= 65){
System.out.println("Your letter grade is D+");
}
 
 // if grade >= 60 , set the letterGrade to D
else if(grade >= 60){
System.out.println("Your letter grade is D");
}

// else set the letterGrade to F
        else {
System.out.println("Your letter grade is F");
        }

        
 } //main
} //LetterGrade

