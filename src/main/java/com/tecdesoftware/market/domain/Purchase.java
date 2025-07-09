package com.tecdesoftware.market.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {
    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Purchaseitem> getItem() {
        return item;
    }

    public void setItem(List<Purchaseitem> item) {
        this.item = item;
    }

    private int purchaseId;
    private String clientID;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private String state;
    private List<Purchaseitem> item;

}
