public class game
{
    // instance variables - replace the example below with your own
    private int turn;

    public static void startAdventure(user player)
    {
        userChoice choice = new userChoice();
        character enemy = new character();
            while (player.isDefeated() == false)
        {
            System.out.println("You encounter a enemy. What will you do?");
            if (choice.getChoice() == "Fight")
                {
                    //player.getMoves();
                }
                
            player.damaged(enemy.attack());
                    
            if (enemy.isDefeated() == true)
                {
                    System.out.println("You have defeated the enemy.");
                    choice.closeScanner();
                    break;
                } else if (player.isDefeated() == true)
                {
                        System.out.println("You have been defeated.");
                        choice.closeScanner();
                }
        }
    }
}