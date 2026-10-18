// 5. Calculate Total and Average
// Write a Java program to store marks of three subjects in variables and calculate the total and average marks.

public class TotalAndAverage {
    public static void main(String[] args) {

        int subject1 = 85;
        int subject2 = 90;
        int subject3 = 95;

        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        System.out.println("Subject 1 Marks = " + subject1);
        System.out.println("Subject 2 Marks = " + subject2);
        System.out.println("Subject 3 Marks = " + subject3);
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

    }
}
