package me.ltang.ftp.proxy;

import org.slf4j.Logger;

/**
 * @author tangliu
 */
public class LogUtils {

    Logger logger;

    public LogUtils(Logger logger) {
        this.logger = logger;
    }

    public void println(String info) {
        logger.info(info);
    }

    public void error(Throwable e) {
        logger.error(e.getMessage(), e);
    }

    public void error(String msg, Throwable e) {
        logger.error(msg, e);
    }
}
