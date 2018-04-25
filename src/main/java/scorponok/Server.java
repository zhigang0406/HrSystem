package scorponok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableTransactionManagement
@SpringBootApplication
@EnableAutoConfiguration
@EnableSwagger2
@ServletComponentScan
@EnableConfigurationProperties
@EnableScheduling
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }

    
//    @Bean
//    public EmbeddedServletContainerFactory servletContainer() {
//        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint constraint = new SecurityConstraint();
//                constraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection collection = new SecurityCollection();
//                collection.addPattern("/*");
//                constraint.addCollection(collection);
//                context.addConstraint(constraint);
//            }
//        };
//        tomcat.addAdditionalTomcatConnectors(httpConnector());
//        return tomcat;
//    }
//
//    @Bean
//    public Connector httpConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        //Connector监听的http的端口号
//        connector.setPort(80);
//        connector.setSecure(false);
//        //监听到http的端口号后转向到的https的端口号
//        connector.setRedirectPort(443);
//        return connector;
//        
//    }

   
}
