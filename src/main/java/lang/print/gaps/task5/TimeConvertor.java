package lang.print.gaps.task5;

public class TimeConvertor {
    public static void main(String[] args) {
        float amount = 11.5F;
        convert(amount);
    }
    public static void convert(float minutes) {
        minutes *= 60;
        System.out.println(minutes);
    }
}
