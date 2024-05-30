import java.util.Scanner;

public class GradeBookInfo 
{
    public static void main(String[] args)
    {
        String temp;

        Scanner keyboard = new Scanner(System.in);
        double[][] scores1 = new double[5][4];
        GradeBook gBook = new GradeBook();
        
        for(int i = 1;i < 6;i++)
        {
            System.out.println("Enter Student Name " + i + " :");
            temp = keyboard.next();
            gBook.setName(i, temp);
            
            for(int j = 1;j < 5;j++)
            {
                System.out.println("Enter a Student's name " + i + " subject " 
                                   + j +" score :");
                scores1[i - 1][j - 1] = keyboard.nextDouble();
            }
            
            gBook.setScores(1, scores1[i - 1]);
        }
        
        for(int i = 1; i < 6; i++)
        {
            System.out.println(gBook.getName(i) + "'s average is "
                               + gBook.getAverage(i) + " with a grade of " 
                               + gBook.determineGrade(gBook.getAverage(i)));
        }
    }

}
