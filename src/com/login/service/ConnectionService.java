package com.login.service;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import com.login.exception.ExceptionCode;
import com.login.exception.LoginException;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionService {

    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
    private static HikariConfig config;
    private static HikariDataSource ds;
    
    static {
        Properties properties = new Properties();

        try {
            InputStream resourceAsStream =
                    ConnectionService.class.getClassLoader().getResourceAsStream("db.properties");
            
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
            }
            config = new HikariConfig(properties);
            ds = new HikariDataSource(config);
            
        } catch (Exception e) {
            throw new LoginException(ExceptionCode.CONNECTION_FAILED);
        } 
    }

    public static void init() {
        
        try {
            threadLocal.set(ds.getConnection());
        } catch (Exception e) {
            throw new LoginException(ExceptionCode.CONNECTION_FAILED);
        }
    }
    
    public static Connection get() {        
        if (threadLocal.get() == null) {
            init();
        }
        return threadLocal.get();
    }
    
    public static void release() {
        
        try {
            threadLocal.get().close();
            threadLocal.remove();
        } catch (Exception e) {
            throw new LoginException(ExceptionCode.CONNECTION_FAILED_TO_CLOSE);
        }
    }

    public static void commit(boolean select) {
        
        try {
            
            if (select) {
                threadLocal.get().commit();
            } else {
                threadLocal.get().rollback();
            }
            
        } catch (Exception e) {
            throw new LoginException(ExceptionCode.FAILED_TO_COMMIT_OR_ROLLBACK);
        }
    }
}
