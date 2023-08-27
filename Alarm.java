import java.awt.*;
import java.time.Duration;
import java.time.LocalDateTime;


public abstract class Alarm implements Widget, PersistentObject {
    private final String message;
    protected boolean active = false;
    private LocalDateTime snoozeUntil;

    public Alarm(String message) {
        this.message = message;
        stopSnoozing();
    }

    @Override
    public String getHelpText(){
        return "I am an alarm. You can turn me on, off or snooze me";
    }

    @Override
    public void save() {
        System.out.println("Saving....");
    }

    public Color getColor(){
        return null;
    }

    public void snooze() {
        if (active)
            snoozeUntil = LocalDateTime.now().plusSeconds(3);
    }

    public LocalDateTime getSnoozeUntil() {
        return snoozeUntil;
    }

    public boolean isSnoozing() {
        return snoozeUntil.isAfter(LocalDateTime.now());
    }

    private void stopSnoozing() {
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }

    public void turnOn() {
        active = true;
        stopSnoozing();
    }

    public void turnOfF() {
        active = false;
        stopSnoozing();
    }

    public String getReport() {
        return getReport(false);
    }

    public String getReport(boolean uppercase){
        if (active && !isSnoozing()) {
            if (uppercase) {
                return message.toUpperCase();
            } else {
                return message;
            }
        }
        return "";
    }

    public void sendReport() {
        System.out.println(getReport());
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return getReport();
    }

    public static void main(String[] args) throws InterruptedException{
        Alarm alarm = new HighVisibilityAlarm("You have to wake up!!");
        alarm.turnOn();
        alarm.snooze();
        Thread.sleep(500 * 6);
        alarm.sendReport();
    }
}
