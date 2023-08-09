public class main {
    public static void main(String[] args) {
        int sum = 200;
        int income = 1680;
        int bonus;
        int total;
        if (income > 1000) {
            bonus = income / 100;
            total = sum + income + bonus;
        } else {
            bonus = 0;
            total = sum + income;
        }
        System.out.println("Итоговый счет: " + total);
        System.out.println("Бонусы: " + bonus);
    }
}

