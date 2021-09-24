public class CollisionDetector {
    static public boolean isRectCollision(int mouseX, int mouseY, int rectX, int rectY, int size) {
        return (mouseX > rectX - size / 2f && mouseX < rectX + size / 2f) &&
                (mouseY < rectY + size / 2f && mouseY > rectY - size / 2f);
    }
}
