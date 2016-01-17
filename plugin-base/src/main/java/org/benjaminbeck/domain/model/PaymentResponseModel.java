package org.benjaminbeck.domain.model;

import org.benjaminbeck.domain.constant.PaymentStatusCode;
import org.benjaminbeck.domain.constant.*;

import java.io.Serializable;

/**
 * Created by Benjamin.Beck on 11/22/2015.
 */
public class PaymentResponseModel implements Serializable {

    private String cardHolderName;

    private String expiryDate;

    private Double amount;

    private String firstName;

    private String lastName;

    private PaymentStatusCode statusCode = PaymentStatusCode.SUCCESS;

    private Long transactionId;

    private String bankingSystem;

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

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

    public PaymentStatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(PaymentStatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getBankingSystem() {
        return bankingSystem;
    }

    public void setBankingSystem(String bankingSystem) {
        this.bankingSystem = bankingSystem;
    }

    @Override
    public String toString() {
        return "PaymentResponseDTO [cardHolderName=" + cardHolderName + ", firstName=" + firstName + ", lastName="
                + lastName + ", amount=" + amount + ", statusCode=" + statusCode + ", transationId=" + transactionId + "]";
    }

}