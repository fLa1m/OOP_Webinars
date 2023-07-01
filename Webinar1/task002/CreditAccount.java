package Webinar1.task002;

public class CreditAccount extends Account {
    private Double percent;

    public CreditAccount(Integer id, String owner, Double balance, Double percent) {
        super(id, owner, balance);
        this.percent = percent;
    }

    public CreditAccount() {
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    protected void calculateInterest() {
        Double result = getBalance() * percent / 100;
        withdraw(result);
    }
}
