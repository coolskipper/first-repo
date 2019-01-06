package com.demo.h2.app.h2app.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.demo.h2.app.h2app.controller.ProductController;
import com.demo.h2.app.h2app.controller.StoreController;

@Component
@ApplicationPath("/h2appp")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {

		registerClasses(StoreController.class);
		registerClasses(ProductController.class);
	}
}
