
public class IfElseIfSample {

    public static void main(String[] args) {
        int scoresansu = 59; // 算数の成績
        int scorekokugo = 50; // 国語の成績

        if (scoresansu >= 60 && scorekokugo >= 60) {
            System.out.println("合格してます！");
        } else if (scoresansu >= 60 || scorekokugo >= 60) {
            System.out.println("算数か国語どちらかが補講対象です！");

        } else
            System.out.println("赤点です…。。補講を行います！");
    }




}
