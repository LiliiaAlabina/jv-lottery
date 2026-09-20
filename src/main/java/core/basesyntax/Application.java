package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery randomBall = new Lottery();
        Ball one = randomBall.getRandomBall();
        System.out.println(one);
        Ball two = randomBall.getRandomBall();
        System.out.println(two);
        Ball three = randomBall.getRandomBall();
        System.out.println(three);
    }
}
