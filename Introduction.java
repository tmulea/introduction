/**
 * This program tells a little bit about me.
 * @author Tyler Mulea
 * @version 8/20/18
 */
public class Introduction
{
    public static void main(String[] args)
    {
        //here are some facts about me
        System.out.println("I was born in Beverly, MA.");
        System.out.println("I am currently taking 6 AP classes (probably a mistake)");
        System.out.println("I am not good at coming up with things about myself.");
        
        //create variables and store values in them
        String name = "Tyler";
        int birthYear = 2001;
        int currentYear = 2018;
        
        //What happens here? Who knows?
        System.out.println("currentYear - birthYear");
        System.out.println(currentYear - birthYear);
        
        //Do some arithmetic
        int age = currentYear - birthYear;
        
        //Concatenate literal strings with variables
        System.out.println("My name is " + name + ", and I am " + age + " years old.");
        
        /*
         * You may notice that the age calculation is only correct if you've
         * already had a birthday this year. We can fix that using a boolean
         * variable and conditional logic.
         */
        
        //Change this value to false if you haven't had your birthday this yaer
        boolean hadBirthday = false;
        
        //Conditionally, subtract one from the age if the birthday hasn't occured yet
        if (hadBirthday == false) {
            age -= 1;
        }
        //This output should always be correct
        System.out.println("My name is " + name + ", and I am " + age + " years old.");
    }
}

            
        
        