package org.design;

import org.design.enums.BelongTo;
import org.design.enums.ChevalierType;

public class Chevalier implements Cloneable{

    private BelongTo belongTo;

    private ChevalierType type;

    private Integer attack;

    private Integer lief;

    public Chevalier() {
    }

    public Chevalier(BelongTo belongTo, ChevalierType type, Integer attack, Integer lief) {
        this.belongTo = belongTo;
        this.type = type;
        this.attack = attack;
        this.lief = lief;
    }

    public BelongTo getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(BelongTo belongTo) {
        this.belongTo = belongTo;
    }

    public ChevalierType getType() {
        return type;
    }

    public void setType(ChevalierType type) {
        this.type = type;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getLief() {
        return lief;
    }

    public void setLief(Integer lief) {
        this.lief = lief;
    }

    @Override
    public Chevalier clone(){
        Chevalier clone = null;
        try {
            clone = (Chevalier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }
}
