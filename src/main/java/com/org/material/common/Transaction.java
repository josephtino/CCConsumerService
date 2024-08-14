/**
 * © 2024 JTino Inc. Author: Joseph Tino.
 * Redistribution permitted with attribution. Provided "as is" without warranty.
 * No liability for damages. See full license for details.
 */

package com.org.material.common;

public class Transaction {

    private String transactionId;
    private String cardNumber;
    private double amount;
    private long timestamp;
    private String merchantId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    //TODO use lombok

}
