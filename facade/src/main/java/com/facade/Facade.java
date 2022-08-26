package com.facade;

/**
 * 外观角色
 */
public class Facade {

    private OneSubsidiary oneSubsidiary = new OneSubsidiary();

    private TwoSubsidiary twoSubsidiary = new TwoSubsidiary();

    private ThreeSubsidiary threeSubsidiary = new ThreeSubsidiary();

    public void oneOperate() {
        this.oneSubsidiary.oneOperate();
    }


    public void twoOperate() {
        this.twoSubsidiary.twoOperate();
    }


    public void threeOperate() {
        this.threeSubsidiary.threeOperate();
    }
}
