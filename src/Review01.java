
public class Review01 {

        public static void main(String[] args) {
            int price = 1500;
            int tax =(int)(price * 0.1);
            int pay;
            pay= taxMethod(price, tax);

           System.out.println("1500円の商品の税込価格は"+ pay + "円" + "(消費税は"+ tax + "円)です。");
         }

           public static int taxMethod(int price, int tax) {

              int pay =  (int) price + (int) + tax;
              return  pay;
         }

}