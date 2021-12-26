public class ATM {

    /*500, 200, 100, 50, 20, 10, 5, 2 и 1*/
    public int countBanknotes(int sum) {
        int[] banknotesValue = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int i = 0;
        while (i < banknotesValue.length) {
            int n = sum / banknotesValue[i];
            sum-=banknotesValue[i]*n;
            count+=n;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println("atm.countBanknotes(578) = " + atm.countBanknotes(551));
    }
}
