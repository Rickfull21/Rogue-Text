public class character
{
    // instance variables - replace the example below with your own
    private String name;
    private int health;
    private int strength;
    private int score;
    private boolean defeated;

    public character()
    {
        // initialise instance variables
        name = "Alterick";
        health = 100;
        strength = 1;
        defeated = false;
    }

    public character(String name)
    {
        // initialise instance variables
        name = this.name;
        health = 100;
        strength = 1;
        defeated = false;
    }
    
    public void damaged(int damagePoints)
    {
        health-= damagePoints;
        
        if (health <= 0)
            defeated = true;
    }
    
    public int attack()
    {
        return strength * 25;
    }
    
    public boolean isDefeated()
    {
        
        return defeated;
    }
    
    
    
}