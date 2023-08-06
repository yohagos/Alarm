public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm("Temprature to high");

        alarm.turnOn();
        alarm.sendReport();

    }
}
