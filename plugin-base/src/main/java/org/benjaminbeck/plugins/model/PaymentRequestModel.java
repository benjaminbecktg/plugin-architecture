package org.benjaminbeck.plugins.model;
import java.io.Serializable;

/**
/**
 * Created by Benjamin.Beck on 11/22/2015.
 */

public class PaymentRequestModel implements Serializable {

    private String cardHolderName;

    private String cardNumber;

    private String expiryDate;

    private Double amount;

    private String firstName;

    private String lastName;

    private String bankingSystem = "eastern";

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() { return expiryDate; }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBankingSystem() {
        return bankingSystem;
    }

    public void setBankingSystem(String bankingSystem) {
        this.bankingSystem = bankingSystem;
    }

    @Override
    public String toString() {
        return "PaymentRequestDTO [cardHolderName=" + cardHolderName + ", amount=" + amount + ", firstName="
                + firstName + ", lastName=" + lastName + "]";
    }
}