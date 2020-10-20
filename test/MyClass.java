package cn.qianfeng.test;
//一个线程类
public class MyClass extends Thread {
        //属性
        private String name;

        public MyClass(String name) {
            this.name = name;
        }

    //线程启动时执行的代码
        @Override
        public void run() {
            while (!(Dome01.UID == 0)){
                Dome01.UID--;
                System.out.println(name+"线程程序"+Dome01.UID);
            }
        }
}
