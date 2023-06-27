package coders.iyun6;

import java.time.LocalDate;

public class Card {
    private User user;
    private String cardNumber;
    private LocalDate expireDate; // bitme muddeti

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double amount;

    public Card() {
    }

    public Card(User user, String cardNumber, LocalDate expireDate,double amount) {
        this.user = user;
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "user=" + user +
                ", cardNumber='" + cardNumber + '\'' +
                ", expireDate=" + expireDate +
                ", amount=" + amount +
                '}';
    }
}
