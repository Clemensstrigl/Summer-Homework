package problemset_six.problem_two;

import java.util.ArrayList;

public class StudentRecord {
    int StudentID;
    String course;
    ArrayList<Integer> Scores = new ArrayList<Integer>();
    int scoresEntered = 0;
    float percentInClass;
    int TotalPointsEarned = 0;
    boolean isEmpty = true;
    int MaxPoints = 100;
    public StudentRecord(String course, int StudentId) {
        this.course = course;
        this.StudentID = StudentId;
    }

    public int getStudentID() {
        return StudentID;
    }

    public int getScoresEntered() {
        return scoresEntered;
    }

    public float getPercentInClass() {
        if(!isEmpty) {
            int TotaPointsIntTheClass = MaxPoints * Scores.size();
            float Percentage = 100 / TotaPointsIntTheClass;
            for (int i = 0; i < Scores.size(); i++) {
                percentInClass += Scores.get(i) * Percentage;
            }
        }
        return percentInClass;
    }

    public int getTotalPointsEarned() {
        if(!isEmpty) {
            for (int i = 0; i < Scores.size(); i++) {
                TotalPointsEarned += Scores.get(i);
            }
            return TotalPointsEarned;
        }
        else{
            return 0;
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void addScores(int score) {
        isEmpty = false;
        Scores.add(score);
        scoresEntered ++;
    }
}
