import processing.core.PApplet;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Program extends PApplet {

    int mouseX = 0;
    int mouseY = 0;

    int shapeMode = 1;

    ArrayList<Shape> shapeList;

    // 1, 2, 3, 4, 5, 6 ... 9
    // int[] numbers = malloc()
    // 배열은 길이 선언 먼저
    // 길이 수정 불가능

    // 10길이 배열

    // arrayList - > 동적 배열
    // arrayList[0] == 5
    // arrayList[1] == 5
    // arrayList[2] == 5

    // O(n)

    // map
    // hashMap
    // key : value
    // O(1)

    // 1 -> one
    // 2 -> two

    //

    // snake Case : snake_case
    // camel Case : camelCase


    @Override
    public void setup() {
        this.size(800, 600);
        this.background(255);

        shapeList = new ArrayList<>();
    }


    @Override
    public void keyPressed(KeyEvent keyEvent) {
        super.keyPressed(keyEvent);

        switch (keyEvent.getKeyCode()) {
            case '1': {
                shapeMode = 1;
                break;
            }

            case '2': {
                shapeMode = 2;
                break;
            }

            case '3': {
                shapeMode = 3;
                break;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        super.mousePressed(mouseEvent);
        this.mouseX = mouseEvent.getX();
        this.mouseY = mouseEvent.getY();
        shapeList.add(createShape());

        System.out.println("mouse clicked " + mouseX + ", " + mouseY);
    }

    @Override
    public void draw() {
        shapeList.forEach((shape -> shape.draw(this)));

//        for (Shape shape : shapeList) {
//            shape.draw(this);
//        }

//        this.ellipse(400, 300, 100, 200);
//
//        Triangle triangle = new Triangle(100, 100);
//        triangle.draw(this);
//
//        Circle circle = new Circle(500, 500);
//        circle.draw(this);
//
//        Rectangle rect = new Rectangle(100, 100);
//        rect.draw(this);

    }

    public Shape createShape() {

        switch (shapeMode) {
            case 0:
                return new Triangle(mouseX, mouseY);
            case 1:
                return new Circle(mouseX, mouseY);
            default:
                return new Rectangle(mouseX, mouseY);
        }
    }

    public static void main(String[] args) {
        PApplet.main(new String[]{"Program"});

        System.out.println("Select shape : 1(triangle), 2(circle), 3(rect)");
    }

}
