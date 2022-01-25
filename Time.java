public class Time {
    public static void main(String[] args) {
        double totalMiliseconds = System.currentTimeMillis();
        double totalSeconds = totalMiliseconds/1000;
        double currentSeconds = totalSeconds % 60;
        double totalMinutes = totalSeconds / 60;
        double currentMinute = totalMinutes % 60;
        double totalHours = totalMinutes/60;
        double currentHours = totalHours%24;
        System.out.println("Current time is: " + (int)currentHours + ":" + (int)currentMinute + ":" + (int)currentSeconds + " GMT");
    }
}
