public class combatSystem
{
    // instance variables - replace the example below with your own
    private int turn;

    public static void startBattle(character user)
    {
        userChoice choice = new userChoice();
        character enemy = new character();
            while (user.isDefeated() == false)
        {
            System.out.println("You encounter a enemy. What will you do?");
            if (choice.getChoice() == "Fight")
                enemy.damaged(user.attack());
                
            user.damaged(enemy.attack());
                    
            if (enemy.isDefeated() == true)
                {
                    System.out.println("You have defeated the enemy.");
                    choice.closeScanner();
                    break;
                } else if (user.isDefeated() == true)
                    {
                        System.out.println("You have been defeated.");
                        choice.closeScanner();
                    }
        }
    }
}