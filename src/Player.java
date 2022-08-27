public class Player {
    private int direction;
    private int id;
    private int strength;

    public Player(){};

    public Player(int id, int direction){
        this.id = id;
        this.direction = direction;
    }

    public void AddStrength(int strength){
        this.strength = strength;
    }

    public void InfoPlayer(){
        System.out.print("Player : " + this.id + " ");
        System.out.println("Direction : " + this.direction);
    }
}
