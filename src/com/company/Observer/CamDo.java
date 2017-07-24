package com.company.Observer;

import com.company.HumanBuilder.Human;
import com.company.State.Customer;
import com.company.State.Kind;

/**
 * Created by trangngo on 7/7/17.
 */
public class CamDo {

    Function function;

    public CamDo() {
    }

    public CamDo setFunction(Function function){
        this.function = function;
        return this;
    }

    public Function duaVaoDoi(){
        System.out.println(function.human.getName() + " Đã bị cám dỗ đưa vào đời!");
        return function;
    }

    public CamDo setHuman(Human human){
        function.human = human;
        return this;
    }

}
