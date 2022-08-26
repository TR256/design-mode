package com.builder;

/**
 * @author:tr256
 * @date:2022/8/26
 * 具体的建造者
 */
public class JaxBuilder extends HeroBuilder{

    @Override
    public void setA() {
        hero.setA("(被动技能)贾克斯的连续基本攻击可以提升他的3.6%攻速3秒，最高叠加8层。");
    }

    @Override
    public void setQ() {

        hero.setQ("贾克斯跳向目标，如果是敌人的话，用手中的武器对目标造成55+100%额外攻击力+60%法强的物理伤害。");
    }

    @Override
    public void setW() {
        hero.setW("贾克斯以能量充填自己的武器，使自己下一次的攻击造成45+60%法强的魔法伤害。");
    }

    @Override
    public void setE() {
        hero.setE("贾克斯的战斗能力让他得以在短时间内回避所有攻击，然后迅速反击，击晕周围的所有敌人1秒并造成50+50%额外攻击力的物理伤害，每闪避一次提升此伤害20%，上限100%。");
    }

    @Override
    public void setR() {
        hero.setR("贾克斯每3次连续普攻，就会造成额外100+70%法强的魔法伤害。除此之外，贾克斯可以发动此技能来释放身体潜能，短时间内增加他的30+50%额外攻击力的物理防御与30+20%法强的魔法防御。");
    }

    @Override
    public Hero getHero() {
        return hero;
    }
}
