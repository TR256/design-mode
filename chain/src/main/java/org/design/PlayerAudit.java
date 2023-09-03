package org.design;

public class PlayerAudit extends AbstractAudit {

    public PlayerAudit(String name) {
        super(name);
    }

    @Override
    public void process() {
        if (!Player.opinion) {
            return;
        }
        getNext().process();
    }

}
