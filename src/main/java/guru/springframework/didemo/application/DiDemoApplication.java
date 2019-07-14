package guru.springframework.didemo.application;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import guru.springframework.didemo.examplebeans.SampleDataSource;
import guru.springframework.didemo.examplebeans.SampleJmsSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework.didemo"})
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("helloController");
        //controller.hello();

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        SampleDataSource ds =  ctx.getBean(SampleDataSource.class);
        System.out.println("DS url:"+ ds.getDburl());
        System.out.println("DS user name:"+ ds.getUserName());

        SampleJmsSource qs =  ctx.getBean(SampleJmsSource.class);
        System.out.println("JMS url:"+ qs.getqUrl());
        System.out.println("JMS user name:"+ qs.getQuserName());
    }

}
