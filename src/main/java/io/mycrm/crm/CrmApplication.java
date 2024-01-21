package io.mycrm.crm;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Theme(value = "crm")
public class CrmApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
	}

}
