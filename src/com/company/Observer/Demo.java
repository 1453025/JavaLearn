package com.company.Observer;

import com.company.HumanBuilder.GodCreator;
import com.company.HumanBuilder.Human;
import com.company.HumanBuilder.MethodCreator;

/**
 * Created by trangngo on 7/7/17.
 */
public class Demo {
    public static void main(String[] args){
        GodCreator godCreator = new MethodCreator();

        // Khi thượng đế tạo ra ...
        Human obama = godCreator.setName("obama")
                .setArm(2)
                .setEyes(1)
                .setMouth(1)
                .build();
        Human thy = godCreator.setName("taylor")
                .setArm(2)
                .setEyes(1)
                .setMouth(1)
                .build();

        Human quynh = godCreator.setName("kaily")
                .setArm(2)
                .setEyes(1)
                .setMouth(1)
                .build();

        Human thao = godCreator.setName("selena")
                .setArm(2)
                .setEyes(1)
                .setMouth(1)
                .build();

        com.company.Observer.CamDo camDo = new com.company.Observer.CamDo();

        // Khi ... bị cám dỗ
        Guard obamaG = (Guard) camDo.setFunction(new Guard())
                .setHuman(obama)
                .duaVaoDoi();

        SellBody taylorCV = (SellBody) camDo.setFunction(new SellBody(500))
                .setHuman(thy)
                .duaVaoDoi();

        SellBody kailyCV = (SellBody) camDo.setFunction(new SellBody(350))
                .setHuman(quynh)
                .duaVaoDoi();

        SellBody selenaCV = (SellBody) camDo.setFunction(new SellBody(450))
                .setHuman(thao)
                .duaVaoDoi();


        obamaG.register(taylorCV);
        obamaG.register(kailyCV);
        obamaG.register(selenaCV);


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obamaG.notifyAllObservers();


    }
}
