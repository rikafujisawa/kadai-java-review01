
public class Review02 {

    public static void main(String[] args) {
        // iの値が0から101より小さい間、処理を繰り返す
        for (int i = 1; i < 101; i++) {

            // 整数が3で割り切れ、なおかつ5で割り切れる数
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                // iの値が3で割り切れるとき
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                // iの値が5で割り切れるとき
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                // iの値を表示する
                System.out.println(i);
            }
        }
    }
}
