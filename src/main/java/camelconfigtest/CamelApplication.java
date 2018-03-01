package camelconfigtest;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelApplication extends RouteBuilder{

    public static void main(String[] args) {
        SpringApplication.run(CamelApplication.class, args);

    }

    @Override
    public void configure() throws Exception {
        from("jetty:http://localhost:8888/wsbla/").to("http4://localhost:8080/ws?bridgeEndpoint=true");
    }
}
