import processing.core.PApplet;

abstract class Shape {

    protected ClickListener clickListener;

    abstract void draw(PApplet pApplet);

    boolean isClicked(int mouseX, int mouseY) {
        if (clickListener != null) {
            clickListener.onClicked(mouseX, mouseY);
        }
        return true;
    }

    abstract void move(int x, int y);
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
                x - size, y + size / 2f,
                x, y - size / 2f,
                x + size, y + size / 2f
        );
    }

    @Override
    boolean isClicked(int mouseX, int mouseY) {
        super.isClicked(mouseX, mouseY);
        return false;
    }

    @Override
    void move(int x, int y) {

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

    @Override
    boolean isClicked(int mouseX, int mouseY) {
        super.isClicked(mouseX, mouseY);
        return false;
    }

    @Override
    void move(int x, int y) {

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
        pApplet.rect(
                x - size / 2f, y - size / 2f,
                size, size
        );
    }

    @Override
    boolean isClicked(int mouseX, int mouseY) {
        super.isClicked(mouseX, mouseY);
        System.out.println(this + " rect clicked" + "(" + mouseX + ", " + mouseY + ")" + CollisionDetector.isRectCollision(mouseX, mouseY, x, y, size));
        return CollisionDetector.isRectCollision(mouseX, mouseY, x, y, size);
    }

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
