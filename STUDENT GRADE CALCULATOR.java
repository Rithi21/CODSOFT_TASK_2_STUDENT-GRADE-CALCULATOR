import java.util.*;

public class Main {
    public static String studentGrade(int avg) {
        String Grade;
        if (avg >= 91) {
            Grade = "O";
        } else if (avg >= 90 && avg < 100) {
            Grade = "A+";
        } else if (avg >= 80 && avg < 90) {
            Grade = "A";
        } else if (avg >= 70 && avg < 80) {
            Grade = "B+";
        } else if (avg >= 60 && avg < 70) {
            Grade = "B";
        } else if (avg >= 50 && avg < 60) {
            Grade = "C";
        } else if (avg >= 40 && avg < 50) {
            Grade = "D";
        } else {
            Grade = "F";
        }
        return Grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter the number of subjects
        int n = sc.nextInt();
        int marks[] = new int[n];
        int sum = 0, avg;
        System.out.println("Enter Marks Obtained in " + n + " Subjects: ");
        for (int i = 0; i < n; i++) {
            // Enter marks of each subject
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        avg = sum / n;
        System.out.println("Your average mark: " + avg);
        String Grade = studentGrade(avg);
        System.out.println("Your Grade: " + Grade);
        switch (Grade) {
            case "O":
                System.out.println("Excellent!");
                break;
            case "A+":
                System.out.println("Excellent!");
                break;
            case "A":
                System.out.println("Good");
                break;
            case "B+":
                System.out.println("Better Try more");
                break;
            case "B":
                System.out.println("Well done");
                break;
            case "C":
                System.out.println("You passed");
                break;
            case "D":
                System.out.println("You just passed");
                break;
            case "F":
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
                
        }
    }
}
