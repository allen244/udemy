package com.avs.models;


import org.hibernate.annotations.GeneratorType;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "partner")
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "partner_id")
    private long partnerId;
    private String partnerName;
    @OneToMany(mappedBy = "partner", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<User> users = new HashSet<>();


    public long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(long partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Partner() {
    }

    public Partner(String partnerName) {
        this.partnerName = partnerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Partner partner = (Partner) o;

        return partnerId == partner.partnerId;
    }

    @Override
    public int hashCode() {
        return (int) (partnerId ^ (partnerId >>> 32));
    }

    @Override
    public String toString() {
        return "Partner{" +
                "partnerId=" + partnerId +
                ", partnerName='" + partnerName + '\'' +
                ", users=" + users +
                '}';
    }
}
