package School;

public class tester {
    public static void main(String[] args) {

        student lane_S = new student("Lane Sundberg");
        student john_s = new student("John Smith");
        student lewis_h = new student("Lewis Hamitlon");
        student Allen_l = new student("Allen Lazard");
        System.out.println(lane_S);
        System.out.println(john_s);
        System.out.println(lewis_h);
        System.out.println(Allen_l);
        System.out.println(lane_S.comp(Allen_l));
        System.out.println(lewis_h.comp(john_s));


    }
}
