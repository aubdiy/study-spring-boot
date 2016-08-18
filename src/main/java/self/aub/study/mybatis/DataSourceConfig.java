package self.aub.study.mybatis;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "readerDataSource")
    @ConfigurationProperties(prefix="spring.datasource.reader")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "writerDataSource")
    @ConfigurationProperties(prefix="spring.datasource.writer")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().build();
    }

}