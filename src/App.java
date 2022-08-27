public class App {
    public static void main(String[] args) {
        Agent agent1 = new Agent ();
        agent1.Info();
        Agent agent2 = new Agent ("joni", 100);
        agent2.Info();

        Player P1 = new Player ();
        P1.InfoPlayer();
        Player P2 = new Player (522160090, 100);
        P2.InfoPlayer();


    }
}