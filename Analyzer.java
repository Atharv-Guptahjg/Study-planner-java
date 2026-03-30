public class Analyzer {

    public static String analyze(int hours) {
        if (hours > 6) {
            return "⚠ Burnout Risk! Take a break.";
        } else if (hours < 1) {
            return "⚠ You need to study!";
        } else {
            return "✅ Balanced Study Day.";
        }
    }
}
