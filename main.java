import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name your Adventurer.");
        character user = new character(scanner.nextLine());
        
        combatSystem.startBattle(user);
    }
}