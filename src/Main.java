public class Main {
    public static void main(String[] args) {
        int moneyintheAccount = 50;
        int topUp = 1500;
        int bonus = topUp / 100;
        if (topUp > 1000) {
            System.out.println("бонус начисляется");
        } else {
            System.out.println("bonus Неначисляется");
        }
        System.out.println(moneyintheAccount + topUp + bonus);
    }
}