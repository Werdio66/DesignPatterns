package com._520.decorator;

/**
 *  当需要加多种调味品时，只需要用装饰器类包装单品咖啡
 */
public class Client {

    public static void main(String[] args) {

        // 单点美式咖啡
        Drick drick = new LongBlack();
        System.out.println(drick.getCoust());
        // 加巧克力的美式咖啡
        drick = new Chocolate(drick);
        System.out.println(drick.getCoust());
    }
}
