import java.awt.*;

public class HighVisibilityAlarm extends Alarm{

    HighVisibilityAlarm(String message){
        super(message);
    }

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }

    @Override
    public String getReport(boolean uppercase){
        String report = super.getReport(uppercase);
        if (report.isEmpty())
            return report;
        return report + "!";
    }

    public static void main(String[] args) {
        HighVisibilityAlarm alarm = new HighVisibilityAlarm("test");
        alarm.turnOn();
        alarm.sendReport();
    }
}
