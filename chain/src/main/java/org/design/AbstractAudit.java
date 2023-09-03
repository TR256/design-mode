package org.design;

public abstract class AbstractAudit {

    private String name;

    private String opinion;

    public AbstractAudit(String name) {
        this.name = name;
    }

    private AbstractAudit next;

    public AbstractAudit getNext() {
        return next;
    }

    public AbstractAudit appendNext(AbstractAudit next){
        this.next = next;
        return this;
    }

    public abstract void process();


}
