public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss(700, 70, "Shield", "AK-47");
        boss1.setHealth(700);
        boss1.setDamage(70);
        boss1.setProtection("Armor");
        boss1.setWeapon("AK-47");
        System.out.println(" | " + boss1.getHealth() + " > " + boss1.getDamage() + " > " + boss1.getProtection() + " > " + boss1.getWeapon() + "  |");
        }
    }
