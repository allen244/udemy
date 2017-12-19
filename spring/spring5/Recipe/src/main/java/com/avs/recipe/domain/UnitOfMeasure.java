package com.avs.recipe.domain;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uomId;
    private String description;


    public Long getUomId() {
        return uomId;
    }

    public void setUomId(Long uomId) {
        this.uomId = uomId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
