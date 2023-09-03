package org.design;

public class SystemAudit extends AbstractAudit {
    public SystemAudit(String name) {
        super(name);
        System.out.println("----->系统审核");
    }
    @Override
    public void process() {
        boolean illegal = GameSystem.arbitrate();
        if (!illegal){
            System.out.println(">>>系统审核结果：未检测到被举报玩家存在违规行为！");
            return;
        }
        System.out.println(">>>系统审核结果：已检测到被举报玩家存在违规行为！");
        AbstractAudit next = super.getNext();
        if (next!=null){
            next.process();
        }
    }


}
