import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());

        Cat beanCat1 = applicationContext.getBean(Cat.class);
        Cat beanCat2 = applicationContext.getBean(Cat.class);
        System.out.println(beanCat1.getName());
        System.out.println(beanCat2.getName());

        System.out.println(bean==bean2);
        System.out.println(beanCat1==beanCat2);


    }
}