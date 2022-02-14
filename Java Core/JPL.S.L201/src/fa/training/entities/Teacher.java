package fa.training.entities;

public abstract class Teacher {
    String designation;
    String collegeName;

    public Teacher() {
        designation = null;
        collegeName = null;
    }

    public Teacher(String designation, String collegeName) {
        this.designation = designation;
        this.collegeName = collegeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public abstract void teach();

    public void teach(int duration) {
        System.out.println("Teaching in " + duration + "minute");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "designation='" + designation + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

}
