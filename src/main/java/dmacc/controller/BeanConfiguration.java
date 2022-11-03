/**
 * @author gabel - glanphier
 * CIS175 - Fall 2022
 * Nov 3, 2022
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Book;

/**
 * @author gabel
 *
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Book book() {
		Book bean = new Book("Cat in the Hat");
		return bean;
	}

}
