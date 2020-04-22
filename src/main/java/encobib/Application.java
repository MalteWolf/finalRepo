package encobib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "me.ramswaroop.jbot", "encobib" })
public class Application extends SpringBootServletInitializer {

    //    @Bean
    //    @ConditionalOnProperty(name = "repositoryType", havingValue = "db")
    //    BooksRepositoryImpl booksRepositoryImpl(PostGreSQLBooksRepo postGreSQLBooksRepo, PostGreSqlLendingPeriodsRepository postGreSqlLendingPeriodsRepository) {
    //        return new BooksRepositoryImpl(postGreSQLBooksRepo, postGreSqlLendingPeriodsRepository);
    //    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
