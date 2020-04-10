package com.cdsxt.ego.rpc.provide;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) {
        /**
         * 加载spring容器时，需要执行的配置文件，从而完成服务的发布
         */
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
                "spring/applicationContext-dao.xml",
                "spring/applicationContext-dubbo.xml",
                "spring/applicationContext-service.xml",
                "spring/applicationContext-tx.xml"
        );
        //启动容器
        ac.start();
        //阻塞程序的运行
        try {
            System.in.read();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        //关闭容器
        ac.stop();
    }
}
