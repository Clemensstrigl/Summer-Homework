package problemset_six.problem_two;



public class ClientTester {
        public static void main(String[] args) {
            StudentRecord record = new StudentRecord("Calculus", 502345); // note, id could be an int if you wish
            System.out.println("Student id for this score: " + record.getStudentID() );
            System.out.println("Is this score empty? " + record.isEmpty() );
            System.out.println("Adding two scores:");
            record.addScores(92);
            record.addScores(87);
            System.out.println("Is this score empty? " + record.isEmpty() );
            System.out.println("Number of scores: " + record.getScoresEntered() );
            System.out.println("Total points: " + record.getTotalPointsEarned() );
            System.out.println("Percent: " + record.getPercentInClass() );
        }
    }

