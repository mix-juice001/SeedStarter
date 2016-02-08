package seedsstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import seedsstarter.infrastructure.DateFormatter;
import seedsstarter.infrastructure.VarietyFormatter;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Configuration
	protected static class ThymeleafViewFormattingConversionConfiguration {
		@Bean
		@ConditionalOnClass(ThymeleafViewResolver.class)
		public FormattingConversionServiceFactoryBean conversionService() {
			FormattingConversionServiceFactoryBean cs = new FormattingConversionServiceFactoryBean();
			Set<Formatter> formatters = new HashSet<Formatter>();
			formatters.add(dateFormatter());
//			formatters.add(varietyFormatter());
			cs.setFormatters(formatters);
			return cs;
		}
		@Bean
		public DateFormatter dateFormatter() {
			return new DateFormatter();
		}
		@Bean
		public VarietyFormatter varietyFormatter() {
			return new VarietyFormatter();
		}
	}
}
