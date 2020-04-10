package com.cdsxt.ego.beans;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ftp {
    public static void main(String[] args) {
        String hostname = "192.168.40.128";
        int port  = 21;
        String username = "ftpuser";
        String password = "ftp";
        String pathname = "/home/ftpuser/ego/images";
        File f = new File("D:\\tools\\wpcache\\beautifullgirl\\15.jpg");
        String remote = "123.jpg";
        InputStream local = null;


        try {
            FTPClient client = new FTPClient();
            client.connect(hostname,port);
            client.login(username,password);
            boolean a = client.setFileType(FTP.BINARY_FILE_TYPE);
            if(!client.changeWorkingDirectory(pathname)) {
                if(client.makeDirectory(pathname)) {
                    client.changeWorkingDirectory(pathname);
                }
            }
            local = new FileInputStream(f);
            client.enterLocalPassiveMode();
            boolean b = client.storeFile(remote, local);
            System.out.println(b);

            client.logout();
            client.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
