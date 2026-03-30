import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter study hours for today: ");
        int hours = sc.nextInt();

        StudySession session = new StudySession(hours);
        String result = Analyzer.analyze(session.getHours());

        System.out.println("Analysis: " + result);

        sc.close();
    }
}
