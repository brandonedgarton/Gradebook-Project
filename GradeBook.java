import java.util.ArrayList;
import java.util.List;

//This is my GradeBook Project
public class GradeBook
{
    private final int NUM_STUDENTS = 5;
    private final int NUM_TESTS = 4;

    private String[] names = new String[NUM_STUDENTS];
    private double[][] scores = new double[NUM_STUDENTS][NUM_TESTS];
    
    public void setName(int studentNumber, String name)
    {
        names[studentNumber] = name;
    }
    
    public void setScores(int studentNumber, double[] scores)
    {
        this.scores[studentNumber] = scores;
    }
    
    public String getName(int studentNumber)
    {
        return names[studentNumber];
    }
    
    public double getAverage(int studentNumber)
    {
        double sum = 0.0;

        for(double score : scores[studentNumber]) {
            sum += score;
        }
        
        return sum / NUM_TESTS;
    }
    
    public char getLetterGrade(int studentNumber)
    {
        double average = getAverage(studentNumber);

        if(average >= 90)
        {
            return 'A';
        }
        else if(average >= 80)
        {
            return 'B';
        }
        else if(average >= 70)
        {
            return 'C';
        }
        else if(average >= 60)
        {
            return 'D';
        }
        else
        {
            return 'E';
        }
    }

    public List<String> getStudentsAboveThreshold(double threshold){
        List<String> students = new ArrayList<>();

        for(int i = 0; i < names.length; i++){
            if(getAverage(i) > threshold){
                students.add(names[i]);
            }
        }
        return students;
    }

}