package com.revature.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, DisposableBean,
		BeanPostProcessor, InitializingBean {

	private String beanName;
	
	@Value("pickles")
	private String secret;
	
	public LifeCycleBean() {
		super();
		System.out.println("Instantiate: LifeCycleBean");
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
		System.out.println("Populating properties for secret: " + secret);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("After properties set in " + beanName);

	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("Before Initialization");
		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}



	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside After Initialization in " + beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}



	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy of " + beanName);
	}

	public void myCustomDestroy(){
		System.out.println("Inside custom destroy of " + beanName);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application Context being set to: " + applicationContext);
		System.out.println("In bean " + beanName);
	}

	@Override
	public void setBeanName(String name) {

		this.beanName = name;
		System.out.println("Bean name being set to " + name);
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory being set to: " + beanFactory);
		System.out.println("In bean " + beanName);
	}

	public void myCustomInit(){
		System.out.println("Inside my custom init method");
	}
	
}
