package cn.qianfeng.test;

public class YouClass extends Thread {
    @Override
    public void run() {
        while (!(Dome01.UID == 0)){
            Dome01.UID--;
            System.out.println("你的线程程序"+Dome01.UID);
        }
    }
}
