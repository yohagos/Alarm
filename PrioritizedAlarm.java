public class PrioritizedAlarm extends Alarm{
    private final int priority;

    PrioritizedAlarm(String message, int priority) {
        super(message);
        this.priority = priority;
    }

    public int getPriority(){
        return priority;
    }
}
