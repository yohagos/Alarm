import java.awt.Color;
public class PrioritizedAlarm extends Alarm{
    private final int priority;

    PrioritizedAlarm(String message, int priority) {
        super(message);
        this.priority = priority;
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }

    public int getPriority(){
        return priority;
    }
}
