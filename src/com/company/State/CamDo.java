package com.company.State;

import com.company.HumanBuilder.Human;


/**
 * Created by trangngo on 7/6/17.
 */
public class CamDo {

    Customer customer;

    public CamDo() {
        customer = new Customer();
    }

    public Customer duaVaoDoi(){
        System.out.println(customer.human.getName() + " Đã bị cám dỗ đưa vào đời!");
        return customer;
    }

    public CamDo setHuman(Human human){
        customer.human = human;
        return this;
    }

    public CamDo setKind(Kind kind){
        customer.kind = kind;
        return this;
    }

}
