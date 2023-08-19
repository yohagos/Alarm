public class HighVisibilityAlarm extends Alarm{

    HighVisibilityAlarm(String message){
        super(message);
    }

    public String getReport(boolean uppercase){
        if (active && !isSnoozing()) {
            if (uppercase) {
                return getMessage().toUpperCase() + "!";
            } else {
                return getMessage() + "!";
            }
        }
        return "";
    }

    public static void main(String[] args) {
        HighVisibilityAlarm alarm = new HighVisibilityAlarm("test");
        alarm.turnOn();
        System.out.println(alarm.getReport(true));
    }
}
