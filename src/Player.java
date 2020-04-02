public class Player {
    String name;
    int score;

    public Ball ball;

    Player(String name) {
        this.name = name;

        score = 0;
        ball = new Ball();

    }
}
