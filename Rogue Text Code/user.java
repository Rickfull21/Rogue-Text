import java.util.ArrayList;
import java.util.List;

public class user
{
    // instance variables - replace the example below with your own
    private String name;
    private int health;
    private int stamina;
    private int actionPoints;
    
    private int strength;
    private int wisdom;
    private int agility;
    
    private double accuracy;
    private double evasion;
    
    private double physicalResistance;
    private double magicalResistance;
    
    private ability[] abilities;
;
    
    private int score;
    private boolean defeated;

    public user()
    {
        name = "Unknown Entity";
        health = 100;
        stamina = 100;
        actionPoints = 6;
        
        strength = 1;
        wisdom = 1;
        agility = 1;
        
        accuracy = 35;
        evasion = 5;
        
        physicalResistance = 0.25;
        magicalResistance = 0.25;
        
        ability[] abilities = new ability[0];
        
        score = 0;
        defeated = false;
    }

    public user(String userInput)
    {
        // initialise instance variables
        name = userInput;
        health = 100;
        stamina = 100;
        actionPoints = 6;
        
        strength = 1;
        wisdom = 1;
        agility = 1;
        
        accuracy = 35;
        evasion = 5;
        
        physicalResistance = 0.25;
        magicalResistance = 0.25;
        
        ability[] abilities = new ability[0];

        score = 0;
        defeated = false;
    }
    
    public void getInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Stamina: " + this.stamina);
        System.out.println("Action Points: " + this.actionPoints);

        System.out.println("Strength: " + this.strength);
        System.out.println("Wisdom: " + this.wisdom);
        System.out.println("Agility: " + this.agility);

        System.out.println("Accuracy: " + this.accuracy);
        System.out.println("Evasion: " + this.evasion);

        System.out.println("Physical Resistance: " + this.physicalResistance);
        System.out.println("Magical Resistance: " + this.magicalResistance);

        System.out.println("Score: " + this.score);
        System.out.println("Defeated: " + this.defeated);
    }
    
    public void getAbilities()
    {
        for (int i = 0; i < abilities.length; i++)
        {
            System.out.println(abilities[i].getName());
        }
    }
    
    public void createAbility()
    {
        for (int i = 0; i < abilities.length; i++)
        {
            if (abilities[i].getName() == "")
                abilities[i] = new ability();
        }
    }
    
    public void damaged(int damage)
    {
        health -= damage;
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