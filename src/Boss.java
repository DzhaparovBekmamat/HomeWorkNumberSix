public class Boss extends GameEnity {
    private String Weapon;
    public Boss(int health, int damage, String protection) {
        super(health, damage, protection);
    }
    public Boss(int health, int damage, String protection, String weapon) {
        super(health, damage, protection);
        this.Weapon = weapon;
    }
    public String getWeapon() {
        return Weapon;
    }
    public void setWeapon(String weapon) {
        this.Weapon = weapon;
    }
}
