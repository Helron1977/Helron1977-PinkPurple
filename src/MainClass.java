import java.util.Arrays;

import processing.core.PApplet;

public class MainClass extends PApplet {

    public static void main(String[] args) {
        MainClass mySketch = new MainClass();
        String[] processingArgs = { "MainClass" };
        PApplet.runSketch(processingArgs, mySketch);
    }

    // public static PApplet p;
    public Game game;

    public MainClass() {
        game = new Game();
        game.generatePlayers(Arrays.asList("Nicolas", "Roland"));
    }

    public void settings() {
        // p = this;
        smooth(); // Lissage des dessins
        size(Settings.screenWidth, Settings.screenHeight);
    }

    public void draw() {
        // background(0,0,0);// On dessine un fond noir

        noStroke(); // on supprime le contour

        for (Player player : game.players) {
            fill(color(player.ball.red, player.ball.green, player.ball.blue));
            ellipse(player.ball.position.x, player.ball.position.y, Settings.ballDiameter, Settings.ballDiameter);
        }
    }

}
