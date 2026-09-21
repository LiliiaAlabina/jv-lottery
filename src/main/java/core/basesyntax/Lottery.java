package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();
    private final int limit = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier randomColor = new ColorSupplier();
        ball.setNumber(random.nextInt(limit));
        ball.setColor(randomColor.getRandomColor());
        return ball;
    }
}
