package com.ipmotor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import com.ipmotor.hello.HelloSpring;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(
          new ClassPathResource("application-context.xml"));

      HelloSpring hello = (HelloSpring) factory.getBean("hello");
      hello.greet();
    }
}
