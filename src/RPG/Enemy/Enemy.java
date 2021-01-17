package RPG.Enemy;

abstract public class Enemy {
    public int hp, damage, itemBonus;
    public int exp;

    public abstract int getItemBonus();

    public abstract int getHp();
}