import java.util.ArrayList;
import java.util.List;

public class Dashboard {
    private final List<Alarm> alarmList = new ArrayList<>();

    public void add(Alarm alarm) {
        alarm.turnOn();
        alarmList.add(alarm);
    }

    public void printReports() {
        for (Alarm alarm: alarmList)
            System.out.println(alarm.getReport());
    }

    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();

        dashboard.add(new HighVisibilityAlarm("get home"));
        dashboard.add(new PrioritizedAlarm("get to work", 11));
        dashboard.add(new TimeSensitiveAlarm("go to bed"));

        dashboard.printReports();
    }
}
