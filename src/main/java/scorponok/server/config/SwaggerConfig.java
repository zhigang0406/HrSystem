package scorponok.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration @EnableSwagger2 public class SwaggerConfig {
	@Bean public Docket demoApi() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2).groupName("树人借条后端接口").genericModelSubstitutes(DeferredResult.class)
				.useDefaultResponseMessages(false).forCodeGeneration(false).pathMapping("/").select().build().apiInfo(apiInfo());
		return docket;
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("撒克巨人", // 大标题
				"api文档", // 小标题
				"1.0.0-SNAPSHOT", // 版本
				"for all platform", new Contact("沈德华,沈大炮", "无链接", "574091983@qq.com,404150842@qq.com"), // 作者
				"protected", // 链接显示文字
				"无连接"// 网站链接
		);
		return apiInfo;
	}
}
