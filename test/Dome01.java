package cn.qianfeng.test;

/**
 * 1. 创建一个线程类？ 直接继承Thread类
 * 2. 将需要线程单独执行的代码放入 run()方法中
 * 3. 如何启动线程？  .start()启动
 *
 * 1.解决问题：
 *  1.1 操作的数据如果赋值 数据会错误
 *  1.2 多线程启动注意，不要直接调用run方法
 *
 * 2. 线程启动的方式：
 *  2.1 继承 Thread类  ，设计多个类，new 多个对象
 *  2.2 继承 Thread类 ,设计一个类，new多个对象
 *  2.3 实现 Runnable 接口 ，创建对象
 */
public class Dome01  {
    public static long UID = 100;
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass("小刘的");
        MyClass myClass2 = new MyClass("老许的");
        MyClass myClass3 = new MyClass("小姚的");
        //直接使用主函数的线程
        myClass1.run();
        myClass2.run();
        myClass3.run();
        //主函数中衍射出3个新的线程
        myClass1.start();
        myClass2.start();
        myClass3.start();
    }
}
