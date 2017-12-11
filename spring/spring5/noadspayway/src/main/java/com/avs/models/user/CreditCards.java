package com.avs.models.user;

import com.avs.models.User;

import javax.persistence.*;

@Entity
@Table(name="credit_card")
public class CreditCards {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cid;
    private int cardNumber;
    private String type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "email")
    private User user;

    public CreditCards(int cardNumber, String type, User user) {
        this.cardNumber = cardNumber;
        this.type = type;
        this.user = user;
    }

    public CreditCards() {
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCards that = (CreditCards) o;

        if (cardNumber != that.cardNumber) return false;
        return user != null ? user.equals(that.user) : that.user == null;
    }

    @Override
    public int hashCode() {
        int result = cardNumber;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }


}
