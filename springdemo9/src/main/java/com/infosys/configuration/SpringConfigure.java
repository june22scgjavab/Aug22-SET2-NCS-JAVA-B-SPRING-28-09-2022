package com.infosys.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.infosys.controller com.infosys.service com.infosys.repository")
public class SpringConfigure {
}
