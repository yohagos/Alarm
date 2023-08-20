import java.time.LocalDateTime;

public class TimeSensitiveAlarm extends Alarm {

    public TimeSensitiveAlarm(String message) {
        super(message);
    }

    @Override
    public String getReport() {
        String report = super.getReport();
        if (report.isEmpty())
            return report;
        return LocalDateTime.now() + " : " + report;
    }
}
