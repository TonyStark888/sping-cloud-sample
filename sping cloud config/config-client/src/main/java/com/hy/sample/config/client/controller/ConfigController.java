package com.hy.sample.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

	@Value("${foo}")
	private String profile;
	
	@GetMapping("/foo")
	public String getProfile() {
		return profile;
	}
}
