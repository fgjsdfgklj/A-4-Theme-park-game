public class Game {
    // A PointsLabel that I can use without any problems(its seen by every class so
    // its easier to add points to the counter)
    static PointsLabel pointLabel = new PointsLabel();

    public static void main(String[] args) {
        new frame();
    }
}
