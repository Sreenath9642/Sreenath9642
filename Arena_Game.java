class Player {
    private int health;
    private int strength;
    private int attack;
    
    // Constructor, Getters, Setters
    public boolean isAlive() {
        return health > 0;
    }
    
    public int attack() {
        int attackRoll = rollDice();
        return attack * attackRoll;
    }
    
    public int defend() {
        int defenseRoll = rollDice();
        return strength * defenseRoll;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    private int rollDice() {
        return (int)(Math.random() * 6) + 1; // Returns a number between 1 and 6
    }
}

class Arena {
    private Player playerA;
    private Player playerB;

    public void startFight() {
        while (playerA.isAlive() && playerB.isAlive()) {
            Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
            Player defender = attacker == playerA ? playerB : playerA;
            
            int attackDamage = attacker.attack();
            int defense = defender.defend();
            int netDamage = attackDamage - defense;
            
            if (netDamage > 0) {
                defender.takeDamage(netDamage);
            }
            
            // Print round details and health status for debugging
        }
        
        // Determine and announce winner
    }
}
