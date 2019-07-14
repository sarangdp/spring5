package guru.springframework.didemo.config;

import guru.springframework.didemo.examplebeans.SampleDataSource;
import guru.springframework.didemo.examplebeans.SampleJmsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${guru.username}")
    private String user;

    @Value("${guru.password}")
    private String password;

    @Value("${guru.dburl}")
    private String dburl;

    @Value("${guru.jms.quserName}")
    private String jmsUser;
    @Value("${guru.jms.qpassword}")
    private String jmsPassword;
    @Value("${guru.jms.qurl}")
    private String jmsUrl;

    @Autowired
    Environment env;

    @Bean
    public SampleDataSource sampleDataSource(){
        SampleDataSource ds = new SampleDataSource();
        ds.setUserName(env.getProperty("USER_NAME"));
        ds.setPassword(password);
        ds.setDburl(dburl);

        return ds;
    }

    @Bean
    public SampleJmsSource sampleJmsSource(){
        SampleJmsSource ds = new SampleJmsSource();
        ds.setQuserName(jmsUser);
        ds.setQpassword(jmsPassword);
        ds.setqUrl(jmsUrl);

        return ds;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
