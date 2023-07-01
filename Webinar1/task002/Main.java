package Webinar1.task002;

public class Main {
    public static void main(String[] args) {
        CreditAccount acc1 = new CreditAccount(1, "Mokin", 1000.0, 10.0);
        SavingAccount acc2 = new SavingAccount(2, "Mokina", 2000.0, 11.0);
        System.out.println("Баланс acc1: " + acc1.getBalance());
        acc1.calculateInterest();
        System.out.println("Баланс acc1: " + acc1.getBalance());
        System.out.println("Баланс acc2: " + acc2.getBalance());
        acc2.addInterest();
        System.out.println("Баланс acc2: " + acc2.getBalance());
    }
}
