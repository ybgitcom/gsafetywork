package com.gsafety.code;


/**
 * created by yb
 * Date:2018/5/8
 */
public abstract class Demo70 {

    abstract void testAbstract();

    Demo70() {//��1������ִ�и��๹�췽��
        System.out.println("before testAbstract()");
        testAbstract();//��������˳��󷽷����������า�ǵķ������������Atest���testAbstract��������
        System.out.println("after testAbstarcat()");
    }

    public static void main(String args[]) {
        new Atest();
    }
}

class Atest extends Demo70 {
    private int i = 1;//��2��ʹ��Ա�������г�ʼ��

    void testAbstract() {
        System.out.println("testAbstract()" + i);
    }

    public Atest() {//��3���������๹�췽��
        System.out.println(i);
    }
}









