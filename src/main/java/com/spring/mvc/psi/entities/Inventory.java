
package com.spring.mvc.psi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "INVENTORY")
public class Inventory {
    @Id
    private Integer id;
    
    @Column
    private String name;
    
    @Column(name = "PU_QTY")
    private Integer puQTY;
    
    @Column(name = "PU_TOTAL")
    private Integer puTotal;
    
    @Column(name = "SA_QTY")
    private Integer saQTY;
    
    @Column(name = "SA_TOTAL")
    private Integer saTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPuQTY() {
        return puQTY;
    }

    public void setPuQTY(Integer puQTY) {
        this.puQTY = puQTY;
    }

    public Integer getPuTotal() {
        return puTotal;
    }

    public void setPuTotal(Integer puTotal) {
        this.puTotal = puTotal;
    }

    public Integer getSaQTY() {
        return saQTY;
    }

    public void setSaQTY(Integer saQTY) {
        this.saQTY = saQTY;
    }

    public Integer getSaTotal() {
        return saTotal;
    }

    public void setSaTotal(Integer saTotal) {
        this.saTotal = saTotal;
    }

    @Override
    public String toString() {
        return "Inventory{" + "id=" + id + ", name=" + name + ", puQTY=" + puQTY + ", puTotal=" + puTotal + ", saQTY=" + saQTY + ", saTotal=" + saTotal + '}';
    }
    
    
}
