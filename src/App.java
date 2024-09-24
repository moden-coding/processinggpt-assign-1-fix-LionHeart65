import processing.core.PApplet;

public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(400, 400);

    }

    public void setup() {
        fill(43);
    }

    public void draw() {
        fill(223, 134, 167);
        strokeWeight(1);
        stroke(23);
        rect(50, 50, 50, 34);
        fill(234, 54, 94);
        strokeWeight(3);
        stroke(75);
        ellipse(100, 233, 50, 50);
        line(50, 50, 100, 233);
    }
}
