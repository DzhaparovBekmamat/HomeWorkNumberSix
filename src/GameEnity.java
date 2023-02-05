public class GameEnity {
    private int health;
    private int damage;
    private String Protection;
    public GameEnity(int health, int damage, String protection) {
        this.health = health;
        this.damage = damage;
        Protection = protection;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getProtection() {
        return Protection;
    }
    public void setProtection(String protection) {
        Protection = protection;
    }
}
