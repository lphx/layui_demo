package layui.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "layui.demo.dao")
public class LayuidemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LayuidemoApplication.class, args);
    }

}
