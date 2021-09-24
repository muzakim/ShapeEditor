import processing.core.PApplet;
import processing.core.PFont;

public class Toast {
    private String text;
    private int duration;

    private int counter = 0;

    public Toast(String text, int duration) {
        this.text = text;
        this.duration = duration;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void incrementCount() {
        counter++;
    }

    public boolean isFinish() {
        return counter > duration;
    }

    public void show(PApplet pApplet) {
        pApplet.color(100);
        pApplet.textFont(new PFont());
        pApplet.text(this.text, 400, 300);
        pApplet.rect(400, 300,  100, 10);
    }
}
