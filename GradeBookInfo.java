import java.util.List;
import java.util.Scanner;

public class GradeBookInfo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double[][] scores1 = new double[5][4];
        GradeBook gBook = new GradeBook();
        
        for(int i = 1;i < 5;i++)
        {
            System.out.println("Enter Student Name " + (i) + " :");
            String name = keyboard.next();
            gBook.setName(i, name);
            
            for(int j = 0;j < 4;j++)
            {
                System.out.println("Enter " + name + "'s subject " 
                                   + (j + 1) + " score :");
                scores1[i][j] = keyboard.nextDouble();
            }
            
            gBook.setScores(i, scores1[i]);
        }
        
        for(int i = 0; i < 5; i++)
        {
            String studentName = gBook.getName(i);
            if(studentName != null && !studentName.isEmpty()){
                
                System.out.println(gBook.getName(i) + "'s average is "
                               + gBook.getAverage(i) + " with a grade of " 
                               + gBook.getLetterGrade(i));
            }
        
        }

        System.out.println("Enter the threshold score to list students above it: ");
        double threshold = keyboard.nextDouble();
        List<String> studentsAboveThreshold = gBook.getStudentsAboveThreshold(threshold);

        System.out.println("Students with average score above " + threshold + ":");
        for(String student : studentsAboveThreshold){
            System.out.println(student);
        }

        System.out.println("Enter the grade to list students with that grade: ");
        char grade = keyboard.next().charAt(0);
        List<String> studentsWithGrade = gBook.getStudentsWithGrade(grade);

        System.out.println("Students with grade " + grade + ":");
        for(String student : studentsWithGrade){
            System.out.println(student);
        }

        keyboard.close();
    }

}
