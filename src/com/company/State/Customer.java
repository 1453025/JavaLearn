package com.company.State;

import com.company.HumanBuilder.Human;

/**
 * Created by trangngo on 7/6/17.
 */
public class Customer {

    Human human;
    Kind kind;
    int hours;


    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    void diAy(int hours){
        this.hours += hours;
        System.out.println(human.getName() + " đã đi ... thêm " + hours + " tiếng");
        if (this.getHours() >= 10 && !(kind instanceof Vip)){
            kind = Vip.getInstance();
            System.out.println();
            System.out.println("Wow! Chúc mừng " + human.getName() + " đã đi hơn 10 tiếng! Từ bây giờ " + human.getName() + " đã trở thành " + kind.name());
            System.out.println();
        }
        System.out.println(human.getName() + " phải trả " + kind.caculate(hours) + "k cho cuộc vui này!");
    }

    @Override
    public String toString() {
        return human.getName() + " (" + kind.name() + ")" + " Đã có thời gian đi ... là " + getHours() + " giờ!";
    }
}
