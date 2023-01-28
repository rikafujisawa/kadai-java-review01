
public class clock {

    public static void main(String[] args) {
        int seconds = getSeconds(22, 20, 20);
        System.out.println(seconds);

    }

    public static int getSeconds(int h, int m, int s) {
        int result = h * 3600 + m*60 + s;
        return result;
    }
}
