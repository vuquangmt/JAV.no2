package session6;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            if(x == 10){
                throw new NullPointerException();
            }
            System.out.println(x + ":" + y + "=");
            int z = x / y;
            System.out.println(z);
        }catch (NullPointerException n){
            System.out.println("NULL ...");
        } catch (ArithmeticException ae) {
            // ngoai le toan hoc
            System.out.println("Tinh toan sai rồi, xem lại đi");
        }catch (Exception e){
            System.out.println("Loi roi, xem lai di");
        }finally {
            // luc nao cung chay qua day
        }
    }
}