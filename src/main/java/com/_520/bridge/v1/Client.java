package com._520.bridge.v1;

/**
 *  普通的方式
 *  每增加一个新的手机类型，比如直板，就需要增加对应数量的品牌手机，会导致类爆炸
 *
 *                  手机
 *          平板           翻盖     ...
 *       小米 华为       小米 华为   ...
 */
public class Client {

    public static void main(String[] args) {
        HuaWeiOnRight huawei = new HuaWeiOnRight();

    }
}
