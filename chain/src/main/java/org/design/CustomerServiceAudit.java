package org.design;

public class CustomerServiceAudit extends AbstractAudit {

    private CustomerService customerService;

    public CustomerServiceAudit(String name){
        super(name);
        System.out.println("---->人工审核");
    }
    @Override
    public void process() {
        if (customerService.opinion){
            System.out.println("人工检测：被举报玩家确实存在违规行为!");
        }
    }


}
