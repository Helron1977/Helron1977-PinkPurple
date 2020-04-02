import java.awt.*;
import java.util.Random;

public class Ball {
    int red;
    int green;
    int blue;
    Point position;

    // Constructeur de la balle
    Ball() {
        final Random random = new Random();

        this.red = random.nextInt(256);
        this.green = random.nextInt(256);
        this.blue = random.nextInt(256);

        final int x = random.nextInt(Settings.screenWidth - Settings.ballDiameter + 1) + Settings.ballDiameter;
        final int y = random.nextInt(Settings.screenHeight - Settings.ballDiameter + 1) + Settings.ballDiameter;
        this.position = new Point(x, y);
    }
}
