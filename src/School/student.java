package School;

public class student {
    private String name;
    private int ID;
    public static int nextID = 1000;

    public student(String name, int ID){
        this.name = name;
        this.ID = ID;

    }

    public student(String name){
        this.name = name;
        ID = student.nextID++;
    }
    public String New_name(String new_name){
        name = new_name;
        return name;
    }
    public boolean comp(student other){
        if (this.ID > other.ID){
            return false;
        }else {
            return true;
        }
    }


    public String toString(){
        return name +", " + ID;
    }
}
