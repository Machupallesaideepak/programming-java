import java.util.Scanner;
 public class StudentGrade {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();
 
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);
        percentage = (totalMarks / (count * 100)) * 100;
        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : distinction");
            break;
        case 8:
        case 7:
            System.out.println("Grade : first division");
            break;
        case 6:
            System.out.println("Grade : second division");
            break;
        case 5:
            System.out.println("Grade : third division");
            break;
        default:
            System.out.println("Grade : fail");
            break;
        }
    }
}
