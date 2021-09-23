import processing.core.PApplet;

abstract class Shape {
    abstract void draw(PApplet pApplet);
}

class Triangle extends Shape {

    // 캡슐화
    private int x;
    private int y;
    private int size = 30;

    public Triangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    void draw(PApplet pApplet) {
        System.out.println("draw");
        pApplet.triangle(
                x - size, y + size,
                x, y,
                x + size, y + size
        );
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Circle extends Shape {

    int x;
    int y;
    int size = 30;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    void draw(PApplet pApplet) {
        pApplet.ellipse(x, y, size, size);
    }
}

class Rectangle extends Shape {

    int x;
    int y;
    int size = 30;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    void draw(PApplet pApplet) {
        pApplet.rect(x + size, y - size, size, size);
    }
}
