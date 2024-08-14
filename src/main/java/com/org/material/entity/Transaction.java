/**
 * © 2024 JTino Inc. Author: Joseph Tino.
 * Redistribution permitted with attribution. Provided "as is" without warranty.
 * No liability for damages. See full license for details.
 */

package com.org.material.entity;
import jakarta.persistence.*;

    @Entity
    @Table(name = "transaction")
    public class Transaction {

        @Id
        private String transactionId;
        @Column
        private String cardNumber;
        @Column
        private double amount;
        @Column
        private long timestamp;
        @Column
        private String merchantId;
        @Column
        private String status;

    public Transaction(String transactionId, String cardNumber, double amount, long timestamp, String merchantId, String status) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.timestamp = timestamp;
        this.merchantId = merchantId;
        this.status = status;
    }

    public Transaction() {
    }

    // Getters and Setters
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


