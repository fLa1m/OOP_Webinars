package Webinar1.task002;

public class SavingAccount extends Account {
    Double percent;

    public SavingAccount(Integer id, String owner, Double balance, Double percent) {
        super(id, owner, balance);
        this.percent = percent;
    }

    public SavingAccount() {
    }

    protected void addInterest() {
        Double result = getBalance() * percent / 100;
        deposit(result);
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }
}
