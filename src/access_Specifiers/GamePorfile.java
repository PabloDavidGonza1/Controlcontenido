package access_Specifiers;

class GameProfile {
    private int points; // Solo la clase puede modificarlo
    public String username; // Se puede acceder directamente

    public GameProfile(String username) {
        this.username = username;
        this.points = 0;
    }

    public void addPoints(int amount) {
        if (amount > 0) {
            points += amount;
        }
    }

    public int getPoints() {
        return points;
    }
}


