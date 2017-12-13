package com.spring.study.spring4;

import com.spring.study.spring3.domain.Pen;
import com.spring.study.spring4.domain.Tree;
import com.spring.study.spring4.mylistener.MyApplicationEvent;
import com.spring.study.spring4.mylistener.MyApplicationEventListener;
import com.spring.study.spring4.treeservice.PlatTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 依赖spring3项目，自动配置spring3里面的bean
 * 在spring3  的resource目录下新建 META-INF/spring.factories 文件
 * 在spring.factories里面配置上需要自动扫描的配置文件
 * 然后在spring4中就可以自动吧spring3里面的bean  注入到spring4中的容器里了
 * Created by Administrator on 2017/12/5.
 */
@SpringBootApplication
public class Spring4App {
    public static void main(String args[]){
        SpringApplication springApplication = new SpringApplication(Spring4App.class);
        ConfigurableApplicationContext context =springApplication.run(args);
        PlatTreeService service = context.getBean(PlatTreeService.class);
        //事件例子
        service.platTree();
        service.platTree();
        service.platTree();
        service.platTree();
        service.platTree();
        service.platTree();
        service.platTree();
        System.out.println("--------------"+context.getBean("bookMark"));
    }
}
