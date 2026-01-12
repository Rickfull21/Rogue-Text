import java.util.Scanner;

/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String[] args)
    {
        userChoice choice = new userChoice();
        
        System.out.println("Name your Adventurer.");
        user player = new user(choice.getChoice());
        
        player.getInfo();
        player.getAbilities();
    }
}