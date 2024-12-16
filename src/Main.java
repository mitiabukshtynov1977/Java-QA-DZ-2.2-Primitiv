public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int depositAmount = 1100;
        int bonusRubles = 0;
        int totalBalance = initialBalance + depositAmount;
        if (depositAmount > 1000) {
            bonusRubles = (depositAmount / 100);
            totalBalance += bonusRubles;
        }
        System.out.println("Начальный счёт: " + initialBalance + " рублей");
        System.out.println("Сумма пополнения: " + depositAmount + " рублей");
        System.out.println("Начисленные бонусные рубли: " + bonusRubles + " рублей");
        System.out.println("Итоговый счёт: " + totalBalance + " рублей");
    }
}