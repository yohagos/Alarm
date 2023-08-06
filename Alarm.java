public class Alarm {
    final String message;
    boolean active = false;

    Alarm(String message) {
        this.message = message;
    }

    void turnOn() {
        active = true;
    }

    void turnOfF() {
        active = false;
    }

    String getReport() {
        return getReport(false);
    }

    String getReport(boolean uppercase){
        if (active) {
            if (uppercase) {
                return message.toUpperCase();
            } else {
                return message;
            }
        }
        return "";
    }

    void sendReport() {
        System.out.println(getReport());
    }
}
