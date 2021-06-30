package com.demo.oop;

/**
 * @Description 子类调用父类set方法，数据会在哪里？
 * @Author chuang.li
 * @Date 2021/6/30 17:27
 */
public class OOPTest {
    public static void main(String[] args) {
        Son son = new Son();
        son.set();
        System.out.println(son.get());
    }
}


class Son extends Father {

    public Integer get(){
        return this.getAge();
    }

    public void set(){
        super.setAge(20);
    }

}

abstract class Father {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}