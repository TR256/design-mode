package test;

import org.design.enums.BelongTo;
import org.design.Chevalier;
import org.design.enums.ChevalierType;

/**
 * 可以创建未知类型的对象
 */
public class PrototypeTest {

    public static void main(String[] args) {
        Chevalier blueChevalier = new Chevalier(BelongTo.BLUE, ChevalierType.ORDINARY, 30, 100);
        Chevalier redChevalier = new Chevalier(BelongTo.RED, ChevalierType.ORDINARY, 30, 100);
        Chevalier
                blue01 = blueChevalier.clone(),
                blue02 = blueChevalier.clone(),
                blue03 = blueChevalier.clone(),
                blue04 = blueChevalier.clone(),
                blue05 = blueChevalier.clone(); blue05.setType(ChevalierType.SUPPER);
        Chevalier
                red01 = redChevalier.clone(),
                red02 = redChevalier.clone(),
                red03 = redChevalier.clone(),
                red04 = redChevalier.clone(),
                red05 = redChevalier.clone(); red05.setType(ChevalierType.SUPPER);

        System.out.println(blue01.hashCode() + "\t"+ blue02.hashCode()+ "\t"+ blue03.hashCode()+ "\t"+ blue05.hashCode()+ "\t"+ blue05.hashCode());
        System.out.println(red01.hashCode() + "\t"+ red02.hashCode()+ "\t"+ red03.hashCode()+ "\t"+ red05.hashCode()+ "\t"+ red05.hashCode());

    }
}
