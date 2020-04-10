package com.cdsxt.ego.beans;


import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FtpUtil {
    public static void main(String [] args) throws Exception {
        String hostname = "192.168.40.128";// 192.168.40.128
        int port  = 21;
        String username = "ftpuser";
        String password = "ftp";
        String pathname = "/home/ftpuser/ego/images";
        File f = new File("D:\\tools\\wpcache\\beautifullgirl\\15.jpg");
        String remote = "123.jpg";
        uploadFile(hostname,port,username,password,pathname,f,remote);
    }
    public static boolean uploadFile(String hostname, int port,String username,String password,
                String pathname,File f,String remote) throws Exception {
        FTPClient ftp = new FTPClient();
        ftp.enterLocalPassiveMode();
        ftp.connect(hostname, port);
        ftp.login(username,password);
        ftp.setFileType(FTP.BINARY_FILE_TYPE);
        //5、切换工作目录，文件上传后保存在哪个目录中
        //ftp是利用changeWorkingDirectory()方法来代理linux中cd命令
        if(!ftp.changeWorkingDirectory(pathname)) {
            if(ftp.makeDirectory(pathname)) {
                ftp.changeWorkingDirectory(pathname);
            }
        }

        System.out.println(f.exists());
        boolean result = ftp.storeFile(remote,new FileInputStream(f));
        System.out.println(result);// 这儿 是 false
        ftp.logout();
        return false;
    }

}
