package net.iskandar.for_binadox.chat.server;

import java.util.Properties;

import javax.sql.DataSource;

import net.iskandar.for_binadox.chat.server.service.ChatService;
import net.iskandar.for_binadox.chat.server.service.impl.ChatServiceHibernateImpl;
import net.iskandar.for_binadox.chat.server.service.impl.ChatServiceJpaImpl;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@Configuration
@ImportResource("/WEB-INF/jpa.xml")
public class AppConfig {

	@Bean
	public ChatService chatService() {
		ChatServiceJpaImpl chatService = new ChatServiceJpaImpl();
		return chatService;
	}

	@Bean
	public ChatFacadeImpl chatFacade() {
		ChatFacadeImpl chatFacadeImpl = new ChatFacadeImpl();
		chatFacadeImpl.setChatService(chatService());
		return chatFacadeImpl;
	}

}
