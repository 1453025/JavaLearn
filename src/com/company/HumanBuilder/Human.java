package com.company.HumanBuilder;

import java.lang.annotation.Documented;

/**
 * Created by trangngo on 7/6/17.
 */
public class Human implements Cloneable {
    String name;
    Integer eyes;
    Integer mouth;
    Integer arm;
    Integer leg;
    Integer length;
    boolean snob;
    boolean fat;
    public Human(){

    }

    public Human(String name, Integer eyes, Integer mouth, Integer arm, boolean snob) {
        this.name = name;
        this.eyes = eyes;
        this.mouth = mouth;
        this.arm = arm;
        this.snob = snob;
    }


    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEyes() {
        return eyes;
    }

    public void setEyes(Integer eyes) {
        this.eyes = eyes;
    }

    public Integer getMouth() {
        return mouth;
    }

    public void setMouth(Integer mouth) {
        this.mouth = mouth;
    }

    public Integer getArm() {
        return arm;
    }

    public void setArm(Integer arm) {
        this.arm = arm;
    }

    public Integer getLeg() {
        return leg;
    }

    public void setLeg(Integer leg) {
        this.leg = leg;
    }

    public boolean isSnob() {
        return snob;
    }

    public void setSnob(boolean snob) {
        this.snob = snob;
    }

    public boolean isFat() {
        return fat;
    }

    public void setFat(boolean fat) {
        this.fat = fat;
    }

    public String getStringSnob(){
        return isSnob() == true ? "cực kì chảnh cún": "không chảnh lắm";
    }

    @Override
    public Human clone(){
        try {
            return (Human) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public String toString() {
        return "Thượng đế đã tạo ra " + getName() + " với đặc điểm nhận dạng là: " + getArm() + " Tay, " + getEyes() + " Mắt, " + getMouth() +
                " Miệng và " +getStringSnob();
    }
}
