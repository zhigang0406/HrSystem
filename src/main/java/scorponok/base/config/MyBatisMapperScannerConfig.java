package scorponok.base.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
 * 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
 */
@AutoConfigureAfter(MyBatisConfig.class)
@MapperScan(basePackages = "com.scorponok.base.mapper", sqlSessionTemplateRef = "sqlSessionTemplate")
public class MyBatisMapperScannerConfig {

}