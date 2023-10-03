import java.util.Scanner;
public class StudentRunner {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name of a student: ");
        String fName = scan.nextLine();
        System.out.println("Enter the last name of a student: ");
        String lName = scan.nextLine();
        System.out.println("Enter a student's graduate year: ");
        int gYear = scan.nextInt();
        Student std1 = new Student(fName, lName, gYear);
        System.out.println( );

        boolean menu = false;
        while (!menu) {
            System.out.println("MAIN MENU:");
            System.out.println("1. Update graduation year");
            System.out.println("2. Add test score");
            System.out.println("3. View test average");
            System.out.println("4. View highest test score");
            System.out.println("5. View all student info");
            System.out.println("6. Exit");
            int option = scan.nextInt();
            System.out.println( );
            if(option == 1) {
                System.out.print("Enter a new graduate year: ");
                int newGYear = scan.nextInt();
                std1.setGradYear(newGYear);
            } else if(option == 2) {
                System.out.print("Enter a new test score: ");
                double newTScore = scan.nextDouble();
                std1.addTestScore(newTScore);
                std1.getHighestTestScore();
            } else if(option == 3) {
                System.out.println(std1.averageTestScore());
            } else if(option == 4) {
                System.out.println(std1.getHighestTestScore());
            } else if(option == 5) {
                std1.printStudentInfo();
            } else if(option == 6) {
                System.out.println("Goodbye!");
                menu = true;
            } else {
                System.out.println("Invalid option, try again");
            }
            System.out.println( );
        }
    }
}

