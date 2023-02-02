package School;

public class Course {
    private String course;
    private int number;
    private int hours;

    public Course(String course, int number,int hours ){
        this.course = course;
        this.number = number;
        this.hours = hours;
    }
    public String toString(){
        return course + " " + number + ", " + hours +" credit hours.";
    }
}