class Fighter {
    boolean isVulnerable() {
        return true;
    }

    public int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false; 
    }

    @Override
    public int getDamagePoints(Fighter opponent) {
        return opponent.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter opponent) {
        return spellPrepared ? 12 : 3;
    }
}
