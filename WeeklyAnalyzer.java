public class WeeklyAnalyzer {

    public static double calculateAverage(int[] hours) {
        int sum = 0;
        for (int h : hours) {
            sum += h;
        }
        return (double) sum / hours.length;
    }

    public static String weeklyReport(double avg) {
        if (avg > 5) {
            return "⚠ High burnout risk this week.";
        } else if (avg < 2) {
            return "⚠ Very inconsistent study habits.";
        } else {
            return "✅ Good balance maintained.";
        }
    }
}
