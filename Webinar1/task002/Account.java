package Webinar1.task002;

public class Account {
    private Integer id;
    private String owner;
    private Double balance;

    public Account() {
    }

    public Account(Integer id, String owner, Double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    protected Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    protected void deposit(Double amount) {
        balance += amount;
    }

    protected void withdraw(Double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на счете. Остаток на счете: " + balance);
        }

    }
}
