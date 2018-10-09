package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.pojo.LifeCycleBean;

@Configuration //this classes only purpose is Spring Bean Configuration
public class LifeCycleConfig {
	
	private LifeCycleBean lifeCycle;
	
	@Bean(initMethod="myCustomInit",
			destroyMethod="myCustomDestroy")
	@Scope("singleton")
	public LifeCycleBean lifeCycle(){
		return new LifeCycleBean();
	}

}
