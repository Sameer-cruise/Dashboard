package com.tcs.configurations;

import oracle.jdbc.pool.OracleDataSource;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;
import java.sql.SQLException;

/**
 * Created by 547885 on 10/10/2015.
 */
public class OracleConfigurations {

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String url;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Bean
    DataSource dataSource() throws SQLException {

        OracleDataSource dataSource=new OracleDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setURL(url);
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        System.out.println("The database limit is:"+dataSource.getLoginTimeout());
        return dataSource;
    }

}
