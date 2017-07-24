package com.company.State;

import com.company.HumanBuilder.GodCreator;
import com.company.HumanBuilder.Human;
import com.company.HumanBuilder.MethodCreator;

/**
 * Created by trangngo on 7/6/17.
 */
public class Demo {


    public static void main(String[] args) {
        // write your code here
        //
        // Thượng đế
        GodCreator godCreator = new MethodCreator();

        // Khi thượng đế tạo ra Trump
        Human trumpDonal = godCreator.setName("trump")
                .setArm(2)
                .setEyes(1)
                .setMouth(1)
                .build();

        System.out.println(trumpDonal);
        System.out.println("-----------------------------------");

        CamDo camDo = new CamDo();

        // Khi ... bị cám dỗ
        Customer doNamTrung = camDo.setHuman(trumpDonal)
                .setKind(NewBie.getInstance()).duaVaoDoi();

        System.out.println(doNamTrung); // Khi Trump mới bị cám dỗ
        System.out.println("-------------------");

        // Từng ngày từng ngày ...
        doNamTrung.diAy(1); // Ngày thứ 1
        doNamTrung.diAy(2); // Ngày thứ 2
        doNamTrung.diAy(3); // Ngày thứ 3
        doNamTrung.diAy(4); // Ngày thứ 4
        doNamTrung.diAy(3); // Ngày thứ 5
        doNamTrung.diAy(1); // Ngày thứ 6

        System.out.println("-------------------"); // Sau khi Trump sau 6 ngay
        System.out.println(doNamTrung);

    }
}
