package me.ltang.ftp.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sockslib.common.methods.NoAuthenticationRequiredMethod;
import sockslib.server.SocksProxyServer;
import sockslib.server.SocksServerBuilder;
import sockslib.server.listener.LoggingListener;

import java.io.IOException;

/**
 * @author tangliu
 */
public class SocksProxy {

    Logger logger = LoggerFactory.getLogger(SocksProxy.class);

    private SocksProxyServer server;

    public void start(Integer port) throws IOException {

        SocksServerBuilder builder = SocksServerBuilder.newSocks5ServerBuilder();
        builder.setBindPort(port);
        builder.setSocksMethods(new NoAuthenticationRequiredMethod());

        server = builder.build();

        final SocksProxyServer finalServer = server;
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            if (finalServer != null) {
                finalServer.shutdown();
            }
            logger.info("Socks5 Server Shutdown");
        }));

        server.getSessionManager().addSessionListener("logger", new LoggingListener());
        server.start();
    }

    public void start() throws IOException {
        start(1080);
    }
}
