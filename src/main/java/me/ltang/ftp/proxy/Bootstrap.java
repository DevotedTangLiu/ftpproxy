package me.ltang.ftp.proxy;

import java.io.File;
import java.io.IOException;

/**
 * @author tangliu
 */
public class Bootstrap {

    private static final String ENGINE_PATH = System.getProperty("proxy.base", new File(Bootstrap.class.getProtectionDomain().getCodeSource().getLocation().getFile()).getParent());

    static {
        System.setProperty("proxy.base", ENGINE_PATH);
        System.out.println("proxy.base= " + ENGINE_PATH);
    }

    public static void main(String[] args) throws IOException {

        SocksProxy socksProxy = new SocksProxy();
        socksProxy.start();

        FtpProxy.main(args);
    }
}
