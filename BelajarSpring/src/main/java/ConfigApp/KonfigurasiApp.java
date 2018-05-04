package ConfigApp;

import all.Perpustakaan;

import javax.sql.DataSource;
import java.awt.print.Book;
import java.util.Properties;

@Configuration
@ComponentScan(basePackage = {"java.all"})
@EnableTransactionManagement

public class KonfigurasiApp {
    @Autowired
    private Environment env;

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(dataSource());

        Properties props = new Properties();
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.dialect", "org.hibernate.dialect.SQLServerDialect");
        props.put("hibernate.hbm2ddl.auto", "update");

        factoryBean.setHibernateProperties(props);
        factoryBean.setAnnotatedClasses(Book.class, Perpustakaan.class);
        return factoryBean;
    }

    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://localhost;databaseName=JDBC_SHINTA");
        dataSource.setUsername("sa");
        dataSource.setPassword("admin123");

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }

    @Bean
    public NamedParameterJdbcTemplate nameJdbcTemplate() {
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource());
        return jdbcTemplate;
    }

}
