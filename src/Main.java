public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int bonus;
        int transfer = 1010;
        if (transfer > 1000) if (transfer % 100 == 0)
            bonus = transfer / 100;
        else
            bonus = (transfer - transfer % 100) / 100;
        else
            bonus = 0;
        balance = balance + bonus + transfer;
        System.out.println("Баланс= " + balance + " Бонус= " + bonus);
    }
}