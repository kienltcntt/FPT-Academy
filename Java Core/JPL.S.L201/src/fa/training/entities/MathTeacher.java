package fa.training.entities;

public class MathTeacher extends Teacher implements Actionable {
    String mainSubject;

    public MathTeacher() {
        mainSubject = null;
    }

    public MathTeacher(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public MathTeacher(String designation, String collegeName, String mainSubject) {
        super(designation, collegeName);
        this.mainSubject = mainSubject;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    @Override
    public String toString() {
        return "MathTeacher{" +
                "mainSubject='" + mainSubject + '\'' +
                ", designation='" + designation + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    @Override
    public void toSchool() {
        System.out.println("Math teacher go to school by car!");
    }

    @Override
    public void teach() {
        System.out.println("Teaching math subject");
    }

    public int sum(int number1,int number2) {
        return number1 + number2;
    }
    //Math Teacher[i] - mảng giáo viên
}
