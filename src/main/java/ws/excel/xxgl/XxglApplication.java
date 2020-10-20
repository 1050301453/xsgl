package ws.excel.xxgl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages={"ws.excel"})
@SpringBootApplication
public class XxglApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxglApplication.class, args);
    }

}
