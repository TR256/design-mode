package org.design;

public class ChainConfig {

    private AbstractAudit chain;

    public ChainConfig(AbstractAudit chain) {
        this.chain = new PlayerAudit("player");
    }
}
