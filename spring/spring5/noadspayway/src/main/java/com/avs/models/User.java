package com.avs.models;

import com.avs.models.user.Address;
import com.avs.models.user.CreditCards;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "email", unique = true, columnDefinition = "VARCHAR(64)")
    private String email;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "partner_id")
    private Partner partner;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<CreditCards> creditCards = new HashSet<>();
    @OneToOne
    private Address address;

    public User(String email, String userName, String password, String firstName, String lastName, Partner partner, Set<CreditCards> creditCards, Address address) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.partner = partner;
        this.creditCards = creditCards;
        this.address = address;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public Set<CreditCards> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(Set<CreditCards> creditCards) {
        this.creditCards = creditCards;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!email.equals(user.email)) return false;
        return userName.equals(user.userName);
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + userName.hashCode();
        return result;
    }


}
