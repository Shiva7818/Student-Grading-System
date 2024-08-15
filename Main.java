import java.util.Scanner;

class SubjectGrades {
    private String subjectName;
    private int internalMarks;
    private int externalMarks;
    private double creditPoints;
    private int totalMarks;

    public void setTotalMarks(int totalMarks){
        this.totalMarks = totalMarks;
    }

    public int getTotalMarks(){
        return totalMarks;
    }

    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public void setInternalMarks(int internalMarks){
        this.internalMarks = internalMarks;
    }

    public void setExternalMarks(int externalMarks){
        this.externalMarks = externalMarks;
    }

    public void setCreditPoints(double creditPoints){
        this.creditPoints = creditPoints;
    }

    public double getCreditPoints(){
        return creditPoints;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public int getTotalMarksObtained(){
        return internalMarks + externalMarks;
    }

    public int getInternalMarks(){
        return internalMarks;
    }

    public int getExternalMarks(){
        return externalMarks;
    }

    public double calculateCreditScore(int maxMarks, double creditPoints, int marksObtained){
        double gradePoints;
        double tenPercent = 0.1 * maxMarks;

        if(marksObtained > (maxMarks - tenPercent)){
            gradePoints = 10;
        } else if(marksObtained > (maxMarks - 2 * tenPercent)){
            gradePoints = 9;
        } else if(marksObtained > (maxMarks - 3 * tenPercent)){
            gradePoints = 8;
        } else if(marksObtained > (maxMarks - 4 * tenPercent)){
            gradePoints = 7;
        } else if(marksObtained > (maxMarks - 5 * tenPercent)){
            gradePoints = 6;
        } else if(marksObtained > (maxMarks - 6 * tenPercent)){
            gradePoints = 5;
        } else if(marksObtained > (maxMarks - 7 * tenPercent)){
            gradePoints = 4;
        } else {
            gradePoints = 0;
        }
        return gradePoints * creditPoints;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter the number of subjects: ");
        student.setNumberOfSubjects(scanner.nextInt());
        System.out.println("The SGPA is: " + student.calculateSGPA());
        scanner.close();
    }
}

class Student {
    Scanner scanner = new Scanner(System.in);
    private int numberOfSubjects;

    public void setNumberOfSubjects(int numberOfSubjects){
        this.numberOfSubjects = numberOfSubjects;
    }

    public double calculateSGPA(){
        SubjectGrades[] subjects = new SubjectGrades[numberOfSubjects];
        double totalCredits = 0;
        double totalCreditScore = 0;

        for(int i = 0; i < numberOfSubjects; i++){
            subjects[i] = new SubjectGrades();
            System.out.println("Enter the subject name:");
            subjects[i].setSubjectName(scanner.next());
            scanner.nextLine();
            System.out.println("Enter the credit points for the subject:");
            subjects[i].setCreditPoints(scanner.nextDouble());
            System.out.println("Enter internal marks for the subject:");
            subjects[i].setInternalMarks(scanner.nextInt());
            System.out.println("Enter external marks for the subject:");
            subjects[i].setExternalMarks(scanner.nextInt());
            System.out.println("Enter total marks for the subject:");
            subjects[i].setTotalMarks(scanner.nextInt());

            totalCredits += subjects[i].getCreditPoints();
            totalCreditScore += subjects[i].calculateCreditScore(subjects[i].getTotalMarks(), subjects[i].getCreditPoints(), subjects[i].getTotalMarksObtained());
        }
        return totalCreditScore / totalCredits;
    }
}
